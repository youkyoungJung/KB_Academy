package java02;

import java.util.Iterator;

public class ExamForEach {

	public static void main(String[] args) {
		int[] arr = new int[] {100, 200, 300};
		for (int i = 0; i < arr.length; i++) {
			int j = arr[i];
			System.out.println(j);
		}
		
		//foreach
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
