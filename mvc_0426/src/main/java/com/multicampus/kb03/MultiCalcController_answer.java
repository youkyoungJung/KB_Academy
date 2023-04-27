package com.multicampus.kb03;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.multicampus.kb03.dto.MultiCalcDto;

@Controller
public class MultiCalcController_answer {

	@RequestMapping("/multi_calc_game")
	public String multi_calc_game(Model model, HttpSession session) {
		session.setAttribute("game_seq", 1);
		return "multi_calc_game";
	}

	private int r1;
	private int r2;

	@RequestMapping(value = "/multi_calc_game_main", method = RequestMethod.GET)
	public String multi_calc_game_main(Model model, HttpSession session) {
		//System.out.println("main GET");
		r1 = new java.util.Random().nextInt(9) + 1;
		r2 = new java.util.Random().nextInt(20) + 11;
		model.addAttribute("r1", r1);
		model.addAttribute("r2", r2);
		return "multi_calc_game_main";
	}

	/*
	 * @RequestMapping(value = "/multi_calc_game_main", method = RequestMethod.POST)
	 * public String multi_calc_game_main_post(Model model, @RequestParam(value =
	 * "n1") int n1,
	 * 
	 * @RequestParam(value = "n2") int n2, @RequestParam(value = "ans") int ans,
	 * HttpSession session) { Integer game_seq =
	 * (Integer)session.getAttribute("game_seq"); game_seq += 1;
	 * session.setAttribute("game_seq", game_seq); String result = n1 + " * " + n2 +
	 * " = " + ans; System.out.println("result=" + result); if (n1 * n2 == ans) {
	 * result += " 정답입니다"; } else { result += " 오답입니다.정답은 " + (n1 * n2); }
	 * model.addAttribute("result", result); return multi_calc_game_main(model,
	 * session); }
	 */
	
	@RequestMapping(value = "/multi_calc_game_main", method = RequestMethod.POST)
	public String multi_calc_game_main_post(Model model, HttpSession session, MultiCalcDto dto) {
		Integer game_seq = (Integer)session.getAttribute("game_seq");
		game_seq += 1;
		session.setAttribute("game_seq", game_seq);
		String result = dto.getN1() + " * " + dto.getN2() + " = " + dto.getAns();
		System.out.println("result=" + result);
		if (dto.getN1() *  dto.getN2() ==  dto.getAns()) {
			result += " 정답입니다";
		} else {
			result += " 오답입니다.정답은 " + (dto.getN1() *  dto.getN2());
		}
		model.addAttribute("result", result);
		return multi_calc_game_main(model, session);
	}
}
