package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ2667_단지번호붙이기_BFS {

	static int[][] map;
	static int n;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int cnt;
	static int[] aparts = new int[25*25];
	
	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n][n];
		map = new int[n][n];
		
		//입력받기
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<n; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j] == 1 && !visited[i][j]) {
					cnt++;
					bfs(i,j);
				}
			}
		}
		
		Arrays.sort(aparts);
		System.out.println(cnt);
		
		for(int i=0; i<aparts.length; i++){
            if(aparts[i] == 0){
            }else{
                System.out.println(aparts[i]);
            }
        }

		
		
	}

	private static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x,y});//초기화
		visited[0][0] = true;
		//aparts[cnt]++;
		
		while(!q.isEmpty()) {
			int now[] = q.poll(); //맨앞 큐 가져오기
			int nowX = now[0];
			int nowY = now[1];
			
			for(int i=0; i<4; i++) {//사방으로 가는 방향 상하좌우
				int nextX = nowX + dx[i];
				int nextY = nowY + dy[i];
				
				if(nextX>=0 && nextY>=0 && nextX<n && nextY<n) {//좌표 유효성 검사
					if(map[nextX][nextY] != 0 && !visited[nextX][nextY]) {
						visited[nextX][nextY] = true;
						//map[nextX][nextY] = map[nowX][nowY] + 1;
						q.add(new int[] {nextX, nextY});
						aparts[cnt]++;
					}
				}
			}
		}
	}

}
