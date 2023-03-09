package 백준;

import java.util.Scanner;

public class bj10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//n
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		int count = 0;
		for(int i=0; i<arr.length;i++) {
			int j = arr[i];
			if(j==v) count++;
		}
		System.out.println(count);
		
	}

}
