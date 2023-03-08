package java0308;

public class Exam클래스멤버변수 {

	public static void main(String[] args) {
		AA.j = 300;
		
		AA a1 = new AA();
		a1.i = 100;
		//a1.j = 400;//이건 효과적이지 않은 방법
		
		AA a2 = new AA();
		a2.i = 200;
		System.out.println(AA.j);
	}

}
class AA{
	int i;// 인스턴스 변수-> 인스턴스를 만든 후 사용 가능
	static int j;//클래스 멤버변수 - 오로지 클래스 영역
	
	void prn() {
		System.out.println(i+","+j); //non-static 은 객체를 만들어야 가능
	}
	static void prn2() {
		AA a1 = new AA();
		System.out.println(a1.i+","+j);
		
	}
}