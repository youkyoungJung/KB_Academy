package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ2178_미로탐색하기_BFS {

	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static boolean[][] visited;
	static String[][] A;
	static int n, m;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		A = new String[n][m];
		visited = new boolean[n][m];
		//visited[0][0] = true;
		
		for(int i=0; i<n; i++) {
			//st = new StringTokenizer(br.readLine());
			//String s = br.readLine();
			for(int j=0; j<m; j++) {
				//문자열 넣는법??
				A[i][j] = sc.next();
				//A[i][j] = s.substring(j, j+1);
			}
		}
	
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(A[i][j] == "." && !visited[i][j]) {
					BFS(i,j);
				}
			}
		}
		System.out.println(A[n-1][m-1]);
	}

	private static void BFS(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {i,j});
		
		visited[i][j] = true;
		while(!queue.isEmpty()) {
			int now[] = queue.poll();
			for(int k=0; k<4; k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				
				if(x>=0 && y>=0 && x<n && y<m) {//좌표 유효성 검사
					if(A[x][y] != "." && !visited[x][y]) {
						visited[x][y] = true;
						A[x][y] = A[now[0]][now[1]] + 1;
						queue.add(new int[] {x, y});
					}
				}
			}
		}
	}
}
