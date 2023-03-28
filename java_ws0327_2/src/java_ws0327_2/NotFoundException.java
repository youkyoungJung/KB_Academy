package java_ws0327_2;

public class NotFoundException extends Exception {
	public NotFoundException() {
		super("관리번호가 없습니다.");
	}
	
	public NotFoundException(int num) {
		super("관리번호가 없습니다."+ num);
	}
}
