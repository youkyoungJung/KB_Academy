package java0324.manager;

import java.util.ArrayList;

import java0324.vo.MyCircle;
import java0324.vo.MyLine;
import java0324.vo.MyRect;
import java0324.vo.MyShape;

public class MyShapeManager {
	
	private ArrayList<MyShape> arr = new ArrayList<>();
	
//	public void add(MyShape ml1) {
//		arr.add(ml1);
//	}
	public void add(MyLine ml1) {
		arr.add(ml1);
	}
	public void add(MyRect mr1) {
		arr.add(mr1);
	}
	public void add(MyCircle mc1) {
		arr.add(mc1);
	}
	public int getCount() {
		return arr.size();
	}
	public void printAll() {
		System.out.println("** 전체출력 **");
		for (MyShape myShape : arr) {
			System.out.println(myShape.toString());
		}
	}
	public  MyShape findByPosition(int x1, int y1) {
        for(MyShape myShape : arr) {
            if(myShape.getX()==x1 && myShape.getY()==y1)
                return myShape;
        } 
        return null;//못찾았음
	}
	
	public ArrayList<MyShape> findByPositions(int x1, int y1) {
		ArrayList<MyShape> answer = new ArrayList<>();
		
		for(MyShape myShape : arr) {
            if(myShape.getX()==x1 && myShape.getY()==y1)
                answer.add(myShape);
        } 
        return answer;//못찾았음
	}
}

