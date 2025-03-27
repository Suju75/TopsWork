package controller;

import java.io.IOException;

import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/resetPassword")
public class ResetPasswordController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String newPassword = req.getParameter("newPassword");
		String confirmPassword = req.getParameter("confirmPassword");
		String email = (String) req.getSession().getAttribute("email");
		UserDao dao = new UserDao();
		if (newPassword.equals(confirmPassword)) {
			int i = dao.updatePasswordInDatabase(email, newPassword);
			if (i > 0) {
				req.getSession().removeAttribute("otp");
				req.getSession().removeAttribute("email");
				resp.sendRedirect("login.jsp");
			}
		} else {
			req.setAttribute("err", "Passwords do not match. Please try again."); // Set error message
			req.getRequestDispatcher("reset_password.jsp").forward(req, resp);

		}
	}
}
