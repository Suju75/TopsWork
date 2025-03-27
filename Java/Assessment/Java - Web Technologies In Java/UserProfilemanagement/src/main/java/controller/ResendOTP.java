package controller;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/resend")
public class ResendOTP extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		String email = (String) session.getAttribute("email");

		String newotp = JavaEmailSending.EmailOtp(email);

		session.setAttribute("newotp", newotp);
		

		System.out.println("Resend OTP On Your Gmail :" + email);
		System.out.println("New Otp :" + newotp);
		resp.getWriter().append(newotp);
	}
}
