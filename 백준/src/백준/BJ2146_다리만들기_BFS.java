package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import org.w3c.dom.Node;

public class BJ2146_다리만들기_BFS {
	
	static int[][] map;
	static int n;
	static boolean[][] visited;
	static Queue<int[]> q;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		//초기화
		map = new int[n][n];
		visited = new boolean[n][n];
		q = new LinkedList<>();
		//입력		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		//섬찾고 섬마다 다른 인덱스 부여해줌
		IslandCount();
		//최소 거리 찾기
		int min = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j] > 0) {
					visited = new boolean[n][n];
					int res = bridge(j, i);
					
					if(res == -1) continue;
					if(min > res) {
						min = res;
						System.out.println("다리완성 " + res);
					}
				}
			}
		}
		System.out.println(min-1);
	}
	
//섬과 섬사이 최단거리 구하기.
	//BFS: 움직인 횟수만 COUNT + 같은 섬은 방문하면안됨.
	// 2번 인덱스 섬을 방문할때 다른 2번 육지를 방문하면 안됨. 0인 바다 or 다른 육지
	// 다른 육지 방문시 탐색 종료
	
	static int bridge(int x, int y) {
		q = new LinkedList<>();
		
		int num = map[y][x];
		visited[y][x] = true;
		q.add(new int[] {x,y,0});
		
		while(!q.isEmpty()) {
			int[] now = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			int bridge = now[2];
			
			if(map[nowY][nowX] != 0 && map[nowY][nowX] != num) {
				return bridge;
			}
			
			for(int d=0; d<4; d++) {//사방으로 가는 방향 상하좌우
				int nextX = nowX + dx[d];
				int nextY = nowY + dy[d];
				
				if(nextX>=0 && nextY>=0 && nextX<n && nextY<n) {//좌표 유효성 검사
					if(map[nextY][nextX] != 0 && !visited[nextY][nextX]) {
						visited[nextY][nextX] = true;
						//map[nextX][nextY] = map[nowX][nowY] + 1;
						q.add(new int[] {nextX, nextY, bridge+1});
					}
				}
			}
		}
		return -1;
		
	}
//섬구분:BFS 탐색 - 브루트포스(그래프 전체 조회)
//그래프 값이 1인 곳을 탐색하면서 각 섬마다 특정 idx값을 부여해주고 이미 방문한 육지는 재방문이 안되게 방문 여부 체크
	static void IslandCount() {
		int idx = 2;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!visited[i][j] && map[i][j] != 0) {
					map[i][j] = idx;
					visited[i][j] = true;
					q.add(new int[] {j, i});
					
					while(!q.isEmpty()) {
						int[] now = q.poll();
						int nowX = now[0];
						int nowY = now[1];
						
						for(int d=0; d<4; d++) {//사방으로 가는 방향 상하좌우
							int nextX = nowX + dx[d];
							int nextY = nowY + dy[d];
							
							if(nextX>=0 && nextY>=0 && nextX<n && nextY<n) {//좌표 유효성 검사
								if(map[nextY][nextX] == 1 && !visited[nextY][nextX]) {
									visited[nextY][nextX] = true;
									map[nextY][nextX] = idx;
									q.add(new int[] {nextX, nextY});
								}
							}
						}
						idx++;

					}
				}
			}
		}
	}
	

}
