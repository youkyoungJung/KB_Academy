package com.multicampus.kb03;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChoSeungController {

	String text = "국민은행";

	//초성
	String[] CHO = {"ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄸ","ㄹ", "ㅁ", "ㅂ", "ㅃ",
			"ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ"};
	//중성
	String[] JOONG = {"ㅏ", "ㅐ", "ㅑ", "ㅒ", "ㅓ","ㅔ", "ㅕ", "ㅖ", "ㅗ",
			"ㅘ", "ㅙ", "ㅚ", "ㅛ", "ㅜ", "ㅝ", "ㅞ", "ㅟ", "ㅠ", "ㅡ" , "ㅢ", "ㅣ"};
	
	//종성 위치값
	String[] JONG = {"", "ㄱ", "ㄲ", "ㄴ", "ㄵ", "ㄶ", "ㄷ","ㄹ", "ㄺ","ㄻ", "ㄼ", 
			"ㄽ", "ㄾ", "ㅀ", "ㅁ", "ㅂ", "ㅄ",
			"ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ"};
	
	//get
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String get_home(Model model, HttpSession session) {
		String answer = "";
		String a="";
		for(int i=0; i< text.length(); i++) {
			char uniVal = text.charAt(i);
			if(uniVal >= 0xAC00) {
				uniVal = (char)(uniVal - 0xAC00);
				char cho = (char)((uniVal)/28/21);
				a = CHO[(int)cho];
				
			}
			answer += a;
			
		}
		System.out.println(answer);
		//model.addAttribute("hint", answer);
		session.setAttribute("hint", answer);
		
		return "choseung_game";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String post_home(Model model, HttpSession session, @RequestParam String answer) {
		System.out.println(answer);
		String result="";
		if(answer.equals(text)) {
			result = answer + "정답입니다.";
		}
		
		session.setAttribute("result", result);
		
		return "choseung_game";
	}
}
