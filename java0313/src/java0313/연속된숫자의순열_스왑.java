package java0313;

import java.util.Arrays;

public class 연속된숫자의순열_스왑 {

	public static void main(String[] args) {
//		for(int i=0; i<=2; i++) {
			int[] arr = new int[] {1,2,3,4};
			//1->1, 1->2, 1->3 스왑
			//0->0, 0->1, 0->2 스왑
/**			int temp = arr[0];
			arr[0] = arr[0+i];
			arr[0+i] = temp;
			
			System.out.println(Arrays.toString(arr));
			temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;
			System.out.println(Arrays.toString(arr));
			
			temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;
			System.out.println(Arrays.toString(arr));
			
			temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;
			System.out.println(Arrays.toString(arr));
**/
			
//		}
			int f, s, t, fo;
			
			for(int i=0; i<4; i++) {
				f = arr[i];
				for(int j=i; j<j-i; j++) {
					
				}
			}
	}

}
