package java02;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinTask;

public class ExamArraySort {

	public static void main(String[] args) {
		//10개의 난수를 저장, 정렬
		Random r = new Random();
		int[] arr = new int[10];
		//10개의 난수를 저장
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100); //0-99난수 생성
		}
		//출력
		for (int i : arr) {
			System.out.print(i+" ");
		}
		//오름차순정렬, 작은수에서 큰 수 순서로 정렬
//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j = 0; j < arr.length-1; j++) {
//				//현대값이 이후보다 크면 현재와 이후는 값 교환
//				if(arr[j]> arr[j+1]){
//					int temp = arr[j+1];
//					arr[j+1] = arr[j];
//					arr[j] = temp;
//					    				}
//			}
//		}
		Arrays.sort(arr);
		//출력
		System.out.println();
		System.out.println("정렬후");
		for(int i: arr){
			System.out.print(i+" ");
		}
	}
}
