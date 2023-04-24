package ws.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		init();
		System.out.println("doGet() is called!!!");
		PrintWriter writer = response.getWriter();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public LifeCycleServlet() {
		System.out.println("LifeCycleServlet() is called!!!");
	}
	@Override
	public void destroy() {
		System.out.println("destory() is called!!!");
		super.destroy();
	}
	@Override
	public void init() throws ServletException {
		System.out.println("init() is called!!!");
		super.init();
	}
}
