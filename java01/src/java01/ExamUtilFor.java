package java01;

import java.util.Random;
import java.util.Scanner;

public class ExamUtilFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		int ans  = -1;

		Random random = new Random();
		int r = random.nextInt(100);
		System.out.println("난수:"+r);
		//0~99 사이 난수 생성
		
		for (; r != ans;) {//탈출조건 - 무한반복
			
			System.out.println("0-99사이 숫자를 입력하세요>> ");
			ans  = sc.nextInt();
			
			if (r == ans) {
				System.out.println("정답입니다.");
			}else if(r < ans) {
				System.out.println("숫자를 낮춰주세요.");
			}else {
				System.out.println("숫자를 높여주세요.");
			}
			
		}//end for
		
	}//end main

}
