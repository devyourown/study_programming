<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원 정보</title>
</head>
<body>
	<jsp:useBean class="mall.PersonalInfo" id="pinfo" />
	<jsp:setProperty name="pinfo" property="name" value="김연희" />
	<jsp:setProperty name="pinfo" property="gender" value="여" />
	<jsp:setProperty name="pinfo" property="age" value="29"/>
	이름 : <jsp:getProperty property="name" name="pinfo"/>
	성별 : <jsp:getProperty property="gender" name="pinfo"/>
	나이 : <jsp:getProperty property="age" name="pinfo"/>
</body>
</html>