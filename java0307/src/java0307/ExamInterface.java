package java0307;

public class ExamInterface {

	public static void main(String[] args) {
		SwimStudent s1 = new SwimStudent("김씨",21,"체육과");
		System.out.println(s1);
		s1.swim();
		
		SwimCar c1 = new SwimCar("소나타2022", "승용");
		c1.swim();
		//
		Swimmable[] sarr = new Swimmable[2]; //인터페이스로 넣어둠 - 인터페이스에 있는 기능만 구현
		//메모리가 가리키는 타입을 봐야함.
		sarr[0] = s1;
		sarr[1] = c1;
		//형변환 연산자 쓰면 가능
		Car cc = (Car)sarr[1];//강제형변환
		SwimCar swc = (SwimCar)sarr[1];//강제형변환
		
		//
		Swimmable sw = s1; //간접적인 클래스 사용으로 손쉬운 모듈교체 지원
		sw.swim();
		
		sw = c1;//
		sw.swim();
		
	
		
		for (int i = 0; i < sarr.length; i++) {
			sarr[i].swim();
		}
		
	}
}	

interface Swimmable{//수영할 수 있는 객체가 가져야할 타입
	void swim();
}

class Car{
	String modle;
	String type;

	public Car(String modle, String type) {
		this.modle = modle;
		this.type = type;
	}
}

class SwimCar extends Car implements Swimmable{

	public SwimCar(String model, String type) {
		super(model, type);
	}

	@Override
	public void swim() {
		System.out.println("수중프로펠러 엔진 가동");
	}
	
}

//수영 가능한 학생
class SwimStudent extends Student implements Swimmable{

	public SwimStudent(String name, int age, String jeongong) {
		super(name, age, jeongong);
		
	}

	@Override
	public void swim() {
		System.out.println("평형으로 수영");
	}
	
}

