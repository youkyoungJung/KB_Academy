package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * 최소신장트리 - 크루스칼알고리즘
 * @author student
 *
 */
public class BJ1197_최소신장트리구하기 {

	static int[] parent;
	static PriorityQueue<pEdge> queue;//요소추가시 자동정렬되는 자료구조
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		queue = new PriorityQueue<pEdge>();//객체생성
		
		int n = Integer.parseInt(st.nextToken());//노드
		int m = Integer.parseInt(st.nextToken());//간선
		
		parent = new int[n+1];//노드별 대표노드 저장
		//대표노드 초기화
		for(int i=0; i<n; i++) {
			parent[i] = i;
		}	
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());//start
			int e = Integer.parseInt(st.nextToken());//end
			int v = Integer.parseInt(st.nextToken());//value
			queue.add(new pEdge(s,e,v));
		}
		
		int useEdge = 0;//사용엣지 횟수 계산, n-1 동안 계산해야하기 때문에
		int result = 0;//정답 저장. 사용된 가중치 누적
		while(useEdge < n-1) {
			pEdge now = queue.poll();//큐 맨앞 삭제, 반환(가중치가 가장 작은 것)
			if(find(now.s) != find(now.e)) {
				union(now.s, now.e);//노드연결
				result = result + now.v;//가중치 누적
				useEdge++;//사용한 엣지 갯수 증가 -> n-1까지 동작하기 위해
			}
		}
		System.out.println(result);
	}
	private static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if(a!=b) {
			parent[b] = a;
		}
	}

	public static int find(int a) {
		if(a == parent[a])//인덱스와 같이 같은 노 드(집합의 대표노드)의 번호를 반환
			return a;
		else
			return parent[a] = find(parent[a]);//재귀함수의 형태로 구현
	}
}

class pEdge implements Comparable<pEdge>{

	int s;
	int e;
	int v;
	
	public pEdge(int s, int e, int v) {
		this.s = s;
		this.e = e;
		this.v = v;
	}

	@Override
	public int compareTo(pEdge o) {
		return this.v - o.v;//ascending 정렬(this.변수 - o.변수)
	}
	
}
