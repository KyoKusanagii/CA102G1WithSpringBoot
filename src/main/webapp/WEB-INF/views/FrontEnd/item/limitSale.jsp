<%@ page contentType="text/html; charset=UTF-8" pageEncoding="Big5"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.item.model.*"%>
<%@ page import="com.limitSale.model.*"%>
<%@ page import="java.util.*"%>

<%
	LimitSaleVO limitSaleVO = (LimitSaleVO) request.getAttribute("limitSaleVO");
%>

<html>
<head>
<title>���ɯS��޲z</title>
<%@ include file="/FrontEnd/headerFooter/head.jsp" %>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/FrontEnd/css/wickedpicker.min.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/FrontEnd/css/wickedpicker.scss">
<link rel="stylesheet" href="https://cdn.bootcss.com/titatoggle/2.1.2/titatoggle-dist-min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<%@ include file="/FrontEnd/headerFooter/head.jsp" %>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="<%=request.getContextPath()%>/FrontEnd/js/wickedpicker.min.js"></script>

<!-- �䷽����]�w-->

<script>
	$(document).ready(
			function() {
				var today = new Date();
				var options = {
					//now: "12:35", //hh:mm 24 hour format only, defaults to current time 
					twentyFour : true, //Display 24 hour format, defaults to false 
					upArrow : 'wickedpicker__controls__control-up', //The up arrow class selector to use, for custom CSS 
					downArrow : 'wickedpicker__controls__control-down', //The down arrow class selector to use, for custom CSS 
					close : 'wickedpicker__close', //The close class selector to use, for custom CSS 
					hoverState : 'hover-state', //The hover state class to use, for custom CSS 
					title : '�п�ܮɶ�', //The Wickedpicker's title, 
					showSeconds : true, //Whether or not to show seconds, 
					secondsInterval : 1, //Change interval for seconds, defaults to 1  , 
					minutesInterval : 1, //Change interval for minutes, defaults to 1 
					beforeShow : null, //A function to be called before the Wickedpicker is shown 
					show : null, //A function to be called when the Wickedpicker is shown 
					clearable : true
				//Make the picker's input clearable (has clickable "x")  }; 
				};

				$("#StartTime").wickedpicker(options);
				$("#EndTime").wickedpicker(options);
				$("#StartDate").datepicker(
						{
							showOn : "both",
							//beforeShow: customRange,
							dateFormat : "yy-mm-dd",
							minDate : today,
							maxDate : new Date(today.getFullYear(), today
									.getMonth(), today.getDate() + 365),

						});
				$(function() {
					$('#StartDate').datepicker('setDate', new Date())
				});
				$("#EndDate").datepicker(
						{
							showOn : "both",
							//beforeShow: customRange,
							dateFormat : "yy-mm-dd",
							minDate : today,
							maxDate : new Date(today.getFullYear(), today
									.getMonth(), today.getDate() + 365),

						});
				$(function() {
					var date = new Date((new Date()).valueOf() + 1000 * 3600
							* 24 * 7);
					$('#EndDate').datepicker('setDate', date);
				});

			});
</script>
<style type="text/css">
.login-body {
	width: 75%;
	font-family: 'Noto Sans TC';
	font-style: normal;
	font-weight: 500;
	box-shadow: 1px 1px 8px green;
}

h3, .w3ls-title1 {
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
	box-shadow: 1px 1px 5px black;
	margin-bottom: 10px;
}
.wickedpicker__title{

	font-family: 'Noto Sans TC';
	font-style: normal;
	font-weight: 500;
	font-size: 16px ;
	}

body {

    background: url(<%=request.getContextPath()%>/FrontEnd/images/bg1.jpg)no-repeat center 0px fixed;
    background-size: cover;
}
</style>

