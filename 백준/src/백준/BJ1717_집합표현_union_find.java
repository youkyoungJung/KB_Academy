package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 유니온파인드
 * @author student
 *
 */
public class BJ1717_집합표현_union_find {
	public static int[] parent;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//입력받기
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		parent = new int[n+1];
		
		//그래프 초기값설정
		for(int i=0; i<=n; i++) {
			parent[i] = i;
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			//값 입력
			if(num == 0) {
				union(a,b);
				//집합합치기
			}else {
				if(checkSame(a,b)) {//같은집합의 원소인지 확인
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}	
		}
	}

	private static boolean checkSame(int a, int b) {
		a = find(a);
		b = find(b);
		return a == b;
	}

	private static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if(a!=b) {
			parent[b] = a;
		}
	}

	public static int find(int a) {
		if(a == parent[a])//인덱스와 같이 같은 노드(집합의 대표노드)의 번호를 반환
			return a;
		else
			return parent[a] = find(parent[a]);//재귀함수의 형태로 구현
	}

}
