package web0414.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet({"/my_calc" })
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		String num1 = request.getParameter("num1");
		int n1 = Integer.parseInt(num1);
		
		String opr = request.getParameter("opr");
		
		String num2 = request.getParameter("num2");
		int n2 = Integer.parseInt(num2);
		
		System.out.println(num1+ "," + opr + ","+ num2 );
		
		int ans = 0;
		if(opr.equals("+")) {
			ans = n1 + n2;
		}else if(opr.equals("-")) {
			ans = n1 - n2;
		}else if(opr.equals("*")) {
			ans = n1 * n2;
		}else if(opr.equals("/")) {
			ans = n1 /n2;
		}else if(opr.equals("%")) {
			ans = n1 % n2;
		}
		
		System.out.println(num1+ "," + opr + ","+ num2 +"answer: " + ans);
	}

}
