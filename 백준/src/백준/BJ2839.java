package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BJ2839 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int[] kg = new int[] {5, 3};
		
		int cnt = 0;
//		for(int i=0; i<2; i++) {
//			if(n%kg[i] == 0 || n%kg[i] == 3 || n%kg[i] == 5 || n%kg[i] == 8) {
//				if(n%kg[i] == 8)
//					cnt += 1;
//				cnt += (n/kg[i]);
//				n %= kg[i];
//			}
//		}
		for(int i= n/5; i>=0; i--) {
			//i는 5키로짜리 봉지개수
			int weight = n - (5*i);//3키로 만들 수 있으면 정답
			if(weight%3 == 0) {
				System.out.println(i+(weight/3));//5키로봉지개수+3키로봉지개수
				cnt = 1;
				break;
			}
		}//end_f
		if(cnt != 1)
			System.out.println(-1);
	}
}
