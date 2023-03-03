package java02;

public class ExamArray2 {
	public static void main(String[] args) {
		int arr[][] = new int[2][3];
		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[0][2] = 300;
		System.out.println(arr.length);//2
		System.out.println(arr[0].length);//3
		System.out.println(arr[1].length);//3
	}

}
