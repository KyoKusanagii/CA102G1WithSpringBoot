<%@ page contentType="text/html; charset=UTF-8" pageEncoding="Big5"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.item.model.*"%>
<%@ page import="com.particulars.model.*"%>
<%@ page import="com.category.model.*"%>
<%@ page import="java.util.*"%>

<%
	ItemVO itemVO = (ItemVO) request.getAttribute("itemVO");
%>

<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title>�s�W�ӫ~</title>

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
	box-shadow: 1px 1px 5px red;
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


		<h3 class="w3ls-title1" align="center">�s�W�ӫ~</h3>

		<%-- ���~��C --%>
		<c:if test="${not empty errorMsgs}">
			<font style="color: red">�Эץ��H�U���~:</font>
			<ul>
				<c:forEach var="message" items="${errorMsgs}">
					<li style="color: red">${message}</li>
				</c:forEach>
			</ul>
		</c:if>
		<div class="login-body">
			<FORM class="form-horizontal" METHOD="post" ACTION="ItemLaunch.do" name="form1" enctype="multipart/form-data">
				<div class="form-group">
					<table class="table">
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
									<input type="button" style="display: none;" value="�����W��" hidden="hidden">
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
						<jsp:useBean id="categorySvc" scope="page" class="com.category.model.CategoryService" />
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
									<c:forEach var="categoryVO" items="${categorySvc.all}">
										<option value="${categoryVO.cat_no}" ${categoryVO.cat_no == itemVO.getItem_primary_class()?'selected':'' }>${categoryVO.cat_name}
									</c:forEach>
								</select>
							</td>
						</tr>


						<!--�бNDAO����service-->
						<jsp:useBean id="partSvc" scope="page" class="com.particulars.model.ParticularsService" />
						<tr>
							<td>
								�ӫ~�����O:
								<font color=red>
									<b>*</b>
								</font>
							</td>
							<td>
								<select id="secondary" size="1" name="item_secondary_class">

									<c:forEach var="partVO" items="${partSvc.all}">
										<option value="${partVO.part_no}" ${partVO.part_no == itemVO.getItem_secondary_class()? 'selected':'' }>${partVO.part_name}
									</c:forEach>
								</select>
							</td>
						</tr>

						<tr>
							<td>�ӫ~�֦���:</td>
							<td>
								<input type="hidden" name="item_owner" size="45" style="background-color: #eeeeee" value="${memVO.mem_no}" />
								<input readonly="readonly" type="TEXT" name="mem_name" size="45" style="background-color: #eeeeee" value="${memVO.mem_name}" />
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
					</table>
					<br>
					<input type="hidden" name="action" value="insert">
					<div align="center">
						<input class="btn btn-success btn-lg " type="submit" value="�e�X�s�W">
						<input class="btn btn-danger btn-lg " type="button" value="�����s�W" onclick="location.href='<%=request.getContextPath()%><%=request.getParameter("requestURL")%>?whichPage=<%=request.getParameter("whichPage")%>'">
						<input type="hidden" name="requestURL" value="<%=request.getParameter("requestURL")%>">
						<!--��e�X�ק諸�ӷ��������|,�qrequest���X��,�A�e��Controller�ǳ���椧��-->
						<input type="hidden" name="whichPage" value="<%=request.getParameter("whichPage")%>">
						<!--�u�Ω�:istAllEmp.jsp-->
						<input type="hidden" class="scrl" name="scrl" value="${param.scrl}">
					</div>
				</div>
			</FORM>
		</div>
	</div>
	<div id="footer">
		<%@ include file="/FrontEnd/headerFooter/footer.html"%>
	</div>

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
	</script>
	<script src="<%=request.getContextPath()%>/FrontEnd/js/bootstrap.js "></script>
</body>

</html>