package sp0424;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sp0424.bean.HelloBean;
import sp0424.bean.NumberGuess;

public class ���ڸ��߱� {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// ������ ����( ������ )
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("** ���� ���߱� ���� for SpringFW **");
		System.out.println("1~100���� ��ǻ���� ���ڸ� ���� ������");
		
		NumberGuess ng = context.getBean("numberGuess", NumberGuess.class);
		//NumberGuess ng = context.getBean(NumberGuess.class);
		Scanner sc = new Scanner(System.in);
		while(true) { 
			System.out.println("1~100���� ���ڸ� �Է��ϼ���: ");
			int userNum = sc.nextInt();
			String result = ng.checkNum(userNum);
			System.out.println(userNum + " " + result);
			if(result.startsWith("�����Դϴ�")) {
				System.out.println("�����Դϴ�.");
				break;
			}
		}//end
	}
}
