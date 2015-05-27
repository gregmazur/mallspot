<%@page import="org.hillel.it.mallspot.persistance.repository.UserRepository"%>
<%@page import="org.hillel.it.mallspot.model.entity.UserType"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="user" class="org.hillel.it.mallspot.model.entity.User" scope="session"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		if (request.getMethod().equalsIgnoreCase("POST")) {
			String name = request.getParameter("inputName");
			String email = request.getParameter("inputEmail");
			String pass = request.getParameter("inputPassword");
			String passConfrim = request.getParameter("inputpassword2");
			String userType = request.getParameter("inputName");
			String type = request.getParameter("optionsRadios");
			if (pass.length() > 5 && pass.length() <12 ) {
				session.setAttribute("errorText",
						"The password needs to be more then 6 symbols and less than 12");
				response.sendRedirect("reg.jsp");
			}
			if (!pass.equals(passConfrim)){
				session.setAttribute("errorText",
						"Entered passwords are not matched");
				response.sendRedirect("reg.jsp");
			}
			
		}

		
	%>
</body>
</html>