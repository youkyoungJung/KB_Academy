package java0308;

public class ExamShape {
	public static void main(String[] args) {
		//자바로 그림판 작성.
		//만든 도형 정보 저장하는 클래스
		//Line(x1,y1,x2,y2), Circle(x1,y1,radius)
		//공통정보는 Shape(x1,y1)
		//Line extends Shape
		//Circle extends Shape
		Shape l1 = new Line(1,1,3,3);//동적바인딩
		//l1.shape에 생성됨
		System.out.println(l1);
		
		
	}

}
