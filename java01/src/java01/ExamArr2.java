package java01;

public class ExamArr2 {

	public static void main(String[] args) {
		//변수 선언 할 때만 사용 가능S
		int[] points = {100, 200, 300};//초기화1
		//선언과 재할당시 언제나 가능
		int[] points2 = new int[]{100, 200, 300};//초기화2
		for (int i = 0; i < points.length; i++) {
			System.out.println(points[i]);
			
		}
		
		points = new int[] {300,400,500};
		for (int i = 0; i < points.length; i++) {
			System.out.println(points[i]);
			
		}

	}

}
