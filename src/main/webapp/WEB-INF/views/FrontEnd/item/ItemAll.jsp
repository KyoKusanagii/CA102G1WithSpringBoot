<%@ page contentType="text/html; charset=UTF-8" pageEncoding="BIG5"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<%@ page import="com.item.model.*"%>
<%@ page import="com.particulars.model.*, com.limitSale.model.*"%>
<%@ page import="com.category.model.*, com.member.model.*,java.sql.*,java.text.*"%>

<%-- �����m�߱ĥ� EL ���g�k���� --%>

<%
	MemVO memvo = (MemVO) session.getAttribute("memVO");
		if(memvo == null){
			session.setAttribute("location",request.getRequestURI());
			response.sendRedirect(request.getContextPath()+"/FrontEnd/member/login.jsp");
			return;
			
		}

	String mem_no = memvo.getMem_no();
	// 	session.setAttribute("login_mem", "M00001");

	ItemService itemService = new com.item.model.ItemService();
	List<ItemVO> list = itemService.getAll(mem_no);
	pageContext.setAttribute("list", list);

	//���o���O�j���B�z �A�д���service
	CategoryDAO categoryDAO = new CategoryDAO();
	List<CategoryVO> categorys = categoryDAO.getAll();
	HashMap<Integer, String> categoryClass = new HashMap<Integer, String>();

	for (CategoryVO category : categorys) {
		categoryClass.put(category.getCat_no(), category.getCat_name());
	}
	session.setAttribute("categoryClass", categoryClass);

	//���o���O�Ӷ��B�z �A�д���service
	ParticularsDAO partDAO = new ParticularsDAO();
	List<ParticularsVO> parts = partDAO.getAll();
	HashMap<Integer, String> particularClass = new HashMap<Integer, String>();

	for (ParticularsVO part : parts) {
		particularClass.put(part.getPart_no(), part.getPart_name());
	}
	session.setAttribute("particularClass", particularClass);

	//�W�[�B�z
	HashMap<Integer, String> upStatus = new HashMap<Integer, String>();
	upStatus.put(0, "�U�[");
	upStatus.put(1, "�W�[");
	session.setAttribute("upStatus", upStatus);
	
	
	LimitSaleService limitSaleSvc = new LimitSaleService();
	pageContext.setAttribute("limitSaleSvc",limitSaleSvc);
	
	//�o��Ҧ����S��ӫ~
	List<LimitSaleVO> limitList = limitSaleSvc.getAll();
	List<String> limitExist = new LinkedList<String>();
	for(LimitSaleVO l : limitList){
		limitExist.add(l.getItem_no());
	}
	pageContext.setAttribute("limitExist",limitExist);
	
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	pageContext.setAttribute("sdf",sdf);
	
	java.util.Date date = new java.util.Date();
	pageContext.setAttribute("date",date);
	

	
%>

<html>
<head>
<title>�Ҧ��ӫ~���</title>
<%@ include file="/FrontEnd/headerFooter/head.jsp"%>
<!-- �䷽����]�w-->
<style type="text/css">
.c, .w3ls-title1 {
	font-family: 'Noto Sans TC';
	font-style: normal;
	font-weight: 500;
}

input[type="submit"].btn-block, input[type="reset"].btn-block, input[type="button"].btn-block
	{
	width: 30%;
	margin-bottom: 10px;
}

td img {
	border-radius: 4px;
	padding: 1px;
	width: 150px;
	height: 150px;
	box-shadow: 1px 1px 5px gray;
	text-align: center;
	vertical-align: middle;

}

img:hover {
	box-shadow: 0 0 5px 1px rgba(250, 0, 0, 0.5);
}

th {
	text-align: center;
	vertical-align: middle;
}



/* ����css */
.p{

	text-align: center;
	margin-bottom:10px;
	
}
.p ul.pagination {
    display: inline-block;
    padding: 0;
    margin: 0;
}

