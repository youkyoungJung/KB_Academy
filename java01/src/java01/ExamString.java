package java01;

public class ExamString {

	public static void main(String[] args) {
		
			String s1 = new String("Hello");//->heap영역에 들어감. 
			//new: 무조건heap영역(JVM의 GC작업에 사용될 수도 있음.)
			String s2 = "Hello"; //String Literal -> 클래스 영역에 들어감
			//이렇게 정의하면 메모리 overflow 발생가능성있음.
			String s4 = new String("Hello");//->s1, s4 다른 곳을 가리킴
			String s3 = "Hello"; //s2, s3 같은 곳을 가리킴
			
	}

}
