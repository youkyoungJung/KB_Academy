package web0420.servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web0420.controller.Controller;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontServletController extends HttpServlet {

	private HashMap<String, Controller> map = new HashMap<>();

	@Override
	public void init() throws ServletException {
		map.put("/login.do", new LoginController());
		map.put("/board_list.do", new BoardListController());
		map.put("/board_insert_form.do", new BoardInsertFormController());
		//map.put("/board_insert_action.do", new BoardInsertActionController());
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//한글처리
		request.setCharacterEncoding("utf-8");
		//포트번호 이후 경로 : RequestURI
		String url = request.getRequestURI();
		//contextPath : 프로젝트 이름
		String contextPath = request.getContextPath();
		String path = url.substring(contextPath.length());
		String method = request.getMethod();
		System.out.println("url=" + url);
		System.out.println("contextPath=" + contextPath);
		System.out.println("path=" + path);
		System.out.println("method=" + method);
		
		/*
		 * Controller controller = map.get(path); controller.execute(request, response);
		 */
		map.get(path).execute(request, response);
		
		/*
		 * if(path.equals("/board_insert_form.do")) { Controller c = new
		 * BoardInsertFormController(); c.execute(request, response); }
		 */
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
