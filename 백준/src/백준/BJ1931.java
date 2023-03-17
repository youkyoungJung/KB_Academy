package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BJ1931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
				
		int n = Integer.parseInt(st.nextToken());
		//종료시간 < 시작시간일경우에 선택.
		int[][] A = new int[n][2];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			A[i][0] = Integer.parseInt(st.nextToken());//회의시작시간
			A[i][1] = Integer.parseInt(st.nextToken());//회의종료시간
		}
		 Arrays.sort(A, new Comparator<int[]>() {
		      @Override
		      public int compare(int[] S, int[] E) {
		        if (S[1] == E[1]) { // 종료 시간이 같을 경우(현재꺼[1] - 다음꺼[1]
		        					// [1]인 이유는 종료시간만 비교)
		          return S[0] - E[0];
		        }
		        return S[1] - E[1];
		      }
		    });
		 int count = 0;
		 int end = -1;
		 for(int i=0; i<n; i++) {
			 if(A[i][0] >= end) {//이전회의 종료시간 보다 다음회의 시작시간이 커야함.
				 end = A[i][1];
				 count++;
			 }
		 }
		 System.out.println(count);
	}
}
