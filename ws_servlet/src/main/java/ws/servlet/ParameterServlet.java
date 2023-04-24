package ws.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ParameterServlet
 */
@WebServlet("/params")
public class ParameterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html; charset=UTF-8");
		//HttpSession session = request.getSession();
		String job = request.getParameter("job");
		String pageNo = request.getParameter("pageNo");
		String searchWord = request.getParameter("searchWord");
		
		System.out.println("job :" +job);
		System.out.println("pageNo: " + pageNo);
		System.out.println("searchWord: "+ searchWord);
		
		writer.print("<h1> job : " + job + "</h1>");
		writer.print("<h1> pageNo : " + pageNo + "</h1>");
		writer.print("<h1> searchWord : " + searchWord + "</h1>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8"); 
		
		response.setContentType("text/html; charset=UTF-8");
		//HttpSession session = request.getSession();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		String favorite = request.getParameter("favorite");
		String desc = request.getParameter("desc");
		
		System.out.println("name :" +name);
		System.out.println("email: " + email);
		System.out.println("gender: "+ gender);
		System.out.println("favorite: "+ favorite);
		System.out.println("desc: "+ desc);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1> name : " + name +"</h1><br>");
		out.println("<h1> email : " + email +"</h1><br>");
		out.println("<h1> gender : " + gender +"</h1><br>");
		
		out.println("<h1> hobby : ");
		for(int i=0; i<hobby.length; i++) {
			out.print(hobby[i] + ", ");
		}
		out.print("</h1>");
		
		out.println("<br> <h1>favorite : " + favorite+"</h1>");
		out.println("<br> <h1>desc : " + desc +"</h1><br>");
		out.println("</body>");
		out.println("</html>");
		
		
		
	}

}
