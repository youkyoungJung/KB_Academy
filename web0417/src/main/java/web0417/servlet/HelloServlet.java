package web0417.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//getWriter로 response 쓰기, 서블릿 경로명이 request.getContextPath(), 
		String mid = request.getParameter("mid");
		//String singer = request.getParameter("singer");
		String[] singer = request.getParameterValues("singer");
		String singers  = Arrays.toString(singer);
		
		response.getWriter().append("mid = " + mid);
		response.getWriter().append(", singer = " + singers);
		
	}

}
