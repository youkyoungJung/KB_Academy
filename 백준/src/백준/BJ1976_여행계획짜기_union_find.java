package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 집합표현, union, find
 * @author student
 *
 */
public class BJ1976_여행계획짜기_union_find {

	public static int[][] city;
	public static int[] parent;
	public static int[] route;
	
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
	
		city = new int[n+1][n+1];
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=n; j++) {
				city[i][j] = Integer.parseInt(st.nextToken());
			}			
		}
		
		st = new StringTokenizer(br.readLine());
		//여행계획
		route = new int[m+1];
		for(int i=1; i<=m; i++) {
			route[i] = Integer.parseInt(st.nextToken());
		}
		//값 입력
		//sudo
		//city[i][0] == 1 이면 연결
		//: union(city[i][1], city[i][2])
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(city[i][j] == 1) 
					union(i, j);
			}			
		}
		int index = find(route[1]);
		for(int i=2; i<route.length; i++) {
			if(index != find(route[i])) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");

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
