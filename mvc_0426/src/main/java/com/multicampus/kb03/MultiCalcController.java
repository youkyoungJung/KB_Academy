package com.multicampus.kb03;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MultiCalcController {
	int cnt = 0;
	int number = 0;
	long beforeTime = System.currentTimeMillis();
	long afterTime;
	long secDiffTime;

	@RequestMapping(value = "/multi_calc", method = RequestMethod.GET)
	public String multi_calc(Model model) {

		++number;
		Random random = new Random();
		int n1 = random.nextInt(9) + 1;
		int n2 = (int) (Math.random() * (30 - 10 + 1)) + 10;
		int answer = n1 * n2;
		System.out.println(answer);

		model.addAttribute("n1", n1);
		model.addAttribute("n2", n2);
		model.addAttribute("answer", answer);
		model.addAttribute("number", number);

		
		
		return "multi_calc";

		/*
		 * long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기 long
		 * afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기 long secDiffTime
		 * = (afterTime - beforeTime)/1000; //두 시간에 차 계산
		 * System.out.println("시간차이(m) : "+secDiffTime);
		 */

	}

	@RequestMapping(value = "/multi_calc", method = RequestMethod.POST)
	public String multi_calc_post(Model model, @RequestParam("answer") int answer, @RequestParam("wanswer") int wanswer,
			@RequestParam("n1") int n1, @RequestParam("n2") int n2, @RequestParam("number") int number) {

		if (answer == wanswer) {
			// session.setAttribute("session", "true");
			++cnt;
			System.out.println("cnt" + cnt);
			if (cnt == 10) {
				model.addAttribute("n1", n1);
				model.addAttribute("n2", n2);
				model.addAttribute("answer", answer);
				model.addAttribute("number", number);
				model.addAttribute("finish", "모든 퀘스트를 완료하였습니다.");
				afterTime = System.currentTimeMillis();
				secDiffTime = (afterTime - beforeTime)/1000;
				System.out.println("시간차이(ms) : "+secDiffTime);
				// return multi_calc(model);
			} else {
				model.addAttribute("finish", "정답입니다.");
				return multi_calc(model);
			}

		} else {
			model.addAttribute("finish", "틀렸습니다. 다시시도하세요");
			model.addAttribute("n1", n1);
			model.addAttribute("n2", n2);
			model.addAttribute("answer", answer);
			model.addAttribute("number", number);
		}
		return "multi_calc";
	}
}
