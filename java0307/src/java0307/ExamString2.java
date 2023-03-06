package java0307;

public class ExamString2 {

	public static void main(String[] args) {
		String s1 = new String("Hello Java");
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.indexOf("lo")); //없으면 -1 반환
		System.out.println(s1.replace("Hel","lo")); //없으면 -1 반환
		System.out.println(s1.substring(6,8));
		System.out.println(s1.split(" ")[0]);
	}

}
