package sp0424.bean;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class NumberGuess {

	Random ran = new Random();
	private int num = ran.nextInt(100)+1;
	
	public String checkNum(int userNum) {

		if(num > userNum) {
			return "숫자를 높이세요";
		}
		if(num < userNum) {
			return "숫자를 낮게 하세요.";
		}
		return "정답입니다. ";
	}
}
