package java0313;

import java.util.Scanner;

public class quickSort {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	//퀵정렬
	static void quickSort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl+pr)/2];
		
		do {
			while(a[pl]<x) pl++;
			while(a[pr]>x) pr--;
			if(pl <= pr) {
				swap(a, pl++, pr--);
			}
			
		}while(pl <= pr);
		
	
//		for(int i: a)
//			System.out.print("first: "+ i+" ");
//		System.out.println();
//		
		if(left < pr) quickSort(a, left, pr);

		if(pl < right) quickSort(a, pl, right);

		

	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("퀵정렬");
		System.out.println("요솟수");
		int nx = stdIn.nextInt();
		int[] x = new int[]{5,8,4,2,6,1,3,9,7};
		
//		for(int i=0; i<nx; i++) {
//			System.out.print("x[" + i + "]:");
//			x[i] = stdIn.nextInt();
//		}
		//맨왼 : 0, 맨오: nx-1
		//
		quickSort(x, 0 , nx-1);
		
		System.out.println("오름차순");
		for(int i : x)
			System.out.print(i + " ");
	}
}
