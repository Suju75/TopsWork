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

@WebServlet("/add")
public class RegisterController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String mob = req.getParameter("mob");
		String add = req.getParameter("address");
		String gender = req.getParameter("gender");
		String pass = req.getParameter("pass");

		System.out.println(fname + "" + lname + "" + "" + email + "" + mob + "" + gender + "" + pass);

		User u = new User();
		u.setFname(fname);
		u.setLname(lname);
		u.setEmail(email);
		u.setMobNo(mob);
		u.setAddress(add);
		u.setGender(gender);
		u.setPass(pass);

		UserDao dao = new UserDao();
		HttpSession session = req.getSession();
		int i = dao.registerUser(u);
		if (i > 0) {
			String otp = JavaEmailSending.EmailOtp(email);

			session.setAttribute("otp", otp);
			session.setAttribute("email", email);

			req.getRequestDispatcher("emailverifyotp.jsp").forward(req, resp);

		} else {
			req.setAttribute("emailerr", "Email Already Registerd");
			req.getRequestDispatcher("signup.jsp").forward(req, resp);
		}
	}
}
