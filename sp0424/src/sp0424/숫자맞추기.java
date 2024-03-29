package sp0424;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sp0424.bean.HelloBean;
import sp0424.bean.NumberGuess;

public class 숫자맞추기 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 스프링 적용( 빈적용 )
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("** 숫자 맞추기 게임 for SpringFW **");
		System.out.println("1~100사이 컴퓨터의 숫자를 맞춰 보세요");
		
		NumberGuess ng = context.getBean("numberGuess", NumberGuess.class);
		//NumberGuess ng = context.getBean(NumberGuess.class);
		Scanner sc = new Scanner(System.in);
		while(true) { 
			System.out.println("1~100사이 숫자를 입력하세요: ");
			int userNum = sc.nextInt();
			String result = ng.checkNum(userNum);
			System.out.println(userNum + " " + result);
			if(result.startsWith("정답입니다")) {
				System.out.println("정답입니다.");
				break;
			}
		}//end
	}
}
