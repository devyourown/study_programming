<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ�� ����</title>
</head>
<body>
	<jsp:useBean class="mall.PersonalInfo" id="pinfo" />
	<jsp:setProperty name="pinfo" property="name" value="�迬��" />
	<jsp:setProperty name="pinfo" property="gender" value="��" />
	<jsp:setProperty name="pinfo" property="age" value="29"/>
	�̸� : <jsp:getProperty property="name" name="pinfo"/>
	���� : <jsp:getProperty property="gender" name="pinfo"/>
	���� : <jsp:getProperty property="age" name="pinfo"/>
</body>
</html>