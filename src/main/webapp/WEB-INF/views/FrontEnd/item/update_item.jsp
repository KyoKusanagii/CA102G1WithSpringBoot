<%@ page contentType="text/html; charset=UTF-8" pageEncoding="BIG5"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.item.model.*"%>
<%@ page import="com.particulars.model.*"%>
<%@ page import="com.category.model.*"%>
<%@ page import="java.util.*"%>

<%
	ItemVO itemVO = (ItemVO) request.getAttribute("itemVO"); //EmpServlet.java (Concroller) �s�Jreq��empVO���� (�]�A�������X��empVO, �]�]�A��J��ƿ��~�ɪ�empVO����)
%>

<html>
<head>
<title>�ӫ~��ƭק�</title>

<%@ include file="/FrontEnd/headerFooter/head.jsp"%>
<!-- �䷽����]�w-->
<style type="text/css">
.login-body {
	width: 75%;
	font-family: 'Noto Sans TC';
	font-style: normal;
	font-weight: 500;
	box-shadow: 1px 1px 8px black; 
}

h3 {
	font-family: 'Noto Sans TC';
	font-style: normal;
	font-weight: 500;
	margin-bottom: 10px;
}

td img {
	border: 1px solid #ddd;
	border-radius: 4px;
	padding: 5px;
	width: 150px;
	height: 150px;
	box-shadow: 1px 1px 5px gray;
}

._62la {
	background-color: rgba(0, 0, 0, .3);
	border: 1px solid transparent;
	border-radius: 50%;
	color: #fff;
	font-size: 14px;
	height: 16px;
	left: 4px;
	line-height: 14px;
	position: absolute;
	text-align: center;
	top: 4px;
	transition: all 100ms cubic-bezier(.08, .52, .52, 1);
	-webkit-user-select: none;
	width: 16px;
	z-index: 1;
}

._42ft {
	cursor: pointer;
	display: inline-block;
	text-decoration: none;
	white-space: nowrap;
}
</style>
<script type="text/javascript">
$(function () {
	$("#primary").change(function (event) {
		 var cat_no = $(this).find("option:selected").val();
		 
		 $.ajax({
             url: "<%=request.getContextPath()%>/FrontEnd/item/ItemLaunch.do",   //�s��Json�����}             
             type: "POST",
             cache:false,
             dataType: 'json',
             data:{
            	 action:"FB",
            	 cat_no:cat_no
             },
             //contentType: "application/json",
             success: function (data) {
            	 $("#secondary").html("");
                 //��k�@ (�^�Ǧh�����)                
                 for (var i = 0; i < data.length; i++) {
                	 
                     
                     var $opt = $('<option value=""></option>')
                     console.log(data[i].part_no,data[i].part_name);
                     $opt.val(data[i].part_no);
                     $opt.text(data[i].part_name);
                     $("#secondary").append($opt);
                     
                 }

                 //��k�G (�^�Ǧh�����)
//                  var i = 0;                    
//                  $.each(data, function () {
//                      alert(data[i].���W��);    
//                      i++;
//                  });

                 //��k�T (�^�ǳ浧���)
//                  $.each(data, function (index, element) {
//                      alert(element);                      
//                  });
             },

             error: function (xhr) {
                 alert(primary);
                 
             }
         });
		
		
	})
	
})


