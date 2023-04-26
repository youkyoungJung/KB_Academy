package com.multicampus.kb03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NumberGuess {

	private int com_num = new java.util.Random().nextInt(100) + 1;

	@RequestMapping("/number_guess")
	public String request_mapping(@RequestParam(value = "n1", required = false, defaultValue = "-1") int n1,
			Model model) {
		
		if(n1 == -1) {
			model.addAttribute("msg", "숫자를 입력하세요");// request 에 전달
			return "number_guess";
		}
		String msg = n1 + " : ";
		if (com_num < n1) {
			msg += "낮춰주세요";
		} else if (com_num > n1) {
			msg += "높여주세요";
		} else {
			msg += "정답입니다.";
		}
		model.addAttribute("msg", msg);// request 에 전달

		return "number_guess";
	}
}
