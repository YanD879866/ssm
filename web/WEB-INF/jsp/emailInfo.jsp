<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>收件箱</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<%@ include file="/pub/default2016.jsp"%>
<link rel="stylesheet" type="text/css"
	href="resource/bootstrap/css/bootstrap.min.css"></link>
<script src="resource/bootstrap/js/bootstrap.min.js"
	type="text/javascript"></script>
<script>
 function view(o){
 
    $('#myModal').modal('toggle');
 }
</script>

</head>

<body>
	<div class="actions">
		<div class="pages">
			<table class="table">
				<caption>邮件信息列表</caption>
				<thead>
					<tr>
						<th>邮件标题</th>
						<th>内容</th>
						<th>是否已读</th>
						<th>时间</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${emailList }" var="email">
						<tr>
							<td>${email.F_EMAIL_TITLE }</td>
							<td>${email.F_EMAIL_CONTENT }</td>
							<td>${email.F_EMAIL_IS_READ_NAME }</td>
							<td>${email.F_EMAIL_TIME }</td>
							<td><a href="javascript:void(0)" onclick="view(this)">查看</a>&nbsp;
								<a href="javascript:void(0)" onclick="del(this)">删除</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

			<!-- 模态框开始start -->
			<div id="myModal" class="modal fade bs-example-modal-lg"
				tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">
						<table class="table">
							<tbody>
								<tr>
									<td>标题</td>
									<td>测试</td>
								</tr>
								<tr>
									<td>标题</td>
									<td>测试</td>
								</tr>
								<tr>
									<td>标题</td>
									<td>测试</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<!-- 模态框开始end -->
		</div>
	</div>
</body>
</html>