</script>
</head>
<body>
	<!-- header -->
	<div id="header">
		<%@ include file="/FrontEnd/headerFooter/header.jsp"%>
	</div>
	<div class="container">
		<h3 class="w3ls-title1" align="center">�ӫ~��ƭק�<i class="fa fa-pencil-square-o"></i></h3>
		<%-- ���~��C --%>
		<c:if test="${not empty errorMsgs}">
			<font style="color: red">�Эץ��H�U���~:</font>
			<ul>
				<c:forEach var="message" items="${errorMsgs}">
					<li style="color: red">${message}</li>
				</c:forEach>
			</ul>
		</c:if>
		<div class="row">
			<div class="login-body">

				<div id="orgpic">
					<table style="table-layout: fixed; word-break: break-all;">
						<tr>
							<td>
								<div style="margin-bottom: 10px;">�{���ӫ~�Ϥ�:</div>
							</td>
						</tr>
						<tr>
							<td>
								<jsp:useBean id="itemPicSvc" scope="page" class="com.itempic.model.ItempicService" />
								<c:forEach var="pic" items="${itemPicSvc.getOneItemAllPic(itemVO.item_no)}">
									<div style="float: left; text-align: center;margin-right: 10px">

<!-- 										<form action="ItemLaunch.do" method="post" name="delPic"> -->
											<div style="position: absolute;">
												<a class="_42ft _62la" href="<%=request.getContextPath()%>/FrontEnd/item/ItemLaunch.do?item_pic_no=${pic.item_pic_no}&item_no=${itemVO.item_no}&action=deletePic&
												requestURL=<%=request.getAttribute("requestURL")%>&whichPage=<%=request.getAttribute("whichPage")%>" title="�q���������ӫ~�Ϥ�">
													<i class="fa fa-times-circle"></i>
												</a>
												<!-- input class="btn btn-danger" type="submit" value="X" style="margin-top: 1px;" /-->
											</div>
											<img src="data:image/*;base64,${pic.encoded}">
<%-- 											<input type="hidden" name="item_pic_no" value="${pic.item_pic_no}"> --%>
<%-- 											<input type="hidden" name="item_no" value="${itemVO.item_no}"> --%>
<!-- 											<input type="hidden" name="action" value="deletePic"> -->

<!-- 										</form> -->

									</div>
								</c:forEach>
							</td>
						</tr>
					</table>
				</div>

				<form class="form-horizontal" METHOD="post" ACTION="ItemLaunch.do" name="form1" enctype="multipart/form-data">
					<div class="form-group">
						<table class="table">
							<tr>
								<td>�ӫ~�s��:</td>
								<td>
									<%=(itemVO == null) ? "" : itemVO.getItem_no()%>
									<input type="hidden" name="item_no" size="45" readonly="readonly" style="background-color: #eeeeee" value="<%=(itemVO == null) ? "" : itemVO.getItem_no()%>" />
								</td>
							</tr>
							<tr>
								<td>�ӫ~�W��:</td>
								<td>
									<input type="TEXT" name="item_name" size="45" value="<%=(itemVO == null) ? "" : itemVO.getItem_name()%>" />
								</td>
							</tr>
							<tr>
								<td>�s�W�ӫ~�Ϥ�:</td>
								<td align="left">
									<label class="btn btn-info">
										<input type="file" style="display: none;" id="upfile" name="upfile" accept="image/*" multiple="multiple">
										<i class="fa fa-photo"></i>
										�W�ǹϤ�
									</label>
									<div id="pic"></div>
									<label class="btn btn-danger rollback" style="display: none;">
										<input type="button"  style="display: none;" value="�����W��" hidden="hidden">
										<i class="fa fa-trash-o"></i>
										�����W��
									</label>

								</td>
							</tr>

							<tr>
								<td>�ӫ~����:</td>
								<td>
									<input type="number" name="item_price" size="45" value="<%=(itemVO == null) ? "" : itemVO.getItem_price()%>" />
								</td>
							</tr>

							<!--�бNDAO����service-->
							<jsp:useBean id="categoryDao" scope="page" class="com.category.model.CategoryDAO" />
							<tr>
								<td>
									�ӫ~�D���O:
									<font color=red>
										<b>*</b>
									</font>
								</td>
								<td>
									<select id="primary" size="1" name="item_primary_class">
										<!--�ۦ�д���service-->
										<c:forEach var="categoryVO" items="${categoryDao.all}">
											<option value="${categoryVO.cat_no}" ${categoryVO.cat_no == itemVO.getItem_primary_class()?'selected':'' }>${categoryVO.cat_name}
										</c:forEach>
									</select>
								</td>
							</tr>


							<!--�бNDAO����service-->
							<jsp:useBean id="partDao" scope="page" class="com.particulars.model.ParticularsDAO" />
							<tr>
								<td>
									�ӫ~�����O:
									<font color=red>
										<b>*</b>
									</font>
								</td>
								<td>
									<select id="secondary" size="1" name="item_secondary_class">

										<c:forEach var="partVO" items="${partDao.all}">
											<option value="${partVO.part_no}" ${partVO.part_no == itemVO.getItem_secondary_class()? 'selected':'' }>${partVO.part_name}
										</c:forEach>
									</select>
								</td>
							</tr>

							<tr>
								<td>�ӫ~�֦���:</td>
								<td>
									${memVO.mem_name}
									<input readonly="readonly" type="hidden" name="item_owner" size="45" style="background-color: #eeeeee" value="<%=(itemVO == null) ? "" : itemVO.getItem_owner()%>" />
								</td>
							</tr>

							<tr>
								<td>�ӫ~�w�s:</td>
								<td>
									<input type="TEXT" name="item_inventory" size="45" value="<%=(itemVO == null) ? "" : itemVO.getItem_inventory()%>" />
								</td>
							</tr>
							<tr>
								<td>�ӫ~�y�z:</td>
								<td>
									<input type="TEXT" name="item_description" size="45" value="<%=(itemVO == null) ? "" : itemVO.getItem_description()%>" />
								</td>
							</tr>

							<tr>
								<td>�bFB�W�[:</td>
								<td>
									<select size="1" name="is_fb_launch">

										<c:forEach var="F" items="${upStatus.keySet()}">
											<option value="${F}" ${F == itemVO.getIs_fb_launch()? 'selected' : ''}>${upStatus.get(F)}
										</c:forEach>
									</select>
								</td>
							</tr>

							<tr>
								<td>�b�ӫ��W�[:</td>
								<td>
									<select size="1" name="is_mall_launch">

										<c:forEach var="M" items="${upStatus.keySet()}">
											<option value="${M}" ${M== itemVO.getIs_mall_launch()? 'selected' : ''}>${upStatus.get(M)}
										</c:forEach>
									</select>
								</td>
							</tr>

						</table>
						<br>
						<input type="hidden" name="action" value="update">
						<input type="hidden" name="item_no" value="<%=itemVO.getItem_no()%>">
						<div align="center">
							<input class="btn btn-primary btn-lg" type="submit" value="�e�X�ק�">
							<input class="btn btn-danger btn-lg" type="button" value="�����ק�" onclick="location.href='<%=request.getContextPath()%><%=request.getAttribute("requestURL")%>?whichPage=<%=request.getAttribute("whichPage")%>'">
							<input type="hidden" name="requestURL" value="<%=request.getAttribute("requestURL")%>">
							<!--��e�X�ק諸�ӷ��������|,�qrequest���X��,�A�e��Controller�ǳ���椧��-->
							<input type="hidden" name="whichPage" value="<%=request.getAttribute("whichPage")%>">
							<!--�u�Ω�:istAllEmp.jsp-->
							<input type="hidden" class="scrl" name="scrl" value="${param.scrl}">
						</div>
					</div>
				</FORM>
			</div>
		</div>
	</div>
	<div id="footer">
		<%@ include file="/FrontEnd/headerFooter/footer.html"%>
	</div>

	<!-- �W�ǹw���� -->
	<script type="text/javascript">
		$("#upfile").change(
				function() {
					$(".rollback").show();
					$("#pic").empty();
					if (this.files && this.files[0]) {
						for (var i = 0; i < this.files.length; i++) {
							var reader = new FileReader();
							reader.onload = function(e) {
								var img = $("<img width='100' height='100'>")
										.attr("src", e.target.result);
								$("#pic").append(img);
							}
							reader.readAsDataURL(this.files[i]);
						}
					}
				});

		$(".rollback").click(function() {
			$(".rollback").hide();
			$("#upfile").val(null); //��W���ɮ�
			$("#pic").empty(); //��w����
		});

		$("._42ft ._62la").click(function() {
			console.log($("a").length);
			if ($("._42ft._62la").length == 1)
				alert("�ӫ~�Ϥ��ѳ̫�@�i�A�w�L�k�A�R��");
		});
	</script>
	<!-- //�W�ǹw���� -->
	<script src="<%=request.getContextPath()%>/FrontEnd/js/bootstrap.js "></script>
</body>

</html>