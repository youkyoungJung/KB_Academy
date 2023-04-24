package web0414.servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindNumberServlet
 */
@WebServlet("/find_number2")
public class 숫자만들기_서블렛편 extends HttpServlet {

    private int com_num;
    
    @Override
    public void init() throws ServletException {
        //서블릿이 최초 생성이후 한번만 실행
        com_num = new Random().nextInt(100) + 1;
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        if( com_num == 0 )//초기화안한 상태
//            com_num = new Random().nextInt(100) + 1;
        String user_num = request.getParameter("user_num");
        int un = Integer.parseInt(user_num);
        String msg = user_num+" : ";
        if( com_num > un )
            msg += "높여주세요~";
        else if( com_num < un )
            msg += "낮춰주세요~";
        else 
            msg += "정답입니다.";
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().append("<!DOCTYPE html>\r\n"
                + "<html>\r\n"
                + "<head>\r\n"
                + "<meta charset=\"UTF-8\">\r\n"
                + "<title>숫자맞추기 게임</title>\r\n"
                + "</head>\r\n"
                + "<body>\r\n"
                + "    <h1>숫자맞추기 게임</h1>\r\n"
                + "    <p>1~100사이 컴퓨터가 정한 숫자를 맞춰보세요</p>\r\n"
                + "    <form action=\"find_number\">\r\n"
                + "        <label>\r\n"
                + "            숫자 : <input name=\"user_num\" type=\"number\" placeholder=\"1~100사이 숫자\"> \r\n"
                + "        </label>\r\n"
                + "        <input type=\"submit\" value=\"정 답 확 인\">\r\n"
                + "    </form>    \r\n"
                + "<div>"+msg+"</div>"
                + "</body>\r\n"
                + "</html>\r\n"
                + "\r\n"
                + "\r\n"
                + "\r\n"
                + "\r\n"
                + "\r\n"
                + "\r\n"
                + "");
    }

}