</head>
<body>
	<!-- header -->
	<div id="header">
		<%@ include file="/FrontEnd/headerFooter/header1.jsp"%>
	</div>


	<div class="container">
		<h3 class="w3ls-title1" align="center" style="color:white;font-weight:bold;margin:10px 10px 10px 10px">
			�s�W���ɩ��ӫ~
			<i class="fa fa-clock-o"></i>
		</h3>
			

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
							<c:forEach var="pic" items="${itemPicSvc.getOneItemAllPic(param.item_no)}">
								<div style="float: left; text-align: center;">
									<img src="data:image/*;base64,${pic.encoded}">
								</div>
							</c:forEach>
						</td>
					</tr>
				</table>
			</div>
			<FORM class="form-horizontal" METHOD="post" ACTION="<%=request.getContextPath() %>/FrontEnd/LimitSale.do" name="form1">
				<div class="form-group">
					<table class="table">
						<jsp:useBean id="itemSvc" scope="page" class="com.item.model.ItemService" />
						<tr>
							<td>�ӫ~�W��:</td>
							<td>
								 <div style="font-weight:bold; font-size:20px">${itemSvc.getOneItem(param.item_no).item_name}</div>
								<input type="hidden" name="item_no" size="45" value="${param.item_no}" />
							</td>
						</tr>
						<tr>
							<td>�ӫ~��ӻ���:</td>
							<td>
								<div style="font-weight:bold; font-size:20px">${itemSvc.getOneItem(param.item_no).item_price}</div>
							</td>
						</tr>
						<tr>
						<tr>
							<td>�ӫ~�u�f����:</td>
							<td>
								<input style="font-weight:bold; font-size:18px;" type="number" name="sale_price" size="45" value="<%=(limitSaleVO == null) ? "" : limitSaleVO.getSale_price()%>" />
							</td>
						</tr>
						<tr>
						
							<td>�s�W���ɸ�T:</td>
							<td align="left">
								<label for="StartDate" style="margin-top: 5px">�}�l���</label>
								<br>
								<input type="text" id="StartDate" name="limitSale_start_date" style="margin-bottom: 10px"  />
								<br>
								<label for="StartTime" style="margin-top: 5px">�}�l�ɶ�</label>
								<br>
								<input type="text" id="StartTime" name="limitSale_start_time" class="timepicker" style="margin-bottom: 5px;">
								<br>
								<label for="EndDate" style="margin-top: 5px">�������</label>
								<br>
								<input type="text" id="EndDate" name="limitSale_end_date" style="margin-bottom: 10px">
								<br>
								<label for="EndTime" style="margin-top: 5px">�����ɶ�</label>
								<br>
								<input type="text" id="EndTime" name="limitSale_end_time" class="timepicker" style="margin-bottom: 5px;">
								<br>
								<label for="Textarea1">���ɯS�椺�e</label>
								<i class="fa fa-pencil prefix"></i>
								<textarea id="Textarea1"  style="font-weight:bold; font-size:30px; resize: none; width: 600px; height: 200px; overflow-x: visible; overflow-y: visible;" name="sale_remark" class="form-control rounded-0"><%=(limitSaleVO == null) ? "" : limitSaleVO.getSale_remark()%>
								</textarea>
							</td>
						</tr>


						<!--�бNDAO����service-->
						<jsp:useBean id="categorySvc" scope="page" class="com.category.model.CategoryService" />


						<tr>
							<td>���ɯS�檬�A:</td>

							<td>
								<div class="checkbox checkbox-slider--b checkbox-slider-md">
									<label>
										<input type="checkbox" value = "1" name = "sale_status" 
										onclick = "${itemSvc.getOneItem(param.item_no).is_mall_launch == 0?  'return false' : '' }">
										<span>On</span>
									</label>
								</div>
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

	
	<script src="<%=request.getContextPath()%>/FrontEnd/js/jquery.knob.js"></script>
	<script src="<%=request.getContextPath()%>/FrontEnd/js/jquery.throttle.js"></script>
	<script src="<%=request.getContextPath()%>/FrontEnd/js/jquery.classycountdown.js"></script>
	<script>
			$(document).ready(function() {
				$('#countdown').ClassyCountdown({
					end: '100000',
					now: '0',
					labels: true,
					style: {
						element: "",
						textResponsive: .5,
						days: {
							gauge: {
								thickness: .10,
								bgColor: "rgba(0,0,0,0)",
								fgColor: "#1abc9c",
								lineCap: 'round'
							},
							textCSS: 'font-weight:300; color:#fff;'
						},
						hours: {
							gauge: {
								thickness: .10,
								bgColor: "rgba(0,0,0,0)",
								fgColor: "#05BEF6",
								lineCap: 'round'
							},
							textCSS: ' font-weight:300; color:#fff;'
						},
						minutes: {
							gauge: {
								thickness: .10,
								bgColor: "rgba(0,0,0,0)",
								fgColor: "#8e44ad",
								lineCap: 'round'
							},
							textCSS: ' font-weight:300; color:#fff;'
						},
						seconds: {
							gauge: {
								thickness: .10,
								bgColor: "rgba(0,0,0,0)",
								fgColor: "#f39c12",
								lineCap: 'round'
							},
							textCSS: ' font-weight:300; color:#fff;'
						}

					},
					onEndCallback: function() {
						window.alert("���ɯS��w����!");
						document.getElementById('owl-demo').style.display='none';
					}
				});
			});
		</script>
	<script src="<%=request.getContextPath()%>/FrontEnd/js/bootstrap.js "></script>
</body>

</html>