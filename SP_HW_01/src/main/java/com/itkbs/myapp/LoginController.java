package com.itkbs.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.itkbs.myapp.dao.CustomerDao;
import com.itkbs.myapp.dto.CustomerDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {

	@Autowired
	private CustomerDao ctdao;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login( Model model) {
		
		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login_post(@RequestParam("email")String email, @RequestParam("password")String password, Model model, HttpSession session) {
		System.out.println(email);
		System.out.println(password);
		CustomerDto user = ctdao.selectOne(email);
		System.out.println(user);
		
		if(user != null){
			if(user.getPassword().equals(password)) {
				System.out.println("로그인되었음");
				model.addAttribute("user", user);
				session.setAttribute("user", user);//유저정보담기
				return "mypage";
			}
		}
		System.out.println("그런 회원정보 없음");
		return "login";
	}
	
}
