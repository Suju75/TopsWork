package controller;

import java.io.IOException;


import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.User;

@WebServlet("/requestOtp")
public class EmailVerifyController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		/*
		 * String email = req.getParameter("email");
		 * 
		 * System.out.println(email);
		 * 
		 * UserDao dao = new UserDao(); User user = dao.verifyEmail(email);
		 * System.out.println(user.getEmail());
		 * 
		 * HttpSession session = req.getSession();
		 * 
		 * if (user != null) { String otp = JavaEmailSending.EmailOtp(email);
		 * session.setAttribute("email", email); session.setAttribute("otp", otp);
		 * 
		 * // req.getRequestDispatcher("userverifyotp.jsp").forward(req, resp);
		 * resp.sendRedirect("userverifyotp.jsp");
		 * 
		 * } else {
		 * 
		 * session.setAttribute("err", "invalid");
		 * //req.getRequestDispatcher("forgetpassword.jsp").forward(req, resp);
		 * resp.sendRedirect("userverifyotp.jsp");
		 * 
		 * }
		 */

		String email = req.getParameter("email");
		System.out.println(email);
		UserDao dao = new UserDao();
		User user = dao.verifyEmail(email);

		HttpSession session = req.getSession();

		if (user != null) {

			String otp = JavaEmailSending.EmailOtp(email);
			session.setAttribute("otp", otp);
			session.setAttribute("email", email);

			resp.sendRedirect("userverifyotp.jsp");
		} else {

			session.setAttribute("err", "Email not registered. Please check your email or register first.");
			resp.sendRedirect("forgetpassword.jsp");
		}

	}
}
