package dbcp;


import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/find_number.do")
public class Servlet extends HttpServlet {
	private int com_num;
	
	@Override
	public void init() throws ServletException {
		com_num = new Random().nextInt(100)+1;
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		String msg = "";
		if (com_num>num) {
			msg = num+" : 올려주세요";
		} else if (com_num<num) {
			msg = num+" : 내려주세요";
		} else {
			msg = num+ " : 정답입니다.";
		}
		request.setAttribute("msg", msg);
		RequestDispatcher rd = request.getRequestDispatcher("/main.jsp");
		rd.forward(request, response);
	}

}
