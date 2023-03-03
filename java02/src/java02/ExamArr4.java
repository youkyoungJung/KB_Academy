package java02;
	
public class ExamArr4 {
	public static void main(String[] args) {
		//가변배열
		int[][] arr = new int[3][];
		//arr[0] = new int[2] {10, 20};-> 불가
		arr[0] = new int[] {10, 20};
		arr[1] = new int[] {30, 40, 50};
		arr[2] = new int[] {60, 70, 80, 90};
		
		//       arr[0]->[][]
		//arr -> arr[1]->[][][]
		//       arr[2]->[][][][]
		
		System.out.println(arr.length);//3
		System.out.println(arr[0].length);//2
		
		
	}
}
