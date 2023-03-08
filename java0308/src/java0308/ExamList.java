package java0308;

import java.util.ArrayList;

public class ExamList {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("abc");
		a1.add("cde");
		a1.add("xyz");
		//a1.add( 100 );
		System.out.println(a1.size());
		
		String e = a1.get(0);//get은 object클래스여서 타입캐스팅을 해야했음.
		String e2 = a1.get(2);//get은 object클래스여서 타입캐스팅을 해야했음.
		System.out.println(e2);
		
		String r = a1.remove(0);
		System.out.println("지워진 값="+r);
		System.out.println(a1.size());
		System.out.println(a1);
		a1.add(1, r);
		System.out.println(a1);
		
		
	}

}
