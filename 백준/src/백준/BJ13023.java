package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ13023 {
	private static boolean[] visited;
	private static ArrayList<Integer>[] A;
	private static boolean arrive;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		A = new ArrayList[n];
		visited = new boolean[n];
		
		//System.out.println(arrive);
		for(int i=0; i<n; i++) {
			A[i] = new ArrayList<Integer>();
		}
		for(int i=0; i<m; i++) {//그래프 그리기.
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e);
			A[e].add(s);
		}
		//dfs(몇번째, depth는 1로 시작
		for(int i=0; i<n; i++) {
				dfs(i, 1);
				if(arrive)
					break;
		}
		if(arrive)
			System.out.println("1");
		else
			System.out.println("0");
	}

	private static void dfs(int now, int depth) {
		if(depth == 5 || arrive == true) {//depth 5가 되면 종료
			arrive = true;
			return;			
		}
		visited[now] = true;
		for(int i : A[now]) {
			if(!visited[i]) {
				dfs(i, depth+1); //재귀호출시 depth 증가
			}
		}
		visited[now] = false;
	}
}
