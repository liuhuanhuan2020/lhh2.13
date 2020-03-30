<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
		<style type="text/css">
			body {
				font-family: Tahoma, Verdana;
				font-size: 12px
			}
			
			table {
				font-family: Tahoma, Verdana;
				color: #111111;
				font-size: 12px
				border: 0;
				margin: 0;
				padding:0;
				border: 1px solid #ccc;
				border-collapse: collapse;
				font-size: 12px;
			}
			td{
				LINE-HEIGHT: 180%
			}
			
		</style>
	</head>
<body>
	<p align="center"><center><h1>发布新闻</h1></center></p>
	<table width="80%" border="1" align="center">　</table>
	<br>
	<form action="${pageContext.request.contextPath }/login/savexinwen" method="post">
	<table align="center" border="1">
		<tr>
			<td>作者：</td>
			<td>
				<input type="text" maxlength="50" name="nauthor" size="20" />
				<font color="red">*</font>
			</td>
		</tr>
		<tr>
			<td>标题：</td>
			<td>
				<input type="text" maxlength="50" name="ntitle" />
				<font color="red">*</font>
			</td>
		</tr>
		<tr>
			<td>内容</td>
			<td>
				<textarea rows="10" cols="50" name="ncontent"></textarea>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="发布" />
				<input type="button" value="重置">
			</td>
		</tr>
	</table>
	</form>
</body>
</html>