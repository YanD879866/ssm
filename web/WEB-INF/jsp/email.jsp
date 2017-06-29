<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>写邮件</title>
<link rel="stylesheet" type="text/css" href="../../css/style.css">
<%@ include file="/pub/default2016.jsp"%>
<script type="text/javascript" src="pub/js/ajaxfileupload.js"></script>
<script type="text/javascript" src="js/email.js"></script>
<style type="text/css">
</style>

</head>

<body>
	<div class="action">
		<div class="t">写邮件</div>
		<div class="pages">

			<table width="90%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td align="right" width="30%">收件人：</td>
					<td align="left">
					  <input type="text" id="receiver" name="receiver" value="" />
					</td>
				</tr>
				<tr>
					<td align="right" width="30%">邮件标题：</td>
					<td align="left">
					  <input type="text" id="title" name="title" value=""/><span style="color : red">*</span>
					</td>
				</tr>
				<tr>
					<td align="right" width="30%">邮件内容：</td>
					<td align="left">
					  <textarea id="content" name="content" style=" width : 250px; height : 90px;"></textarea>  
					</td>
				</tr>
				<tr>
					<td align="right" width="30%">上传附件：</td>
					<td align="left">
					  <input type="file" id="fileInfo" name="fileInfo"></input>
					  <span style="color : red">*</span>(上传附件不能大于9M)
					</td>
				</tr>
				<tr>
					<td align="center" colspan="2"><br />
					  <input type="button" id="save" value="发送邮件" onclick="email.saveEmail()"/>
					</td>
				</tr>
			</table>

		</div>
	</div>
	</div>
	</div>
	</form>
</body>
</html>
