<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>������ ����</title>
</head>
<body>

<ul>
			<li>
				<a href="<c:url value='/jsp/login/login.do'/>">/jsp/login/login.do</a>
				(viewjsp/loginForm.jsp, &lt;form:* /&gt; �±� �� &lt;spring:message&gt; �±� ����) 
			</li>
			<li>
				<a href="<c:url value='/jsp/member/regist.do'/>">/jsp/member/regist.do</a>
				(viewjsp/registMemberForm.jsp, &lt;form:label/&gt; �±� ����) 
			</li>
			<li>
				<a href="<c:url value='/jsp/articleForm.do'/>">/jsp/articleForm.do</a>
				(viewjsp/article/*.jsp, &lt;form:form&gt; �±��� RESTful ���� ����) 
			</li>
				<li>
					<a href="<c:url value='/jsp/changeLanguage'/>?lang=ko">/jsp/changeLanguage?lang=ko</a>
					<a href="<c:url value='/jsp/changeLanguage'/>?lang=en">/jsp/changeLanguage?lang=en</a>
					(LocaleChangeController, LocaleResolver ���� �̿� Locale ��ȯ ����)
					<br/>
					��ũ Ŭ�� ��, <a href="<c:url value='/jsp/login/login.do'/>">/jsp/login/login.do</a>���� �� Ȯ�� 
				</li>        	
				<li>
					<a href="<c:url value='/jsp/login/login.do'/>?language=ko">/jsp/login/login.do?language=ko</a>
					<a href="<c:url value='/jsp/login/login.do'/>?language=en">/jsp/login/login.do?language=en</a>
					(LocaleChangeInterceptor�� �̿��� Locale ��ȯ ����)
				</li>        	
			
			<li>
				<a href="<c:url value='/tiles2/login/login.do'/>">/tiles2/login/login.do</a>
				(tiles2def/* �� viewtiles2/loginForm.jsp, Tiles2 ����) 
			</li>
			<li>
				<a href="<c:url value='/tiles2/member/regist.do'/>">/tiles2/member/regist.do</a>
				(tiles2def/* �� viewtiles2/registMemberForm.jsp, Tiles2 ����) 
			</li>
			
			<li>
				<a href="<c:url value='/vm/login/login.do'/>">/vm/login/login.do</a>
				(viewvm/loginForm.vm, Velocity ����, #springBind, #springShowErrors, #springMessage) 
			</li>
			<li>
				<a href="<c:url value='/vm/member/regist.do'/>">/vm/member/regist.do</a>
				(viewvm/registMemberForm.vm, Velocity ����, #springFormInput �� �� ���� ��ũ��) 
			</li>
			
			<li>
				<a href="<c:url value='/vmLayout/login/login.do'/>">/vmLayout/login/login.do</a>
				(viewvmlayout/template/*, viewvmlayout/loginForm.vm, VelocityLayoutViewResolver ����) 
			</li>
			
			<li>
				<a href="<c:url value='/download/file'/>">/download/file</a>
				(DownloadController �� DownloadView ����) 
			</li>
			<li>
				<a href="<c:url value='/download/pageRanks'/>">/download/pageRanks</a>
				(PageRanksController �� PageRanksView ���� ����)
			</li>
			<li>
				<a href="<c:url value='/download/pageReport'/>">/download/pageReport</a>
				(PageReportController �� PageReportView PDF ����)
			</li>
			<li>
				<a href="<c:url value='/download/pageXmlReport'/>">/download/pageXmlReport</a>
				(PageReportController �� MarshallingView XML ���� ����)
			</li>
			<li>
				<a href="<c:url value='/download/pageJsonReport'/>">/download/pageJsonReport</a>
				(PageReportController �� MappingJacksonJsonView JSON ���� ����)
			</li>
		</ul>

</body>
</html>