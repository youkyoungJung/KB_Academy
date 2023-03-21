package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ1325_dfs {

	static int n, m, max = 0;
	static boolean[] visited;
	static int[] dp = new int[n];
	static ArrayList<Integer>[] graph;

	public static void dfs(int now) {
		visited[now] = true; // 방문표시

		for (int i : graph[now]) {
			if (visited[i] == false) { // 아직방문전
				dp[i]++; // 감염수
				dfs(i); // 재귀
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		dp = new int[n];
		visited = new boolean[n];

		graph = new ArrayList[n + 1];
		for (int i = 0; i < n; i++) {
			graph[i] = new ArrayList();
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			graph[x - 1].add(y - 1);
		}

		for (int i = 0; i < n; i++) {
			visited = new boolean[n]; // 초기화
			dfs(i);
		}

		for(int i: dp) {
			System.out.print(i+" ");
		}
		
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (max < dp[i]) {
				max = dp[i];
			}
		}

		for (int i = 0; i < n; i++) {
			if (max == dp[i]) {
				System.out.print(i + 1 + " ");
			}
		}
	}

}
