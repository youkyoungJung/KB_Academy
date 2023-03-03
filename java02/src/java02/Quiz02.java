package java02;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu = 100;
		
		switch (jumsu/10) {
		case 10:
		case 9:
			System.out.println("A");
		case 8:
			System.out.println("B");
		case 7:
			System.out.println("C");
		case 6:
			System.out.println("D");

		default:
			System.out.println("F");
			break;//break 만날때까지 출력
		}
	}

}
