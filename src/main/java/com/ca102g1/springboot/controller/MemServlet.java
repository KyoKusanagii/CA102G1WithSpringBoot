package com.ca102g1.springboot.controller;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;

import javax.imageio.ImageIO;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import com.member.model.*;
import com.randomNewItem.model.RandomItemService;

import redis.clients.jedis.Jedis;

import com.chat.model.ChatService;
import com.mail.model.*;

@MultipartConfig()
@WebServlet("/FrontEnd/member/member.do")
public class MemServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		doPost(req, res);
		
		
		req.setCharacterEncoding("UTF-8");
	    res.setContentType("text/html; charset=UTF-8");
		String action = req.getParameter("action");
		//�n�X�}�l
		HttpSession session = req.getSession();
	    
		if("logout".equals(action)) {
			session.removeAttribute("memVO"); //code inserted by Amber
			session.removeAttribute("shoppingCart");
			res.sendRedirect(req.getContextPath()+"/FrontEnd/index.jsp");
		}
		//�n�X����
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
	    res.setContentType("text/html; charset=UTF-8");
		String action = req.getParameter("action");
		PrintWriter out = res.getWriter();
		
		
		// 8/7 Hugh �|�����U��s��
		if ("signup".equals(action)) {
			
			Map<String,String> errorMsgs = new LinkedHashMap<String,String>();
			req.setAttribute("errorMsgs", errorMsgs);

			try {
				/***********************1.�����ШD�Ѽ� - ��J�榡�����~�B�z*************************/
				String mem_id = req.getParameter("mem_id");
				String mem_idReg = "^[a-zA-Z0-9_]{3,10}$";
				MemDAO dao = new MemDAO();
				MemVO memCheckVO = dao.checkID(mem_id);
				if (mem_id == null || mem_id.trim().length() == 0) {
					errorMsgs.put("mem_id","�b��: �ФŪť�");
				} else if(!mem_id.trim().matches(mem_idReg)) { //�H�U�m�ߥ��h(�W)��ܦ�(regular-expression)
					errorMsgs.put("mem_id","�b��: �u��O�^��r���B�Ʀr�M_ , �B���ץ��ݦb3��10����");
	            } else if (memCheckVO != null) {
					errorMsgs.put("mem_id","���b���w�Q���U�L�A�Э��s���U��L�b��");
				}
				
				
				String mem_name1 = req.getParameter("mem_name");
				byte[] ms950Bytes = mem_name1.getBytes("MS950"); 
				String mem_name = new String(ms950Bytes, "MS950");
				if (mem_name == null || mem_name.trim().length() == 0) {
					errorMsgs.put("mem_name","�m�W�ФŪť�");
				}
				
				
				String mem_email = req.getParameter("mem_email").trim();
				String mem_emailReg = "[a-zA-Z0-9._%-]+@[a-zA-Z0-9._%-]+.[a-zA-Z]{2,4}";
				if (mem_email == null || mem_email.trim().length() == 0) {
					errorMsgs.put("mem_email","�H�c�ФŪť�");
				} else if(!mem_email.trim().matches(mem_emailReg)) { //�H�U�m�ߥ��h(�W)��ܦ�(regular-expression)
					errorMsgs.put("mem_email","�H�c�����ŦX'xxx@xxx.xxx'���榡");
	            }

				
//				String mem_psw = req.getParameter("mem_psw").trim();
//				String check_password = req.getParameter("check_password").trim();
//				if (mem_psw == null || mem_psw.trim().length() == 0) {
//					errorMsgs.put("mem_psw","�K�X: �K�X�ФŪť�");
//				} else if (check_password == null || check_password.trim().length() == 0) {
//					errorMsgs.put("check_password","�T�{�K�X: �T�{�K�X�ФŪť�");
//				} else if (!check_password.equals(mem_psw)) {
//					errorMsgs.put("check_password","�T�{�K�X: �⦸��J���K�X���ۦP�A�нT�{�O�_�ۦP");
//				}
				
				// 8/7�ק�
				// �۰ʲ��ͶüƱK�X
				String mem_psw = null;
				int count = 0;
				do
				{
					int random = (int)(Math.random()*75 + 48);
					if(random<58 || (random>=65&&random<91) || random>96)
					{
						if(count == 0) {
							mem_psw = String.valueOf((char)random);
							count++;
						}
						else {
							String psw = mem_psw;
							mem_psw = psw + String.valueOf((char)random);
							count++;
						}
					}
				}while(count<8);
			
				
				// �����s�|���w�]�j�Y�K
				@SuppressWarnings("deprecation")
				File profilepic = new File(req.getRealPath("/FrontEnd/images/NewMember/member_pic.png"));
				BufferedImage profilepicImage = ImageIO.read(profilepic);
				ByteArrayOutputStream profilepicBaos = new ByteArrayOutputStream();
				ImageIO.write(profilepicImage, "png", profilepicBaos);
				profilepicBaos.flush();
				byte[] mem_profilepic = profilepicBaos.toByteArray();
				profilepicBaos.close();
				
				
				// �����s�|���w�]����ʭ�
				@SuppressWarnings("deprecation")
				File martcover = new File(req.getRealPath("/FrontEnd/images/NewMember/mart_pic.png"));
				BufferedImage martcoverImage = ImageIO.read(martcover);
				ByteArrayOutputStream martcoverBaos = new ByteArrayOutputStream();
				ImageIO.write(martcoverImage, "png", martcoverBaos);
				martcoverBaos.flush();
				byte[] mem_martcover = martcoverBaos.toByteArray();
				martcoverBaos.close();
				
				//�s���U�|���]��VO
				MemVO memVO = new MemVO();
				memVO.setMem_id(mem_id);
				memVO.setMem_psw(mem_psw);
				memVO.setMem_email(mem_email);
				memVO.setMem_profilepic(mem_profilepic);
				memVO.setMem_martcover(mem_martcover);
		

				// �p�G�S�����~�N���|�i��U�����P�_��
				if (!errorMsgs.isEmpty()) {
					req.setAttribute("memVO", memVO); // �t����J�榡���~��memVO����,�]�s�Jreq
					RequestDispatcher failureView = req
							.getRequestDispatcher("/FrontEnd/member/signup.jsp");
					failureView.forward(req, res);
					return;
				}
				
				
				//�H���������ҽX�s��Redis ( mem_id ���� mem_activecode )
				Jedis jedis = new Jedis("localhost", 6379);
				String mem_activecode = UUID.randomUUID().toString().replace( "-" , "" );
				jedis.set(mem_id, mem_activecode);
				jedis.expire(mem_id, 30);
				jedis.close();
						
				
				
				/***************************2.�}�l�s�W���***************************************/
				//�t�Φ۰ʥͦ��H��(MailService.java)
				//�H�c�D��
				String subjectMS950 = "InstaBuy signup successfully !";
				byte[] utf8Bytes = subjectMS950.getBytes("UTF-8"); 
				String subject = new String(utf8Bytes, "UTF-8");
				
				//�H�c���e--���ѱK�X�����ҽX�s��
				String messageText =
						"�˷R��\t" + mem_id + "�A�z�w��InstaBuy���U�����I<br>" + 
						"InstaBuy���z���Ѫ��K�X���G " + mem_psw + "<br>" + 
						"<a href='" + 
							req.getRequestURL() + "?action=active" + 
							"&mem_activecode=" + mem_activecode + 
							"&mem_id=" + mem_id +
							"&mem_email=" + mem_email +
							"\'>�I�ڱҰ�InstaBuy�b��"+ 
						"</a><br>" + 
						"���ԷV�ϥΡI";
						//�s���|�ɦVMemServlet.java(if ("active".equals(action)))
				
				//�إ�MailService
				MailService mailSvc = new MailService();
				System.out.println("�H�c�A��OK");
				
				//�t�αH�H
				mailSvc.sendMail(mem_email, subject, messageText);
				System.out.println("�t�Τw���\�H�H");
				
				//�s�|�����U
				MemService memSvc = new MemService();
				memVO = memSvc.signup(
						mem_id,
						mem_name,
						mem_psw, 
						mem_email,
						mem_profilepic, 
						mem_martcover
				);
				
				ChatService chatSvc = new ChatService();
				chatSvc.addFrined(memSvc.findNewestMember(), "E00000");

				/***************************3.�s�W����,�ǳ����(Send the Success view)***********/
				String url = "/FrontEnd/member/signupSuccess.jsp";
				res.sendRedirect(req.getContextPath()+url);
				
			/***************************��L�i�઺���~�B�z**********************************/
			} catch (Exception e) {
				errorMsgs.put("Exception",e.getMessage());
				RequestDispatcher failureView = req.getRequestDispatcher("/FrontEnd/member/signup.jsp");
				failureView.forward(req, res);
			}
		}
		
		
		// 8/8 Hugh �H�c����(���ҽX�sredis)
		if ("active".equals(action)) {
		/***************************1.�����ШD�Ѽ�*****************************************/
			Jedis jedis = new Jedis("localhost", 6379);
			String mem_activecode = req.getParameter("mem_activecode");
			String mem_id = req.getParameter("mem_id");
			String mem_email = req.getParameter("mem_email");
			String tempAuth = jedis.get(mem_id);
			if (tempAuth == null) {
				//���s�������ҽX
				mem_activecode = UUID.randomUUID().toString().replace( "-" , "" );
				jedis.set(mem_id, mem_activecode);
				jedis.expire(mem_id, 120);
				jedis.close();

				//�t�Φ۰ʥͦ��H��(MailService.java)
				//�H�c�D��
				String subjectMS950 = "InstaBuy���U���\�q���H";
				byte[] utf8Bytes = subjectMS950.getBytes("UTF-8"); 
				String subject = new String(utf8Bytes, "UTF-8");
				
				//�H�c���e--���ѷs���ҽX�s��
				String messageText =
						"�˷R��\t" + mem_id + "\t�z�n<br>" + 
						"InstaBuy�t�Τw���z�إ߷s�����ҳs��<br>" +  
						"<a href='" + 
							req.getRequestURL() + "?action=active" + 
							"&mem_activecode=" + mem_activecode + 
							"&mem_id=" + mem_id +
							"&mem_email=" + mem_email +
							"\'>�I�ڱҰ�InstaBuy�b��"+ 
						"</a>";
						//�s���|�ɦVMemServlet.java(if ("active".equals(action)))
				
				//�إ�MailService
				MailService mailSvc = new MailService();
				
				//�t�αH�H
				mailSvc.sendMail(mem_email, subject, messageText);
				System.out.println("�t�Τw���\�H�H");
				
				/*****************************�H�H����,�ǳ����(Send the Success view)***********/
				String url = "/FrontEnd/member/activeLate.jsp";
				res.sendRedirect(req.getContextPath()+url);
				
			}
			else if (mem_activecode.equals(tempAuth)){
				System.out.println("���Ҧ��\!");
				MemVO memVO = new MemVO();
				memVO.setMem_id(mem_id);
				
				/***************************2.�}�l�ק���*****************************************/
				MemService memSvc = new MemService();
				memVO = memSvc.activeMem(mem_id);
				
				/***************************3.�ק粒��,�ǳ����*************************************/
				String url = "/FrontEnd/member/activeSuccess.jsp";
				res.sendRedirect(req.getContextPath()+url);
				System.out.println("�E�����\");
				jedis.close();
			} 
			
		}
		
		
		//�׿A�@��|���n�J
		if("login".equals(action)) {
			  
			// �i���o�ϥΪ� �b��(account) �K�X(password)�j
			String mem_id = req.getParameter("mem_id");
			String mem_psw = req.getParameter("mem_psw");
			Map<String, String> errorMsgs = new HashMap<String,String>();
			
			// �i�ˬd�ӱb�� , �K�X�O�_���ġj
			MemVO memVO = allowUser(mem_id,mem_psw);
			if (memVO == null) {          //�i�b�� , �K�X�L�Įɡj
				errorMsgs.put("mem_id","�b���αK�X���~�I�Э��s��J");
				req.setAttribute("errorMsgs", errorMsgs);
				String url = "/FrontEnd/member/login.jsp";
				RequestDispatcher rd = req.getRequestDispatcher(url);
				rd.forward(req,res);
				
			}else if(memVO.getMem_condition()==0) {
				errorMsgs.put("mem_id","�H�c���ҥ��q�L�I�ЦܫH�c�I�����ҳs��");
				req.setAttribute("errorMsgs", errorMsgs);
				String url = "/FrontEnd/member/login.jsp";
				RequestDispatcher rd = req.getRequestDispatcher(url);
				rd.forward(req,res);
				
			}else {  
			     //�i�b�� , �K�X���Į�, �~���H�U�u�@�j
				HttpSession session = req.getSession();
				String mem_Id = memVO.getMem_id();
				String session_id = session.getId();
				session.setAttribute(session_id, mem_Id);  //*�u�@1: �~�bsession�����w�g�n�J�L������
				session.setAttribute("login_state",true);  //�|���n�J�����A��true
				session.setAttribute("memVO", memVO);  //session�]�۷|����ƨ�
				
				
				/* 8/16 �qMemVO�h�L�� */
				RandomItemService riSvc = new RandomItemService();
				int random = (1 + (int)Math.random()*6);
		        session.setAttribute("preference", riSvc.getRandomFiveItemsByCategory(random));
		        session.setAttribute("CLOTH_CNTS", 0);
		        session.setAttribute("FOOD_CNTS", 0);
		        session.setAttribute("GAME_CNTS", 0);
		        session.setAttribute("OUTDOOR_CNTS", 0);
		        session.setAttribute("HOMEELEC_CNTS", 0);
		        session.setAttribute("THREEC_CNTS", 0);
		        
				
		        
		        
		        
				try {                                                        
					String location = (String) session.getAttribute("location");
					if (location != null) {
						session.removeAttribute("location");   //*�u�@2: �ݬݦ��L�ӷ����� (-->�p���ӷ�����:�h���ɦܨӷ�����)
						res.sendRedirect(location);   
						return;
					}
				}catch (Exception ignored) {
				}
				res.sendRedirect(req.getContextPath()+"/FrontEnd/index.jsp");  //*�u�@3: (-->�p�L�ӷ�����:�h���ɦܭ���)
			}
		}
		
		
		// 8/7 �|���ۤv�ק�|�����
		  if ("updateMem".equals(action)) { 
			  Map<String,String> errorMsgs = new LinkedHashMap<String,String>();
				req.setAttribute("errorMsgs", errorMsgs);
				byte[] mem_profilepic = null;
				ByteArrayOutputStream baos=null;

				try {
					/***************************1.�����ШD�Ѽ� - ��J�榡�����~�B�z**********************/
					
					HttpSession session = req.getSession();
					MemVO memVO = (MemVO)session.getAttribute("memVO");
					String mem_no ="";
					if(memVO != null) {
						mem_no = memVO.getMem_no();
					}

					String mem_name = req.getParameter("mem_name").trim();

					if (mem_name == null || mem_name.trim().length() == 0) {
						errorMsgs.put("name","�|���m�W�ФŪť�");
					}				

					String mem_email = req.getParameter("mem_email").trim();
					String mem_emailReg = "[a-zA-Z0-9._%-]+@[a-zA-Z0-9._%-]+.[a-zA-Z]{2,4}";
					if (mem_email == null || mem_email.trim().length() == 0) {
						errorMsgs.put("email","�H�c�ФŪť�");
					} else if(!mem_email.trim().matches(mem_emailReg)) { //�H�U�m�ߥ��h(�W)��ܦ�(regular-expression)
						errorMsgs.put("email","�H�c�����ŦX'xxx@xxx.xxx'���榡");
		            }

					String mem_mobile = req.getParameter("mem_mobile").trim();
					String mem_PhoneReg = "^(0)(9)([0-9]{8})$";
					if (mem_mobile == null || mem_mobile.trim().length() == 0) {
						errorMsgs.put("mobile","�|������ФŪť�");
					} 
					else if(!(mem_mobile.trim()).matches(mem_PhoneReg)) { //�H�U�m�ߥ��h(�W)��ܦ�(regular-expression)
						errorMsgs.put("mobile","�ݬ�09�}�Y, �B���ץ���10�X���Ʀr");
		            }

					String mem_sex = req.getParameter("mem_sex");

					String mem_post = req.getParameter("mem_post");
					if(mem_post != null) {
						if(mem_post.length() != 3) {
							errorMsgs.put("post","�l���ϸ��u�ର�T�X");
						}
					}
					String mem_address = req.getParameter("mem_address");

					
					java.sql.Date mem_birth = null; 				
					try {
						mem_birth = java.sql.Date.valueOf(req.getParameter("mem_birth").trim());
					    } catch (IllegalArgumentException e) {
					    mem_birth = null;
					    }
					
					Part mem_photo = req.getPart("mem_profilepic");
					String fileName = getFileNameFromPart(mem_photo);
					String fileMimeType = getServletContext().getMimeType(fileName);
					
					List<String> mimeTypeList = new ArrayList<>();
					mimeTypeList.add("image/jpeg");
					mimeTypeList.add("image/bmp");
					mimeTypeList.add("image/png");
					mimeTypeList.add("image/gif");
					if(mem_photo.getSize() == 0) {
						if(getFileNameFromPart(mem_photo) == null) {
							MemService memSvc = new MemService();
							MemVO memVO_old = memSvc.findByPK(mem_no);
							mem_profilepic = memVO_old.getMem_profilepic();
							System.out.println("���¹�");
						}
						
					}else if( mimeTypeList.indexOf(fileMimeType) < 0 ) {
						errorMsgs.put("photo","�Ϥ��榡����(.jpg/jpeg/bmp/gif/png)�C");
					}
					
					
					
					memVO.setMem_name(mem_name);
					memVO.setMem_email(mem_email);
					memVO.setMem_mobile(mem_mobile);
					memVO.setMem_sex(mem_sex);
					memVO.setMem_post(mem_post);
					memVO.setMem_address(mem_address);
					memVO.setMem_birth(mem_birth);
					memVO.setMem_profilepic(mem_profilepic);
					
					if (!errorMsgs.isEmpty()) {
						req.setAttribute("memVO", memVO); // �t����J�榡���~��VO����,�]�s�Jreq
						System.out.println("�ק異��");	
						
						RequestDispatcher failureView = req
								.getRequestDispatcher("/FrontEnd/member/updateProfile.jsp");
						failureView.forward(req, res);
						return; //�{�����_
						
					}
					
					/***************************2.�}�l�ק���*****************************************/
				
					if(getFileNameFromPart(mem_photo) != null) {
						InputStream is = mem_photo.getInputStream();
						baos = new ByteArrayOutputStream();
						byte[] buf = new byte[is.available()];
						
						int len = 0 ;
						while((len = is.read(buf))!=-1) {
							baos.write(buf,0,len);
						}
						baos.close();
						is.close();
						
						mem_profilepic = baos.toByteArray();
						
						//�N�ק�Ӥ��᪺encode�g�iVO
						String profilepicEncoded_new = Base64.getEncoder().encodeToString(mem_profilepic);			
						memVO.setProfilepicEncoded(profilepicEncoded_new);
					}
			
					MemService memSvc = new MemService();
					memSvc.updateMem(mem_email, mem_name, mem_mobile, mem_sex, mem_post, mem_address, mem_birth, mem_profilepic, mem_no);

					
					/***************************3.�ק粒��,�ǳ����(Send the Success view)*************/
					session.setAttribute("memVO", memVO); // ��Ʈwupdate���\��,���T����memVO����,�s�Jreq
					
					String url = "/FrontEnd/member/profile.jsp";
					RequestDispatcher successView = req.getRequestDispatcher(url); // �ק令�\��,���listOneEmp.jsp
					successView.forward(req, res);
					System.out.println("�ק令�\");
					/***************************��L�i�઺���~�B�z*************************************/
				} catch (Exception e) {
					errorMsgs.put("Exception",e.getMessage());
					RequestDispatcher failureView = req
							.getRequestDispatcher("/FrontEnd/member/profile.jsp");
					failureView.forward(req, res);
				}
			}

		  
		  
		  
		// 8/7 �|���ק�K�X
		  if ("updatePsw".equals(action)) { // profile.jsp���ШD
	        	System.out.println("�ק�K�X");
	        	Map<String,String> errorMsgs = new LinkedHashMap<String,String>();
				req.setAttribute("errorMsgs", errorMsgs);
				
				try {
					/***************************1.�����ШD�Ѽ� - ��J�榡�����~�B�z**********************/
					
					HttpSession session = req.getSession();
					MemVO memVO = (MemVO)session.getAttribute("memVO");
					String mem_no ="";
					if(memVO != null) {
						mem_no = memVO.getMem_no();
					}

					String mem_psw = req.getParameter("mem_psw").trim();
					String check_password = req.getParameter("check_password").trim();
					if (mem_psw == null || mem_psw.trim().length() == 0) {
						errorMsgs.put("psw","�K�X�ФŪť�");
					} else if (check_password == null || check_password.trim().length() == 0) {
						errorMsgs.put("checkpsw","�T�{�K�X�ФŪť�");
					} else if (!check_password.equals(mem_psw)) {
						errorMsgs.put("checkpsw","�⦸��J���K�X���ۦP�A�нT�{�O�_�ۦP");
					}
					memVO.setMem_psw(mem_psw);
					
					
					if (!errorMsgs.isEmpty()) {
						req.setAttribute("memVO", memVO); // �t����J�榡���~��empVO����,�]�s�Jreq
						System.out.println("�ק異��");	
						
						RequestDispatcher failureView = req
								.getRequestDispatcher("/FrontEnd/member/updatePsw.jsp");
						failureView.forward(req, res);
						return; //�{�����_
						
					}
					
					/***************************2.�}�l�ק���*****************************************/
					
					MemService memSvc = new MemService();
					memSvc.updatePsw(mem_psw, mem_no);

					/***************************3.�ק粒��,�ǳ����(Send the Success view)*************/
					session.removeAttribute("memVO"); // ��Ʈwupdate���\��,���T����memVO����,�s�Jreq
					
					String url = "/FrontEnd/member/login.jsp";
					RequestDispatcher successView = req.getRequestDispatcher(url); // �ק令�\��,���listOneEmp.jsp
					successView.forward(req, res);
					System.out.println("�ק令�\");
					/***************************��L�i�઺���~�B�z*************************************/
				} catch (Exception e) {
					errorMsgs.put("Exception",e.getMessage());
					RequestDispatcher failureView = req
							.getRequestDispatcher("/FrontEnd/member/profile.jsp");
					failureView.forward(req, res);
				}
			}
		  
		  
			// 8/7 �|���ۤv�ק������
		  
		  if ("updateStore".equals(action)) { // profile.jsp���ШD
	        	System.out.println("�ק�");
	        	Map<String,String> errorMsgs = new LinkedHashMap<String,String>();
				// Store this set in the request scope, in case we need to
				// send the ErrorPage view.
				req.setAttribute("errorMsgs", errorMsgs);
				byte[] mem_martcover = null;
				ByteArrayOutputStream baos=null;

				try {
					/***************************1.�����ШD�Ѽ� - ��J�榡�����~�B�z**********************/
					
					HttpSession session = req.getSession();
					MemVO memVO = (MemVO)session.getAttribute("memVO");
					String mem_no ="";
					if(memVO != null) {
						mem_no = memVO.getMem_no();
					}
					System.out.println("mem_no="+mem_no);
					String mem_martname = req.getParameter("mem_martname").trim();
					if (mem_martname == null || mem_martname.trim().length() == 0) {
						errorMsgs.put("martname","����W�ٽФŪť�");
					}	
					System.out.println("mem_martame="+mem_martname);
					String mem_martinfo = req.getParameter("mem_martinfo").trim();
					if (mem_martinfo == null || mem_martinfo.trim().length() == 0) {
						errorMsgs.put("martinfo","���²���ФŪť�");
					}	
			
					
					Part mart_photo = req.getPart("mem_martcover");
					String fileName = getFileNameFromPart(mart_photo);
					String fileMimeType = getServletContext().getMimeType(fileName);
					
					List<String> mimeTypeList = new ArrayList<>();
					mimeTypeList.add("image/jpeg");
					mimeTypeList.add("image/bmp");
					mimeTypeList.add("image/png");
					mimeTypeList.add("image/gif");
					
					if(getFileNameFromPart(mart_photo) == null) {
						MemService memSvc = new MemService();
						MemVO memVO_old = memSvc.findByPK(mem_no);
						mem_martcover = memVO_old.getMem_martcover();
						
					}else if( mimeTypeList.indexOf(fileMimeType) < 0 ) {
						errorMsgs.put("photo","�Ϥ��榡����(.jpg/jpeg/bmp/gif/png)�C");
					}
					
					String mem_activecode = req.getParameter("mem_activecode");
					if(mem_activecode == null || mem_activecode.trim().length() == 0) {
						mem_activecode = null;
					}
			
					
					memVO.setMem_martname(mem_martname);
					memVO.setMem_martinfo(mem_martinfo);
					memVO.setMem_martcover(mem_martcover);
					memVO.setMem_activecode(mem_activecode);
					
					if (!errorMsgs.isEmpty()) {
						req.setAttribute("memVO", memVO); // �t����J�榡���~��VO����,�]�s�Jreq
						System.out.println("�ק異��");	
						
						RequestDispatcher failureView = req
								.getRequestDispatcher("/FrontEnd/member/updateStoreInfo.jsp");
						failureView.forward(req, res);
						return; //�{�����_
						
					}
					
					/***************************2.�}�l�ק���*****************************************/
				
					if(getFileNameFromPart(mart_photo) != null) {
						InputStream is = mart_photo.getInputStream();
						baos = new ByteArrayOutputStream();
						byte[] buf = new byte[is.available()];
						
						int len = 0 ;
						while((len = is.read(buf))!=-1) {
							baos.write(buf,0,len);
						}
						baos.close();
						is.close();
						
						mem_martcover = baos.toByteArray();
						
						//�N�ק�Ӥ��᪺encode�g�iVO
						String martcoverEncoded_new = Base64.getEncoder().encodeToString(mem_martcover);			
						memVO.setMartcoverEncoded(martcoverEncoded_new);
					}
					MemService memSvc = new MemService();
					memSvc.updateStore(mem_martname, mem_martinfo, mem_martcover, mem_activecode, mem_no);


					
					/***************************3.�ק粒��,�ǳ����(Send the Success view)*************/
					session.setAttribute("memVO", memVO); // ��Ʈwupdate���\��,���T����memVO����,�s�Jreq
					
					

					
					String url = "/FrontEnd/member/storeInfo.jsp";
					RequestDispatcher successView = req.getRequestDispatcher(url); // �ק令�\��,���listOneEmp.jsp
					successView.forward(req, res);
					System.out.println("�ק令�\");
					/***************************��L�i�઺���~�B�z*************************************/
				} catch (Exception e) {
					errorMsgs.put("Exception",e.getMessage());
					RequestDispatcher failureView = req
							.getRequestDispatcher("/FrontEnd/member/storeInfo.jsp");
					failureView.forward(req, res);
				}
			}
		  
		  if ("confirmPsw".equals(action)) { 
	        	System.out.println("�T�{�K�X");
	        	Map<String,String> errorMsgs = new LinkedHashMap<String,String>();
				
				req.setAttribute("errorMsgs", errorMsgs);
				
				try {
					/***************************1.�����ШD�Ѽ� - ��J�榡�����~�B�z**********************/
					
					HttpSession session = req.getSession();
					MemVO memVO = (MemVO)session.getAttribute("memVO");
					String mem_no ="";
					if(memVO != null) {
						mem_no = memVO.getMem_no();
					}

					String mem_psw = req.getParameter("mem_psw").trim();
					String check_password = memVO.getMem_psw();
					
					if (mem_psw == null || mem_psw.trim().length() == 0) {
						errorMsgs.put("psw","�п�J�K�X");
					} else if (! mem_psw.equals(check_password)) {
						errorMsgs.put("psw","�K�X�����T");
					}
				
					
					if (!errorMsgs.isEmpty()) {
						
						RequestDispatcher failureView = req
								.getRequestDispatcher("/FrontEnd/member/confirmPsw.jsp");
						failureView.forward(req, res);
						return; //�{�����_
						
					}
					
					/***************************�ǳ����(Send the Success view)*************/
					String url = "/FrontEnd/member/updatePsw.jsp";
					RequestDispatcher successView = req.getRequestDispatcher(url); 
					successView.forward(req, res);
					/***************************��L�i�઺���~�B�z*************************************/
				} catch (Exception e) {
					errorMsgs.put("Exception",e.getMessage());
					RequestDispatcher failureView = req
							.getRequestDispatcher("/FrontEnd/member/profile.jsp");
					failureView.forward(req, res);
				}
			}
		  
	}
	
	
	
	
	
	private MemVO allowUser(String mem_id, String mem_psw) {
		    
		MemService memSvc = new MemService(); 
		MemVO memVO = memSvc.login(mem_id,mem_psw);
		if (memVO != null) {
			return memVO;
		}else {
			return null;
		}
	}
	 
	//InputStream��Byte
	public String getFileNameFromPart(Part part) {
		String header = part.getHeader("content-disposition");
		System.out.println("header=" + header); // ���ե�
		String filename = new File(header.substring(header.lastIndexOf("=") + 2, header.length() - 1)).getName();
		System.out.println("filename=" + filename);  //���ե�

		if (filename.length() == 0) {
			return null;
		}
		return filename;
	}
	
}
