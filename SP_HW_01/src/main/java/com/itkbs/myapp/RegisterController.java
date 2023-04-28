package com.itkbs.myapp;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itkbs.myapp.dao.CustomerDao;
import com.itkbs.myapp.dto.CustomerDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class RegisterController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@Autowired
	private CustomerDao ctdao;
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model , HttpSession session) {
		
		return "register";
	}
	
	//Mybatis 로 DB연결
	//sqlSessionTemplate 은 SqlSession 구현함.
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register_post(@ModelAttribute("customer") CustomerDto dto,  Model model, HttpSession session) {
		int insert = ctdao.insert(dto);
		//model.addAttribute("bbs_list" , insert);
		System.out.println("insert 완료" + insert);
		
		return "register";
	}

	
}
