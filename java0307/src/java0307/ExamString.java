package java0307;

public class ExamString {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		System.out.println(s1 == s2);// == 주소값
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
		
		System.out.println(s1.equals(s3)); // .equals() 문자열 값 비교
		System.out.println(s1.equals(s4));
		
		s1 = s1 + s1;
		System.out.println(s1);
	}

}
