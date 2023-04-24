package web0418.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web0418.dto.SimpleDto;

@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//
		String mid = request.getParameter("mid");
		String[] singer = request.getParameterValues("singer");
		SimpleDto dto = new SimpleDto();//request에 담아야함..!!
		dto.setMid(mid);
		dto.setSinger(singer);
		
		//request에 담기 ** 넘기고싶은값은  request 에 담아야함.
		request.setAttribute("mydto",dto);//키-값
		System.out.println(dto);
		
		//print_form.jsp로 넘겨서 출력함.
		RequestDispatcher rd = request.getRequestDispatcher("/print_form.jsp");//요청을 전달하는 객체
		rd.forward(request, response);
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 
		doGet(request, response);
	}

}
