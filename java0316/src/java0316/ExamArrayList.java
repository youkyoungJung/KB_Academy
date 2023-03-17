package java0316;

import java.util.ArrayList;

public class ExamArrayList {

	public static void main(String[] args) {
		//자료구조ArrayList, Wrapper클래스 리뷰
		//Wrapper 클래스 -> 기본자료형(byte, short, int, long, float, double, boolean)
		//기본자료형 -> 객체화시킴.(자료구조에 저장, 형변환)
		//byte->Byte, short->Short, int->Integer
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(100);
		arr.add(120);
		arr.add(300);
		System.out.println("저장갯수= "+arr.size());
		System.out.println("arr.get(1)= "+arr.get(1));//1번인덱스 추출
		System.out.println("arr.get(0)= "+arr.get(0));//0번인덱스 추출
		System.out.println("300의 위치= "+arr.indexOf(300));
		System.out.println("400의 위치= "+arr.indexOf(400));
		
		int rm = arr.remove(1); //1번 인덱스의 자료 삭제
		System.out.println("삭제 후 저장갯수= "+arr.size());
		System.out.println("삭제"
				+ "된 자료는= "+rm);
		//arr.addAll(null);//Collection-ArrayList, xxxSet, HashSet
		int i = 100;
		Integer ii = new Integer(i);//int->Integer:Boxing
		int j = new Integer(200); //Integer->int:UnBoxing
		
		String s = "300";
		char[] cs = s.toCharArray();
		
		
	}
}
