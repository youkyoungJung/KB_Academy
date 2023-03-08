package java0308;

public class ExamMath {

	public static void main(String[] args) {
		double r = Math.random();
		System.out.println(r);
		//1~100사이 난수 생성
		//r: 0.0~0.99999
		r *= 45; //0.0~99.9999
		System.out.println(r);
		//정수화 시키기 0~99
		int i  = (int)r+1;
		System.out.println(i);
		
	}

}
