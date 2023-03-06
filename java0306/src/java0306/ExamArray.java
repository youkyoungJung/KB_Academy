package java0306;

public class ExamArray {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		System.out.println("arr1의 길이="+arr1.length);
		
		int[] arr2 = new int[] {100, 200, 300};
		
////
		int[][] arr3 = new int[][] {{1,2,3},{4,5,6}};
		//가변배열
		int[][] arr4 = new int[][] {{1,2},{4,5,6}};
		//2차원배열변수:arr, 1차원배열변수:arr[0]주소값.
		System.out.println("arr3.length="+arr3.length);
		System.out.println(arr3[0].length);
		
		System.out.println("arr4.length="+arr4.length);
		
		///for-each
		for(int is :arr2) {
			System.out.print(is+" ");
		}
	}

}
