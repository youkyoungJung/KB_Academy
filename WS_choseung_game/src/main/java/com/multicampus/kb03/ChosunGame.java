package com.multicampus.kb03;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChosunGame {
	
	final static String[] CHO = {"ㄱ","ㄲ","ㄴ","ㄷ","ㄸ","ㄹ","ㅁ","ㅂ","ㅃ",
			"ㅅ","ㅆ","ㅇ","ㅈ","ㅉ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ"};
	
	final static String[] JOONG = {"ㅏ","ㅐ","ㅑ","ㅒ","ㅓ","ㅔ","ㅕ","ㅖ","ㅗ","ㅘ",
			"ㅙ","ㅚ","ㅛ","ㅜ","ㅝ","ㅞ","ㅟ","ㅠ","ㅡ","ㅢ","ㅣ"};			
	
	final static String[] JONG = {"","ㄱ","ㄲ","ㄳ","ㄴ","ㄵ","ㄶ","ㄷ","ㄹ","ㄺ","ㄻ","ㄼ",
			"ㄽ","ㄾ","ㄿ","ㅀ","ㅁ","ㅂ","ㅄ","ㅅ","ㅆ","ㅇ","ㅈ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ"};

	private String[] list = {"국민은행", "멀티캠퍼스", "자바", "스프링"};
	
	@RequestMapping(value = "/chosun_game", method = RequestMethod.GET)
	public String chosunGame(HttpSession session) {
		session.setAttribute("idx", new Random().nextInt(list.length));
		return "chosun_game";
	}
	
	@RequestMapping(value = "/chosun_game_main", method = RequestMethod.GET)
	public String chosunGameMain(Model model, HttpSession session) {
		String chosun = "";
		Integer idx = (Integer) session.getAttribute("idx");
		String answer = list[idx];
		for(int i = 0; i < answer.length(); i++) {
			char uniVal = answer.charAt(i);
			// 한글일 경우만 시작해야 하기 때문에 0xAC00부터 아래의 로직을 실행한다
			if(uniVal >= 0xAC00) {
				uniVal = (char)(uniVal - 0xAC00);
				
				char cho = (char)(uniVal/28/21);
				chosun += CHO[cho];
			}
		}
		model.addAttribute("chosun", chosun);
		return "chosun_game_main";
	}
	
	@RequestMapping(
			value = "/chosun_game_main",
			method = RequestMethod.POST)
	public String chosunGameMainPost(
			Model model,
			HttpSession session,
			@RequestParam(value = "userInput") String userInput) {
		
		Integer idx = (Integer) session.getAttribute("idx");
		String answer = list[idx];
		userInput = userInput.trim();
		String result = userInput + " : ";
		int count = 0;
		for (int i = 0; i < answer.length(); i++) {
			if (answer.charAt(i) == userInput.charAt(i))
				count++;
		}
		if ((answer.length() == userInput.length()) && (userInput.length() == count)) {
			result += "정답입니다";
		} else {
			result += count + "개 맞춤";
		}
		model.addAttribute("result", result);
		return chosunGameMain(model, session);
	}
}