ul.pagination li {display: inline;}

ul.pagination li a {
    color: black;
    float: left;
    padding: 8px 16px;
    text-decoration: none;
}

ul.pagination li a.active {
    background-color: #4CAF50;
    color: white;
}

ul.pagination li a:hover:not(.active) {background-color: green;}
body {

    background: url(<%=request.getContextPath()%>/FrontEnd/images/bg2.jpg)no-repeat center 0px fixed;
    background-size: cover;
    
}

.w3ls-cart {
    display: block;
    background: #1E90FF;
}

.newed{
	display: block;
    background: #B0C4DE;
}

li, .nav-tabs > li.active > a, .nav-tabs > li.active > a:hover, .nav-tabs > li.active > a:focus {
	color:white;
	font-family: 'Noto Sans TC';
	font-style: normal;
	font-weight: 500;
	font-size: 16px ;
	
}

li a {

	color:#ffaa00;

}

.table-bordered,.table-bordered > thead > tr > th, .table-bordered > tbody > tr > th,
.table-bordered > tfoot > tr > th, .table-bordered > thead > tr > td, .table-bordered > tbody > tr > td,
.table-bordered > tfoot > tr > td {

	border:0;
}

tr{
	border:1px solid #ddd;
	box-shadow:1px 1px 2px gray;
}


.fa-plus-square{
 /*   font-size: 80px;
    color: green;
    position: fixed;
    bottom: 20px;
      right: 20px;*/
   }
   
.glyphicon-hourglass {
    color:#ED5485;  font-size: 10px;
    transform:rotate(135deg);
    -webkit-transform:rotate(135deg); /* Safari �M Chrome */
    display: inline-block;
}



</style>


<script type="text/javascript">
	
$(window).load( function (){  
 
	$("html,body").animate({scrollTop:${empty param.scrl? 0:param.scrl}},300)
	}); 
	
	window.addEventListener('scroll', function(e) {
		$(".scrl").val(window.scrollY);
	});
	
	function cal(endDate,fn){
		var timer = setInterval(function() {
			if(endDate>=new Date()){
				startDate = new Date();
				var spantime = (endDate - startDate)/1000;
			    var d = Math.floor(spantime / (24 * 3600));
			    var h = Math.floor((spantime % (24*3600))/3600);
			    var m = Math.floor((spantime % 3600)/(60));
			    var s = Math.floor(spantime%60);
			    str = d + "�� " + h + "�� " + m + "�� " + s + "�� ";
			    fn(str);
			}
			else{
				clearInterval( timer );
				str = "�S��w����";
				$(".off").html("<div class='off' style='color:#667572;''><i class='glyphicon glyphicon-off'></i>�iOFF�j</div>");
				
			}
		}, 1000);
	    
	}


</script>




