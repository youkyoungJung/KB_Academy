package java0324;

import java0324.vo.MyLine;
import java0324.vo.MyRect;
import java0324.vo.MyShape;

public class Exam다형성 {
	public static void main(String[] args) {
		//부모타입 변수 = new 자식타입1()
		//부모타입 변수 = new 자식타입2()
		//타입확인
		MyShape ms1 = new MyLine(1,1,2,2);
		System.out.println(ms1 instanceof MyRect);//casting 시 문제발생
		System.out.println(ms1 instanceof MyLine);
		
		if(ms1 instanceof MyLine) {
			MyLine ml1 = (MyLine)ms1;
			System.out.println("x2= " + ml1.getX2());
		}
		
		MyLine ml1 = (MyLine)ms1;
		int ans = ml1.getX2();
		System.out.println(ans);
		
		MyShape ms2 = new MyLine(1,1,2,2);
		System.out.println(ms2 instanceof MyRect);//casting 시 문제발생
		System.out.println(ms2 instanceof MyLine);
		System.out.println(ms2 instanceof MyShape);
		System.out.println(ms2 instanceof Object);
		
	}
}
