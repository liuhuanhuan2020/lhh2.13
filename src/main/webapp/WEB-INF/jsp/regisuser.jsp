<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/dist/css/bootstrap.min.css">
	</head>
		<body class="container">
		<div class="col-md-8 col-sm-offset-2">
			<div class="form-group ">
					<div class="col-md-10 col-sm-offset-5">
						<h1>用户注册</h1>
					</div>
				</div>
		
			<form class="form-horizontal" name="form1" method="post" action="login/save">
				<div class="form-group">
					<label class="control-label col-md-2" for="uname">姓名:</label>
					<div class="col-md-9">
						<input name="uname" id="uname" class="form-control " type="text" size="20">
					</div>
					<font color="red" class="col-md-1">*</font>
				</div>
				<div class="form-group">
					<label class="control-label col-md-2" for="upwd">密码:</label>
					<div class="col-md-9">
						<input name="upwd" id="upwd" class="form-control " type="text" size="20">
					</div>
					<font color="red" class=" col-md-1">*</font>
				</div>

				<div class="form-group">
					<label class="control-label col-md-2" for="repwd">重复密码:</label>
					<div class="col-md-9">
						<input class="form-control" type="text" id="repwd" name="repwd" />
					</div>
					<font color="red" class="col-md-1">*</font>

				</div>
				<div class="form-group ">
					<div class="col-md-10 col-sm-offset-5">
					<input type="submit" class="btn btn-success" value="注册" />
					<input type="button" class="btn" value="重置" />
					</div>
				</div>
				
				
			</form>
		</div>
	</body>
</html>
