package java0313;

public class Exam연산자 {

	public static void main(String[] args) {
		int a = 1;
		//int b = a++ + 1;
		int c = a++ + ++a + a++ + ++a;
		//System.out.println(b);
		System.out.println(c);
		System.out.println(a);
	}

}
