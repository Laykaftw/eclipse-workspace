package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ms", urlPatterns = { "/controleur" })
public class MyServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String L = request.getParameter("login");
		String p = request.getParameter("password");
		request.setAttribute("login", L);
		request.setAttribute("password", p);
		request.getRequestDispatcher("vue.jsp").forward(request, response);
	}

}