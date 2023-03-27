package java0324;

import java.util.ArrayList;

import java0324.vo.MyCircle;
import java0324.vo.MyLine;
import java0324.vo.MyRect;
import java0324.vo.MyShape;

public class Exam그림판매니저 {

	public static void main(String[] args) {
		//MyShapeManager : 도형객체를 저장, 검색, 수정, 삭제, 리스트, 갯수정보 제공
		//등록
		MyShapeManager msm = new MyShapeManager();
		
		MyLine ml1 = new MyLine(3,4,5,6);
		msm.add(ml1);//선객체 저장
		
		MyRect mr1 = new MyRect(5,7,10,15);
		msm.add(mr1);//사각객체 저장
		
		MyCircle mc1 = new MyCircle(3,4,2);
		msm.add(mc1);
		
		int count = msm.getCount();
		System.out.println("저장갯수="+count);
		//매니저클래스 없다면
		//각타입별 리스트를 따로 만들어야함. 타입별 갯수 따로 관리
		//도형 검사할 때 타입별 따로 검사.
		
		//전체 정보 출력
		msm.printAll();
		
		//좌표검색. x=3, y=4 인 도형추출
		MyShape ms = msm.findByPosition1(3, 4);
		System.out.println("ms"+ ms);
		
		//있다, 없다 -> 어떤 조건으로 작성?
		if(ms!=null) {
			System.out.println("있다");
		}else {
			System.out.println("없다");
		}
		
		ArrayList<MyShape> list = msm.findByPosition(3, 4);
		if(list.size() == 0)
			System.out.println("없다");
		else
			System.out.println("있다");
	}

}
