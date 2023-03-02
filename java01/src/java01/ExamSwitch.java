package java01;

import java.util.Scanner;

public class ExamSwitch {

	public static void main(String[] args) {
		// TODO 학점 받아서 등급 츨력
		Scanner sc = new Scanner(System.in);
		System.out.print("학점을 입력하세요>>");
		int ans = sc.nextInt();

		switch(ans/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		case 5:
			System.out.println("E");
			break;
		default:
			System.out.println("F");
			break;
		
		}

	}

}
