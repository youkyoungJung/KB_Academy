package java0306;

public class Calc {

	 public Calc() {
		// 기본생성자-컴파일러가 해주는 일
		 System.out.println("생성~~");
	}
	 
	
	public int plus(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	public double plus(double i, int j) {
		// TODO Auto-generated method stub
		return i+j;//void_plus_double_int(...)
	}
	public double plus(int i, double j) {
		// TODO Auto-generated method stub
		return i+j;//void_plus_int_double(...)
	}

	public int minus(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}

	public double divide(int i, int j) {
		// TODO Auto-generated method stub
		return (double)i / j;
	}

}
