package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1976_여행계획짜기 {

	static int[] parent;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//입력받기
				int n = Integer.parseInt(st.nextToken());
				
				st = new StringTokenizer(br.readLine());
				int m = Integer.parseInt(st.nextToken());
				
				parent = new int[n+1];
				//그래프 초기값설정
				for(int i=1; i<=n; i++) {
					parent[i] = i;
				}
			
	
				for(int i=1; i<=n; i++) {
					st = new StringTokenizer(br.readLine());
					for(int j=1; j<=n; j++) {
						if(Integer.parseInt(st.nextToken()) == 1)
							union(i, j);
					}			
				}
				
				st = new StringTokenizer(br.readLine());
				//여행계획
				int start = Integer.parseInt(st.nextToken());
				
				String result = "YES";
				for(int i=1; i<m; i++) {
					int next = Integer.parseInt(st.nextToken());
					if(!checkSame(start, next)) {
						result = "NO";
						break;
					}
					start = next;
				}
				System.out.println(result);

			}
	private static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if(a!=b) {
			parent[b] = a;
		}
	}

	public static int find(int a) {
		if(a == parent[a])//인덱스와 같이 같은 노 드(집합의 대표노드)의 번호를 반환
			return a;
		else
			return parent[a] = find(parent[a]);//재귀함수의 형태로 구현
	}
	private static boolean checkSame(int a, int b) {
		a = find(a);
		b = find(b);
		return a == b;
	}
}
