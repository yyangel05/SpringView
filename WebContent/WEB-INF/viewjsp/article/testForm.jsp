<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String servletPath = request.getRequestURI();
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�׽�Ʈ �ڵ�</title>
</head>
<body>

<form:form action="/SpringView/jsp/article/${article.id}" commandName="article" method="delete">
<input type="submit" value="����">
</form:form>

<form:form action="/SpringView/jsp/article/${article.id}" commandName="article" method="put">
<input type="submit" value="����">
</form:form>

<form:form action="/SpringView/jsp/article" commandName="article" method="post">
<input type="submit" value="����">
</form:form>


</body>
</html>