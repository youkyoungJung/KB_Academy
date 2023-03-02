package java01;

public class Hello {

	public static void main(String[] args) {
		char c1 ='가';
		System.out.println(c1);
		System.out.println((int)c1);
		System.out.println((char)(c1+1));
		System.out.println((char)(c1+100));
		
		System.out.println(99/10);//정수/정수 = 정수(정수부분)		
		System.out.println(99/10.0);//정수/실수 = 실수		
	}
}
