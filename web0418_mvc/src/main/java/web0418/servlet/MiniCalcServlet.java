package web0418.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MiniCalcServlet
 */
@WebServlet("/mini_calc.do")
public class MiniCalcServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 계산기 폼화면 제공
		String url = "/WEB-INF/jsp/mini_calc.jsp";
		request.getRequestDispatcher(url).forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");
		String opr = request.getParameter("opr");
		
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		
		switch(opr) {
			case "+":
				request.setAttribute("result", num1+num2);
				break;
			case "-":
				request.setAttribute("result", num1-num2);
				break;
			case "*":
				request.setAttribute("result", num1*num2);
				break;
			case "/":
				request.setAttribute("result", num1/num2);
				break;
			case "%":
				request.setAttribute("result", num1%num2);
				break;
		}
		String url = "/WEB-INF/jsp/mini_calc.jsp";
		request.getRequestDispatcher(url).forward(request, response);
		
	}

}
