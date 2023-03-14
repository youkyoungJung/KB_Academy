package java0313;

import java.util.Scanner;

public class ExamCombination {

	public static void main(String[] args) {
		//nCr = n! / (n-r)!r!
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int[] d = new int[n+1];//팩토리얼 계산 결과값 저장용
		//d에 팩토리얼 계산결과를 저장한다.
		d[0] = 1;
		d[1] = 1;
		for(int i =2; i <d.length; i++) {
			d[i] = d[i-1]*i; //i! 계산결과 저장
		}
		System.out.println(d[n]/(d[n-r]*d[r]));
	}//end main

}
