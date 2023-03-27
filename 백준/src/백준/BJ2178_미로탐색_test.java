package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ2178_미로탐색_test {

	static int[][] map;
	static int n;
	static int m;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<m; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}
		
		visited = new boolean[n][m];
		visited[0][0] = true;
		bfs(0,0);
		System.out.println(map[n-1][m-1]);
		
	}

	private static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x,y});//초기화
		
		while(!q.isEmpty()) {
			int now[] = q.poll(); //맨앞 큐 가져오기
			int nowX = now[0];
			int nowY = now[1];
			
			for(int i=0; i<4; i++) {//사방으로 가는 방향 상하좌우
				int nextX = nowX + dx[i];
				int nextY = nowY + dy[i];
				
				if(nextX>=0 && nextY>=0 && nextX<n && nextY<m) {//좌표 유효성 검사
					if(map[nextX][nextY] != 0 && !visited[nextX][nextY]) {
						visited[nextX][nextY] = true;
						map[nextX][nextY] = map[nowX][nowY] + 1;
						q.add(new int[] {nextX, nextY});
					}
				}
			}
		}
	}
}
