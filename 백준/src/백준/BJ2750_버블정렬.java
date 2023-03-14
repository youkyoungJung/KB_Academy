package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2750_버블정렬 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int[] s = new int[n];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			s[i] = Integer.parseInt(st.nextToken());
		}
		
		//요기부터 버블정렬 알고리즘
		for(int i=0; i<n-1; i++) {
			for(int j = n-1; j>i; j--) {
				if(s[j-1] > s[j])
					swap(s, j-1, j);
			}
		}
		for(int i: s) {
			System.out.println(i);
		}	
	}

	private static void swap(int[] s, int i, int j) {
		int temp = s[i];
		s[i] = s[j];
		s[j] = temp;
		
	}
	

}
