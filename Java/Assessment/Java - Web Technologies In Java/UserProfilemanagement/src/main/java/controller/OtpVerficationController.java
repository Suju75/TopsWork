package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/otp")
public class OtpVerficationController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String enterOtp = req.getParameter("otp");
		String genratedOtp = (String) session.getAttribute("otp");
		String newotp = (String) session.getAttribute("newotp");

		if (enterOtp != null && enterOtp.equals(genratedOtp) || enterOtp.equals(newotp)) {
			req.setAttribute("Otp", "Login Access Granted");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		} else {
			// OTP is incorrect
			req.setAttribute("err", "Invalid OTP. Please try again.");
			req.getRequestDispatcher("emailverifyotp.jsp").forward(req, resp);
		}
	}
}
