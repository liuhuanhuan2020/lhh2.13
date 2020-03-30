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
	<table width="80%" border="1" align="center"><a href="newlist.html">首页</a></table>
	<p align="center"><center><h1>详细内容</h1></center></p>
	<table align="center" border="1">
		<tr>
			<td>${news.ntitle }</td>
		</tr>
		<tr>
			<td>新闻内容：</td>
		</tr>
		<tr>
			<td>
				<textarea rows="10" cols="50">${news.ncontent}</textarea>
			</td>
		</tr>
	</table>
</body>
</html>