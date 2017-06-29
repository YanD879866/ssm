<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>个人信息</title>
<link rel="stylesheet" type="text/css" href="../css/style.css">
<style type="text/css">
</style>
</head>

<body>
	<div class="action">
		<div class="t">个人信息</div>
		<div class="pages">
			<table width="90%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td align="right" width="30%">昵称：</td>
					<td align="left"><input type="text" name="u.nickname"
						value="java菜鸟" readonly="readonly" id="nickname" />
					</td>
				</tr>
				<tr>
					<td align="right" width="30%">年龄：</td>
					<td align="left"><input type="text" name="u.age" value="1"
						readonly="readonly" id="age" />
					</td>
				</tr>
				<tr>
					<td align="right" width="30%">性别：</td>
					<td align="left"><input type="text" name="" value="男"
						readonly="readonly" id="" /></td>
				</tr>
				<tr>
					<td align="right" width="30%">手机：</td>
					<td align="left"><input type="text" name="u.mobile"
						value="13879854856" readonly="readonly" id="u_mobile" />
					</td>
				</tr>
				<tr>
					<td align="right" width="30%">地址：</td>
					<td align="left"><input type="text" name="u.address"
						value="台湾" readonly="readonly" id="u_address" />
					</td>
				</tr>
				<tr>
					<td align="center" colspan="2"><br />
					<input type="button" id="save" value="编辑数据" onclick="setit()" />
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
