package java0308;

public class Exam형변환 {

	public static void main(String[] args) {
		byte b = -120; //127 ~ -128
		String s = Integer.toBinaryString(200);
		System.out.println(s);//맨 좌측(부호비트)이 1일 경우: 음수
		//강제형변환
		byte b1 = (byte)200;
		System.out.println(b1);
		//
		short sh = b1;
		System.out.println(sh);
		
		char c = '가';
		int i = c;
		
		//boolean boo = (boolean)0;-x
		String s1 = "321";
		//char charAt = s1.charAt(0);
		int diff = s1.charAt(0) - '0';
		System.out.println(diff);
		diff *= 10;
		diff += (s1.charAt(1)-'0');
		System.out.println(diff);
		diff *= 10;
		diff += (s1.charAt(2)-'0');
		System.out.println(diff);
	}

}
