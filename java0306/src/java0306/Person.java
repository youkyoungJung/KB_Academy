package java0306;

/**
 * 사람에 대한 기본 정보 정의용<br/>
 * 이름, 나이
 * @author neulbo.
 */
public class Person {
	private String name;
	private int age;
//	String name;
//	int age;
	//검색 - 메서드 내부 변수 없으면
	//멤버변수 검색 없으면 오류
	public Person() {
	}
	
	/**
	 * 멤버 메서드에 대한 주석
	 * 이름과 나이를 입력받아 초기화
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
//		string = getName();
//		i = getAge();
		this.name = name;
		this.age = age;
//		System.out.println("this="+this.name);
	}

	//
	public Person(int age, String name) {
		this(name, age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void printInfo() {
		System.out.println(getName()+"의 나이는 "+getAge());          
	}
	
	public String toString() {
		return (getName()+"의 나이는 "+getAge());          
	}
	
}
