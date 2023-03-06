package java0307;

public class ExamPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("홍길동", 30);
		Person p2 = new Person("김길동", 20);
		
		System.out.println(p1);
		System.out.println(p2);
		
		//Person을 저장할 배열객체를 만듦.
		Person[] pa = new Person[10];
		System.out.println(pa[0]);
		pa[0] = new Person("홍길동", 30);
		pa[1] = new Person("김길동", 20);
		
		
	}

}
