package sp0424.bean;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class NumberGuess {

	Random ran = new Random();
	private int num = ran.nextInt(100)+1;
	
	public String checkNum(int userNum) {

		if(num > userNum) {
			return "���ڸ� ���̼���";
		}
		if(num < userNum) {
			return "���ڸ� ���� �ϼ���.";
		}
		return "�����Դϴ�. ";
	}
}
