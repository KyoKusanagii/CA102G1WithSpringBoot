<%@ page contentType="text/html; charset=UTF-8" pageEncoding="BIG5"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.item.model.*"%>
<%@ page import="java.util.*"%>

<%
	ItemVO itemVO = (ItemVO) request.getAttribute("itemVO"); //EmpServlet.java (Concroller) �s�Jreq��empVO���� (�]�A�������X��empVO, �]�]�A��J��ƿ��~�ɪ�empVO����)
%>

<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title>�ӫ~�Ϥ�</title>

<title>�Ҧ��ӫ~���</title>

<%@ include file="/FrontEnd/headerFooter/head.jsp" %>
<!-- �䷽����]�w-->
<style type="text/css">
.login-body {
	width: 75%;
	font-family: 'Noto Sans TC';
	font-style: normal;
	font-weight: 500;
}

img {
	border: 1px solid #ddd;
	border-radius: 4px;
	padding: 5px;
	width: 100px;
	height: 100px;
}
</style>

</head>
<body>
	<div class="container">
		<div class="row">

				<div style="float: left; text-align: center;">
					<jsp:useBean id="itemPicSvc" scope="page" class="com.itempic.model.ItempicService" />
					<c:forEach var="pic" items="${itemPicSvc.getOneItemAllPic(itemVO.item_no)}">
						<img src="data:image/*;base64,${pic.encoded}">
					</c:forEach>
				</div>

		</div>
	</div>

	<script src="<%=request.getContextPath()%>/FrontEnd/js/bootstrap.js "></script>
</body>

</html>