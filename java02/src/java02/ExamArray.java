package java02;

public class ExamArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = null;// 선언
		System.out.println(arr);
		arr = new int[3];//초기화
		System.out.println(arr);
		
		int[] arr2 = new int[3];//초기화
//		System.out.println(arr2);
		for (int i=0; i<3;i++) {
			System.out.println(arr2[i]);
		}//000으로 초기됨을 확인
		
		arr2[0]=100;
		arr2[1]=200;
		arr2[2]=300;
		
		for (int i=0; i<3;i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("arr2 의 길이= "+arr2.length);
	}

}
