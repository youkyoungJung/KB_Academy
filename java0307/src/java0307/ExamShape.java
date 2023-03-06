package java0307;

public class ExamShape {

	public static void main(String[] args) {
		//자바로 그림판 제작. 가정
		//관리대상은 도형 정보. 선, 사각, 원
		Shape[] sarr = new Shape[3];
		sarr[0] = new Line(1,1,3,3);
		sarr[1] = new Circle(2,2,5);
		
		System.out.println(sarr[0].toString());
		System.out.println(sarr[1].toString());
		
		Shape l = new Line(1,1,2,3);
		l.draw();//실제 객체의 override한 메서드가 실행된다.
		
		sarr[0].draw();
		
		
	}

}
