package java0313;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exam_BJ_11050 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[][] d = new int[n+1][n+1];
		
//		for(int i=0; i<=n; i++) {
//			for(int j=0; j<i; j++) {
//				if(j ==0 || j== i) {
//					d[i][j] = 1;
//				}else if(j == 1) {
//					d[i][j] = i;
//				}
//				d[i][j] = d[i-1][j-1]+d[i-1][j];
//			}
//		}
//		System.out.println(d[n][k]);
	}

}
