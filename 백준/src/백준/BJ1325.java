package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class BJ1325 {
	private static boolean[] visited;
	private	static ArrayList<Integer>[] A;
	private static int[] check;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		//생성
		check = new int[n+1];
		A = new ArrayList[n+1];
		visited = new boolean[n+1];
		
		for(int i=1; i<=n; i++) {
			A[i] = new ArrayList<Integer>();	
		}
		//그래프 그리기
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			//A[s].add(e);
			A[e].add(s);
		}		
		for(int i=1; i<=n; i++) {
			dfs(i, 1);
		}
		
		for(int i:check) {
			System.out.print(i+" ");
		}
		
		//dict - Hash
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<n; i++) {
			map.put(i, check[i]);
		}
		List<Integer> KeySet = new ArrayList<>(map.keySet());
		
		KeySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1).compareTo(map.get(o2));
            }
        });

        for (Integer key : KeySet) {
        	if(map.get(key) !=0) {
        		System.out.print(key+ " ");
        	}
        }	
	}

	private static void dfs(int v, int c) {
		visited[v] = true;//true로 바꾸고
		for(int i: A[v]) {
			if(!visited[i]){//방문하지 않았으면 실행
				check[c] += 1;
				dfs(i, c+1);
			}
		}
	}
}
