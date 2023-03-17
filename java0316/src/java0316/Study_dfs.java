package java0316;

public class Study_dfs {
	public static void main(String[] args) {
		//dfs
		
		//방문처리에 사용할 배열
		boolean[] visited = new boolean[9];
		int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
		dfs(visited, graph, 1);
	}

	private static void dfs(boolean[] visited, int[][]graph, int nodeIndex) {
		//방문처리
		visited[nodeIndex] = true;
		//방문노드
		System.out.print(nodeIndex+"->");
		//방문노드에 인접한 노드 찾기
		for(int node: graph[nodeIndex]) {
			if(!visited[node]) {
				dfs(visited, graph, node);
			}
		}
	}
	
}
