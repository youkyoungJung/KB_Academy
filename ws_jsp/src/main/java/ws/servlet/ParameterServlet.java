package ws.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ws.dto.ParameterDto;

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
		

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("job", job);
		map.put("pageNo", pageNo);
		map.put("searchWord", searchWord);
		
		
		System.out.println("job :" +job);
		System.out.println("pageNo: " + pageNo);
		System.out.println("searchWord: "+ searchWord);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//요청의 한글처리(입력한 한글을 한글로 표기)
		request.setCharacterEncoding("UTF-8"); 
		PrintWriter out = response.getWriter();
		//응답의 한글처리(html에 한글이 보이도록)
		response.setContentType("text/html; charset=UTF-8");
		//HttpSession session = request.getSession();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		String favorite = request.getParameter("favorite");
		String desc = request.getParameter("desc");
		
		
		ParameterDto dto = new ParameterDto();//request에 담아야함..!!
		dto.setName(name);
		dto.setEmail(email);
		dto.setGender(gender);
		dto.setHobby(hobby);
		dto.setFavorite(favorite);
		dto.setDesc(desc);
		
		//request에 담기 ** 넘기고싶은값은  request 에 담아야함.
		request.setAttribute("mydto",dto);//키-값
		RequestDispatcher rd = request.getRequestDispatcher("/postResult.jsp");
		rd.forward(request, response);
		
	}

}
