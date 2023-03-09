package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj11660 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N+1][N+1];
		
		//입력받기
		for(int i=1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<= N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		//여기부터 부분합 구하기
		int D[][] = new int[N+1][N+1];
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				 D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + arr[i][j];
			}
		}
		//출력확인
		 for (int[] is : D) {
	            System.out.println(Arrays.toString(is));
	       }
		 //출력
		 for(int i=0;i<M;i++) {
	            st = new StringTokenizer(br.readLine());
	            int x1 = Integer.parseInt(st.nextToken());
	            int y1 = Integer.parseInt(st.nextToken());
	            int x2 = Integer.parseInt(st.nextToken());
	            int y2 = Integer.parseInt(st.nextToken());
	            System.out.println(D[x2][y2]-D[x1-1][y2]-D[x2][y1-1]+D[x1-1][y1-1]);
	        }

	}
}
