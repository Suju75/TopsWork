package controller;

import java.io.IOException;

import dao.UserDao;
import jakarta.mail.Session;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/changePassword")
public class ChangePasswordController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);

		String email = (String) session.getAttribute("email");

		String oldPassword = req.getParameter("oldPassword");
		String newPassword = req.getParameter("newPassword");
		String confirmPassword = req.getParameter("confirmPassword");

		System.out.println("old pass :" + oldPassword + ",new Pass:" + newPassword + ",confirmpass:" + confirmPassword);

		UserDao dao = new UserDao();
		int i = dao.changepass(oldPassword, newPassword, confirmPassword, email);
		if (i > 0) {
			String message = "Password Changed Successfully....";
			req.setAttribute("success", message);
			req.getRequestDispatcher("changepassword.jsp").forward(req, resp);

		} else {
			req.setAttribute("err", "Invalid old password not match");
			req.getRequestDispatcher("changepassword.jsp").forward(req, resp);
		}
	}
}
