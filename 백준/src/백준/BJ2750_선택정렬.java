package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2750_선택정렬 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int[] s = new int[n];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			s[i] = Integer.parseInt(st.nextToken());
		}
		//요기부터 선택정렬 알고리즘
		for(int i=0; i<n-1; i++) {
			int min = i;
			for(int j=i+1; j<n; j++) {
				if(s[j] < s[min]) {
					min = j;
				//swap(s, i, min);
				}		
			}
			swap(s, i, min);
		}//for_f
		//출력
		for(int i=0; i<n; i++) {
			System.out.println(s[i]);
		}
	}//main_f

	private static void swap(int[] s, int i, int j) {
		int temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}
	

}
