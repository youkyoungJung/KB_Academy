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
public class MypageController {

	@Autowired
	private CustomerDao ctdao;

	@RequestMapping(value = "/mypage", method = RequestMethod.GET)
	public String mypage(Model model, HttpSession session) {

		return "mypage";
	}

	@RequestMapping(value = "/mypage", method = RequestMethod.POST)
	public String mypage_post(@RequestParam("password") String password, @RequestParam("new_pw")String new_pw, Model model, HttpSession session) {
		CustomerDto dto = (CustomerDto) session.getAttribute("user");
		dto.setPassword(new_pw);
		ctdao.update(dto);
		return "mypage_detail";
	}
	
	@RequestMapping(value = "/mypage/detail", method = RequestMethod.GET)
	public String mypage_detail_get(Model model, HttpSession session) {
//		ctdao.selectOne(model.);
		CustomerDto dto = (CustomerDto) session.getAttribute("user");
		model.addAttribute("user", dto);
		return "mypage_detail";
	}
	

	@RequestMapping(value = "/mypage/detail", method = RequestMethod.POST)
	public String mypage_detail(Model model, HttpSession session) {
//		ctdao.selectOne(model.);
		CustomerDto dto = (CustomerDto) session.getAttribute("user");
		model.addAttribute("user", dto);
		return "mypage_detail";
	}
	

	  

}
