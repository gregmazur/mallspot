<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
			try{if (name.isEmpty()) {
				session.setAttribute("errorText",
						"The password needs to be more then 6 symbols");
				response.sendRedirect("reg.jsp");
			}}catch (Exception e){
				e.printStackTrace();
				session.setAttribute("errorText",
						"Try again");
				response.sendRedirect("reg.jsp");
			}
		}

		
	%>
</body>
</html>