package java0308;

import java.util.Arrays;

public class ExamSort {

	public static void main(String[] args) {
		//배열 정렬
		int[] arr = new int[] {3,7,1,4,5};
		Arrays.sort(arr);
		System.out.println(arr);
//		for (int i : arr) {
//			System.out.println(i);
//		}
		
		String s = Arrays.toString(arr);
		System.out.println(s);
	}

}
