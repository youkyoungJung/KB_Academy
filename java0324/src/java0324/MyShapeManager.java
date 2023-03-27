package java0324;

import java.util.ArrayList;

import java0324.vo.MyCircle;
import java0324.vo.MyLine;
import java0324.vo.MyRect;
import java0324.vo.MyShape;

public class MyShapeManager {
//	private ArrayList<MyLine> arr = new ArrayList<>();
//	private ArrayList<MyRect> arr2 = new ArrayList<>();
	private ArrayList<MyShape> arr = new ArrayList<>();
	
	public MyShapeManager() {
	}
	public void add(MyLine ml1) {
		arr.add(ml1);
	}
	
	public void add(MyCircle mc1) {
		arr.add(mc1);
	}

	public void add(MyRect mr1) {
		arr.add(mr1);
	}
	
	public int getCount() {
		return arr.size();
	}
	public void printAll() {
		System.out.println("***전체 출력***");
		for(MyShape myShape : arr) {
			System.out.println(myShape.toString());
		}
	}
//	public ArrayList<MyShape> findByPosition(int x, int y) {
//		 ArrayList<MyShape> my_list = new ArrayList<>();
//		 
//		 for(MyShape myShape : arr) {
//		        if(myShape.getX()==x &&myShape.getY()== y)
//		        	return my_list.add(myShape);
//	     }
//		 return my_list;
//	}
	public MyShape findByPosition1(int x, int y) {
//		for(int i=0; i<arr.size(); i++){
//			if(arr.get(i).getI() == x && arr.get(i).getJ() == y) {
//				return arr.get(i);
//			}
//		}
//		return null;	 
		 for(MyShape myShape : arr) {
		        if(myShape.getX()==x &&myShape.getY()== y)
		        	   return myShape;
	     } return null;
	}

}
