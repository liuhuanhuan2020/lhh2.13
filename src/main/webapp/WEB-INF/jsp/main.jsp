<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>新闻管理</title>
	
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/dist/css/bootstrap.min.css">
	</head>
<body class="container">
		<div>
	<table width="80%" border="1" align="center"><a href="newlist.html">首页</a></table>
	<div align="center">欢迎您来到新闻发布系统&nbsp;&nbsp;当前登录用户：${session_user.uname}	&nbsp;&nbsp;<a href="xinwenUI">发布新闻</a></div>
	
	
	<div class="form-group">
		<label class="control-label col-md-2">标题：</label>
		<div class="col-md-3">
			<input type="text" class="form-control" name="biaoti">
		</div>
		<label class="control-label col-md-1">从</label>
		<div class="col-md-3">			
			<input type="text" class="form-control" name="biaoti">			
		</div>	
		<label class="control-label col-md-1">到当前</label>
		<div class="col-md-2">
			<td width="19%"><input type="submit" class="btn"  value="查   询">
		</div>
	</div>
	<form name="form1" method="post" action="mains" class="form-horizontal">
	
	  <table width="80%" border="1" align="center" class="table table-bordered table-striped table-hover">
		<tr bgcolor="#d7e5f6">
		  <td width="4%" nowrap><div align="center"><strong>序号</strong></td>
		  <td width="14%"><div align="center"><strong>标题</strong></td>
		  <td width="20%"><div align="center"><strong>作者</strong></td>
		  <td width="19%"><div align="center"><strong>发布时间</strong></td>
		  <td width="19%"><div align="center"><strong>操作</strong></td>
		</tr>
		<c:forEach items="${pageinfo.list}" var="c">
		<tr>
			<td align="center">${c.id }</td>
			<td align="center"><a href="Byid?id=${c.id}">${c.ntitle }</a></td>
			<td align="center">${c.nauthor }</td>
			<td align="center">${c.ntime }</td>
			<td align="center">
				<a href="login/delete?id=${c.id}">删除</a>				
			</td>
		</tr>
		</c:forEach>
		<tr>
   <td colspan="5">
   <span style="color:red">${pageinfo.pageNum }</span>/${pageinfo.pages }
    <a href="mains?page=1">首页</a> | 
    <a href="mains?page=${pageinfo.prePage }">上一页</a> |
    <a href="mains?page=${pageinfo.nextPage }">下一页</a> |
    <a href="mains?page=${pageinfo.lastPage }">尾页</a>
   </td>
  </tr>
	  </table>
	</form>
	
</body>

</html>