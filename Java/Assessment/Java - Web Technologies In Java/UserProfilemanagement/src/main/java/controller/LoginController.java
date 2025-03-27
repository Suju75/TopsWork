package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.User;

@WebServlet("/login")
public class LoginController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");

		UserDao dao = new UserDao();
		User user = dao.login(email, pass);
		HttpSession session = req.getSession();

		if (user != null) {
			session.setAttribute("email", user.getEmail());
			session.setAttribute("name", user.getFname());
			session.setAttribute("lname", user.getLname());
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		} else {
			req.setAttribute("err", "invalid Email....");
			req.getRequestDispatcher("login.jsp").forward(req, resp);

		}
	}
}
