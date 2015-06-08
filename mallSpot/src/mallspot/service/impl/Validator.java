package mallspot.service.impl;

public class Validator {
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

}
