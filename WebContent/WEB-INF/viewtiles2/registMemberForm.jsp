<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

</head>
<body>

<form:form commandName="memberInfo">
<p>
	<form:label path="userId">ȸ�� ID</form:label>
	<form:input path="userId"/>
	<form:errors path="userId"/>
</p>

<p>
	<form:label path="name">�̸�</form:label>
	<form:input path="name"/>
	<form:errors path="name"/>
</p>	

<p>
	<form:label path="address.address1">�ּ�1</form:label>
	<form:input path="address.address1"/>
	<form:errors path="address.address1"/>
</p>	

<p>
	<form:label path="address.address2">�ּ�2</form:label>
	<form:input path="address.address2"/>
	<form:errors path="address.address2"/>
</p>	

<p>
	<form:label path="jobCode">����</form:label>
	<form:select path="jobCode">
		<option value="">----�����ϼ���----</option>
		<form:options items="${jobCodes}" itemLabel="label" itemValue="code"/>
	</form:select>
	<form:errors path="jobCode"/>
</p>

<p>
	<form:label path="favorites">��ȣ OS</form:label>
	<form:checkboxes items="${favoritesOsNames}" path="favorites" />
	<form:errors path="favorites"/>		
</p>
<p>
	<form:label path="tool">�ַ� ����ϴ� ������</form:label>
	<form:radiobuttons path="tool" items="${tools}"/>
</p>
<p>
	<form:label path="etc">��Ÿ</form:label>
	<form:textarea path="etc" cols="20" rows="3"/>
</p>
<p>
	<form:checkbox path="contractAgreement" label="����� �����մϴ�."/>
</p>
<p>
	<input type="submit" value="ȸ�� ���">
</p>		

</form:form>
</body>
</html>