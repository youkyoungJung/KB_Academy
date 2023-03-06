package java0306;

public class ExamCall {
	public static void main(String[] args) {
		int a = 100;
		change(a);
		System.out.println("a="+a);
		
		// 기본형 , 참조형 변수 전달 차이
		// 기본형 - 복사해서 넘어가는 것
		
		int[] arr = new int[] {100, 200, 300};
		change2(arr); //주소가 넘어간것
		System.out.println("arr[1]=" + arr[1]);
	}

	private static void change2(int[] arr) {
		// TODO Auto-generated method stub
		arr[1]=900; //주소가 넘어간 곳에 1번째 방이 바뀐 것
	}

	private static void change(int a) {
		// TODO Auto-generated method stub
		a = 200;
	}

}
