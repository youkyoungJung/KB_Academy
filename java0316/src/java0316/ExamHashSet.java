package java0316;

import java.util.ArrayList;
import java.util.HashSet;

public class ExamHashSet {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(100);
		arr.add(100);
		arr.add(100);
		System.out.println(arr);
		///
		HashSet<Integer> hs = new HashSet<>();
		hs.add(100);
		hs.add(100);
		hs.add(100);
		System.out.println(hs);
		///
		HashSet<Integer> hs2 = new HashSet<>(arr);
		System.out.println(hs2);
		
		
	}

}
