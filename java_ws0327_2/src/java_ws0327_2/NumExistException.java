package java_ws0327_2;

public class NumExistException extends Exception {
	public NumExistException() {
		super("Num 중복");
	}

	public NumExistException(int num) {
		super("관리번호 중복: " + num);
	}
}
