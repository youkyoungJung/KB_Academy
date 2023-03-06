package java0307;

public class ExamStringBuilder {

	public static void main(String[] args) {
		String s = "0123456789";
		//5000번 연결
		//String
		String s1 = s;	
		long start = System.currentTimeMillis(); //리턴은 롱타입
		for (int i = 0; i < 10000; i++) {
			s1 += s;
		}
		long end = System.currentTimeMillis(); //리턴은 롱타입
		System.out.println("걸린시간:"+(end - start));
		
		//StringBuffer, StringBuilder  비교
		StringBuilder sb = new StringBuilder("0123456789");
		
		long start2 = System.currentTimeMillis(); //리턴은 롱타입
		for (int i = 0; i < 10000; i++) {
			sb.append(s);
		}
		String s2 = sb.toString();
		long end2 = System.currentTimeMillis(); //리턴은 롱타입
		System.out.println("걸린시간:"+(end2 - start2));
		
		
	}//end main

}