</head>
<body>
	<!-- header -->
	<div id="header">
		<%@ include file="/FrontEnd/headerFooter/header1.jsp"%>
	</div>


	<!-- tab -->
	<ul class="nav nav-tabs">
	  <li role="presentation" class="active"><a href="<%=request.getContextPath()%>/FrontEnd/item/ItemAll.jsp"> <i class="glyphicon glyphicon-shopping-cart"></i>�ӫ~�޲z</a></li>
	  <li role="presentation"><a href="<%=request.getContextPath()%>/FrontEnd/fborder/fbOrder.jsp"><i class="glyphicon glyphicon-thumbs-up"></i>fb�q��޲z</a></li>
	  <li role="presentation"><a href="<%=request.getContextPath()%>/FrontEnd/mallorder/mallOrder.jsp"><i class="glyphicon glyphicon-usd"></i>�ӫ��q��޲z</a></li>
	  <li role="presentation"><a href="<%=request.getContextPath()%>/FrontEnd/live/trailer_show.jsp"><i class="glyphicon glyphicon-phone"></i>�����w�i�޲z</a></li>
	</ul>
			<h3 class="w3ls-title1" align="center" style="color:white;font-weight:bold;margin-bottom:20px;margin-top:15px">
				<i class="fa fa-bar-chart"></i>
				�ӫ~�C�� 
			</h3>
	<div class="container d-flex justify-content-center" style="background-color: #eeeeee" >
		<div class="c">

			<%-- ���~��C --%>

			<c:if test="${not empty errorMsgs}">
				<font style="color: red">�Эץ��H�U���~:</font>
				<ul>
					<c:forEach var="message" items="${errorMsgs}">
						<li style="color: red">${message}</li>
					</c:forEach>
				</ul>
			</c:if>

			<table class="table table-hover table-bordered">
				<tr class="danger">
					<th><i class="glyphicon glyphicon-time"></i>���ɯS��</th>
					<th style="width: 10%;">�ӫ~</th>
					<th>����</th>
					<th>�ӫ~���O</th>
					<th>���A</th>
					<th>�w�s</th>
					<th style="width: 22%;">�ӫ~�y�z</th>
					<th>�ӫ~���A</th>
				</tr>
				<%@ include file="page1.file"%>
				<jsp:useBean id="itemPicSvc" scope="page" class="com.itempic.model.ItempicService" />
				<c:forEach var="itemVO" items="${list}" begin="<%=pageIndex%>" end="<%=pageIndex+rowsPerPage-1%>">
					<tr ${(itemVO.item_no==param.item_no) ? 'style="border-color:#aaaaee;border-width:3px;border-style:solid;padding:5px;background-color:#FFE5B5;"' :'class="#f1f3f2"'}>
						<!--�N�ק諸���@���[�J����Ӥw-->
						<td>
<!-- 							�s�W�S���ɯS�� -->
							<div class="new" align="center">
								<FORM METHOD="post" ACTION="<%=request.getContextPath()%>/FrontEnd/LimitSale.do">
							<c:choose>
								<c:when test="${!limitExist.contains(itemVO.item_no)}">
									<label class="btn w3ls-cart w3ls-cart-like newed">�s�W
										<input class="btn" style="display: none;" type="submit" value="limitSale">
										<i class="fa fa-plus-square"></i>
									</label>
									<input type="hidden" name="action" value="getOne_For_Insert">
								</c:when>
								<c:otherwise>
<!-- 							�קﭭ�ɯS�� -->
									<label class="btn w3ls-cart w3ls-cart-like">�ק�
										<input class="btn" style="display: none;" type="submit" value="limitSale">
										<i class="fa fa-pencil"></i>
									</label>
										<div style="color:${limitSaleSvc.findOneSale(itemVO.item_no).getSale_status()==0 or sdf.parse(limitSaleSvc.findOneSale(itemVO.item_no).sale_end).getTime() < sdf.parse(sdf.format(date)).getTime()? '#AAAAAA' : 'black'}">
											${sdf.format(limitSaleSvc.findOneSale(itemVO.item_no).getSale_start())}<br><i class="fa fa-angle-double-down"></i><br>
											${sdf.format(limitSaleSvc.findOneSale(itemVO.item_no).getSale_end())}<br>
											<c:choose>
											<c:when test="${limitSaleSvc.findOneSale(itemVO.item_no).getSale_status()==0 or sdf.parse(limitSaleSvc.findOneSale(itemVO.item_no).sale_end).getTime() < sdf.parse(sdf.format(date)).getTime()}">
												<div style="color:#667572;"><i class="glyphicon glyphicon-off"></i>�iOFF�j</div> 
												${limitSaleSvc.offLimit(limitSaleSvc.findOneSale(itemVO.item_no).sale_no)}
											</c:when>
											<c:otherwise>
												<div class="off" style="color:#7fbb00"><i class="glyphicon glyphicon-tags"></i>�iON SALE�j</div>
											</c:otherwise>
											</c:choose>
										</div>
									<input type="hidden" name="action" value="getOne_For_Update">
								</c:otherwise>
							</c:choose>
									<input type="hidden" name="item_no" value="${itemVO.item_no}">
									<input type="hidden" name="requestURL" value="<%=request.getServletPath()%>">
									<input type="hidden" name="whichPage" value="<%=whichPage%>">
									<input type="hidden" class="scrl" name="scrl">
								</FORM>
							</div>
							<div style="text-align:center">
								<i class='glyphicon glyphicon-hourglass'></i><span  style="color:#ED5485" id="${itemVO.item_no}"></span>
							</div>
<c:choose>
 <c:when test="${limitExist.contains(itemVO.item_no)}">
  <SCRIPT>
<!--   ���ɯS��˼ƭp�ɾ� -->
   cal(${sdf.parse(limitSaleSvc.findOneSale(itemVO.item_no).sale_end).getTime()}, function( str ){ 
    
     if(${limitSaleSvc.findOneSale(itemVO.item_no).getSale_status()!=0 and sdf.parse(limitSaleSvc.findOneSale(itemVO.item_no).sale_end).getTime() > sdf.parse(sdf.format(date)).getTime()}) { 
      document.getElementById("${itemVO.item_no}").innerHTML = str; 
     } 
     else if(${limitSaleSvc.findOneSale(itemVO.item_no).getSale_status()==0 or sdf.parse(limitSaleSvc.findOneSale(itemVO.item_no).sale_end).getTime() < sdf.parse(sdf.format(date)).getTime()}) { 
      document.getElementById("${itemVO.item_no}").innerHTML = "�S��w����/����";
     } 
    }); 
  </SCRIPT>
 </c:when>
 <c:otherwise>
   <SCRIPT>
    document.getElementById("${itemVO.item_no}").innerHTML = "�ȵL�S��"; 

  </SCRIPT>
 </c:otherwise>
</c:choose>
							

						</td>
						
						<td style="vertical-align: middle; text-align: center;">	
						<a href="<%=request.getContextPath()%>/FrontEnd/query.do?action=findOneItem&itemNo=${itemVO.item_no}" target="_blank">
							<!-- �Y�S���Ϥ��h�H���N�Ϥ���� -->
							<c:choose>
								<c:when test="${empty itemPicSvc.getThumbnail(itemVO.item_no).encoded}">
									<img src="<%=request.getContextPath()%>/FrontEnd/images/no_image.jpg">
								</c:when>
								<c:otherwise>
									<img src="data:image/*;base64,${itemPicSvc.getThumbnail(itemVO.item_no).encoded}">
								</c:otherwise>
							</c:choose><br>
							${itemVO.item_name}
						</a>
						</td>
						<td style="vertical-align: middle; text-align:center;">
						<c:choose>
							<c:when  test="${limitExist.contains(itemVO.item_no) and limitSaleSvc.findOneSale(itemVO.item_no).getSale_status()==1 and  sdf.parse(limitSaleSvc.findOneSale(itemVO.item_no).sale_end).getTime() > sdf.parse(sdf.format(date)).getTime()}">
								<div style="text-decoration:line-through">$${itemVO.item_price}</div>
								<div style="color:red">$${limitSaleSvc.findOneSale(itemVO.item_no).sale_price}</div>
							</c:when>
							<c:otherwise>
								<div style="vertical-align: middle; text-align:center;">$${itemVO.item_price}</div>
							</c:otherwise>
						</c:choose>
						
						</td>
							
						<td style="vertical-align: middle; text-align: center">${categoryClass.get(itemVO.getItem_primary_class())} <i class="fa fa-chevron-right"></i> ${particularClass.get(itemVO.getItem_secondary_class())}</td>
						<td style="vertical-align: middle; text-align: center">
							<div style="margin-bottom:20px;vertical-align: middle; text-align: center;background-color:${itemVO.getIs_fb_launch()==1? '#00db00':'#ff7575'}">
								<c:choose>
									<c:when test="${itemVO.getIs_fb_launch()==0}">
										<i class="fa fa-angle-double-down"></i>
									</c:when>
									<c:otherwise>
										<i class="fa fa-angle-double-up"></i>
									</c:otherwise>
								</c:choose>
								<i class="fa fa-facebook-square"></i><br>
								${upStatus.get(itemVO.getIs_fb_launch())}
							</div>
							<div style="vertical-align: middle; text-align: center;background-color:${itemVO.getIs_mall_launch()==1? '#00db00':'#ff7575'}">
								<c:choose>
									<c:when test="${itemVO.getIs_mall_launch()==0}">
										<i class="fa fa-angle-double-down"></i>
									</c:when>
									<c:otherwise>
										<i class="fa fa-angle-double-up"></i>
									</c:otherwise>
								</c:choose>
								<i class="fa fa-home"></i><br>
								${upStatus.get(itemVO.getIs_mall_launch())}
							</div>
						</td>
						<td style="vertical-align: middle; text-align: center">${itemVO.item_inventory}</td>
						<td>${itemVO.item_description}</td>

						<td style="vertical-align: middle; text-align: center;">
							<FORM METHOD="post" ACTION="<%=request.getContextPath()%>/FrontEnd/item/ItemLaunch.do">
								<div>
									<input class="btn btn-primary" type="submit" value="�ק�" onclick="setPos()">
								</div>
								<input type="hidden" name="item_no" value="${itemVO.item_no}">
								<input type="hidden" name="action" value="getOne_For_Update">
								<input type="hidden" name="requestURL" value="<%=request.getServletPath()%>">
								<!--�e�X�����������|��Controller-->
								<input type="hidden" name="whichPage" value="<%=whichPage%>">
								<!--�e�X��e�O�ĴX����Controller-->
								<input type="hidden" class="scrl" name="scrl">

							</FORM>

							<FORM METHOD="post" ACTION="<%=request.getContextPath()%>/FrontEnd/item/ItemLaunch.do">
								<input class="btn btn-danger" type="submit" value="�U�[">
								<input type="hidden" name="item_no" value="${itemVO.item_no}">
								<c:if test="${limitExist.contains(itemVO.item_no)}">
									<input type="hidden" name="sale_no" value="${limitSaleSvc.findOneSale(itemVO.item_no).sale_no}">
								</c:if>
								<input type="hidden" name="action" value="recall">
								<input type="hidden" name="requestURL" value="<%=request.getServletPath()%>">
								<!--�e�X�����������|��Controller-->
								<input type="hidden" name="whichPage" value="<%=whichPage%>">
								<!--�e�X��e�O�ĴX����Controller-->
								<input type="hidden" class="scrl" name="scrl">
							</FORM>
						</td>


					</tr>
					



				</c:forEach>
			</table>

			<div class="new" align="center">
				<FORM METHOD="post" ACTION="<%=request.getContextPath()%>/FrontEnd/item/addItem.jsp" style="margin-bottom: 0px;">
					<input class="btn btn-warning btn-lg btn-block" type="submit" value="�W�[�s�ӫ~">
					<input type="hidden" name="requestURL" value="<%=request.getServletPath()%>">
					<!--�e�X�����������|��Controller-->
					<input type="hidden" name="whichPage" value="<%=whichPage%>">
					<!--�e�X��e�O�ĴX����Controller-->
					<input type="hidden" class="scrl" name="scrl">
				</FORM>
			</div>

			<%@ include file="page2.file"%>

		</div>
	</div>
	<div id="footer">
		<%@ include file="/FrontEnd/headerFooter/footer.html"%>
	</div>

	<script src="<%=request.getContextPath()%>/FrontEnd/js/bootstrap.js "></script>
</body>
</html>