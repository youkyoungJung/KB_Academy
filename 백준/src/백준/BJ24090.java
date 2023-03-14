package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ24090 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		//첫째줄입력
		int a = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());//교환횟수
		int cnt = 0;
		
		st = new StringTokenizer(br.readLine());
		int[] s = new int[a];
		//들째줄입력
		for(int i=0; i<a; i++) {
			s[i] = Integer.parseInt(st.nextToken());
		}
		//퀵정렬알고리즘 시작
		quick_sort(s, 0, a-1);
		
	}
	
	public static void quick_sort(int[] s, int p, int a) {
		int left = p;
		int right = a;
		int pivot;// = (left+right)/2;
		
		if(left < right) {
			pivot = partition(s, left, right);
			quick_sort(s, left, pivot-1);
			quick_sort(s, pivot+1, right);
		}

	}
	
	public static int partition(int[] s, int p, int r) {
		int x = s[r];
		int i = p-1;
		
		for(int j=p; j<r-1; j++) {
			if(s[j] <= x) {
				swap(s, s[++i], s[j]);
			}
		}
		if(i+1 != r) {
			swap(s,s[i+1], s[r]);
		}
		return i+1;
	}
	
	private static void swap(int[] s, int i, int j) {
		int temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}

}
