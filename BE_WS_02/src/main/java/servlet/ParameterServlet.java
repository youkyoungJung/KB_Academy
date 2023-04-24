package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.ParameterDto;

/**
 * Servlet implementation class ParameterServlet
 */
@WebServlet("/params")
public class ParameterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 
		Map<String, String> m = new HashMap<>();
		String job = request.getParameter("job");
		m.put("job", job);
		String pageNo = request.getParameter("pageNo");
		m.put("pageNo", pageNo);
		String searchWord = request.getParameter("searchWord");
		m.put("searchWord", searchWord);
		request.setAttribute("m", m);
		RequestDispatcher rd = request.getRequestDispatcher("/getResult.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		ParameterDto dto = new ParameterDto();
		String name = request.getParameter("name");
		dto.setName(name);
		String email = request.getParameter("email");
		dto.setEmail(email);
		String gender = request.getParameter("gender");
		dto.setGender(gender);
		String[] hobby = request.getParameterValues("hobby");
		dto.setHobby(hobby);
		String favorite = request.getParameter("favorite");
		dto.setFavorite(favorite);
		String desc = request.getParameter("desc");
		dto.setDesc(desc);
		request.setAttribute("dto", dto);
		RequestDispatcher rd = request.getRequestDispatcher("/postResult.jsp");
		rd.forward(request, response);
	}

}
