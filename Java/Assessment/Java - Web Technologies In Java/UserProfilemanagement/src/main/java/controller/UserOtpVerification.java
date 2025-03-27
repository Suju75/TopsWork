package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/verifyotp")
public class UserOtpVerification extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String enteredOtp = req.getParameter("otp");
		HttpSession session = req.getSession();
		String generatedOtp = (String) session.getAttribute("otp");

		if (generatedOtp != null && generatedOtp.equals(enteredOtp)) {

			req.setAttribute("confirm", "OTP verified successfully. You can now reset your password.");
			resp.sendRedirect("reset_password.jsp");

		} else {

			session.setAttribute("not", "Invalid OTP. Please try again.");
			//req.getRequestDispatcher("userverifyotp.jsp").forward(req, resp);
			resp.sendRedirect("userverifyotp.jsp");

		}
	}
}
