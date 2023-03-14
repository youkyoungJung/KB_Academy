package java0313;

public class Exam재귀 {

	public static void main(String[] args) {
		//팩토리얼
		//5*4*3*2*1
		int ans = factorial(3);
		System.out.println(ans);
	}

	private static int factorial(int n) {
		//종료조건 검사
		if(n>0)
			return n*factorial(n-1);
		else
			return 1;
	}

}
