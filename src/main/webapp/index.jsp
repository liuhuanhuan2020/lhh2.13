<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新闻发布系统</title>
	
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
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/dist/css/bootstrap.min.css">
	</head>
<body class="container">
		<div class="col-md-8 col-sm-offset-2">
			<form action="${pageContext.request.contextPath }/login/log" method="post">
				${msg}
				<div class="form-group">
					<label for="name">用户名：</label>
					<input id="name" name="uname" class="form-control" />
					</label>
				</div>
				<div class="form-group">
					<label for="upwd">密码：</label>
					<input id="upwd" name="upwd" class="form-control" />
					</label>
				</div>

				<input type="submit" class="btn btn-default" value="登录" />
				<a href="saveUI">注册新用户</a>

			</form>

		</div>
	</body>

</html>