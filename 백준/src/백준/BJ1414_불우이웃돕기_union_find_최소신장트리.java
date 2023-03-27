package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BJ1414_불우이웃돕기_union_find_최소신장트리 {
	static int[] parent; //노드별 대표노드 번호
	static int n, sum; //전체 컴퓨터 댓수, 총 랜수의 길이 저장
	static PriorityQueue<lEdge> queue; //노드간 연결 가중치를 저장, 오름차순
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		queue = new PriorityQueue<>();
		
		for(int i=0; i<n; i++) {//행 갯수
			st = new StringTokenizer(br.readLine());//1개행 읽기
			char[] tempc = st.nextToken().toCharArray();//"abc" -> ['a', 'b', 'c']
			for(int j=0; j<n; j++) {
				int temp = 0;//알파벳을 숫자로 변환하는 값
				if(tempc[j] >= 'a' && tempc[j] <= 'z') {//소문자 알파벳일 경우
					temp = tempc[j] - 'a' + 1;
				}else if(tempc[j] >= 'A' && tempc[j] <= 'Z') {//대문자 알파벳일 경우
					temp = tempc[j] - 'A' + 27;
				}
				sum = sum + temp;//총 랜선 길이 정하기
				if(i != j && temp != 0) queue.add(new lEdge(i, j, temp));
				//i 와 j 가 다르면 랜선 정보를 큐에 저장
			}
		}
		//parent 초기화
		parent = new int[n];
		for(int i=0; i<parent.length; i++) parent[i] = i;
		
		int useEdge = 0;
		int result = 0;
		
		while(!queue.isEmpty()) {//최소신장트리
			lEdge now = queue.poll();
			if(find(now.s) != find(now.e)) {//같은 부모가 아니라면 연결하기
				union(now.s, now.e);
				result = result + now.v;
				useEdge++;
			}
		}
		if (useEdge == n-1)
			System.out.println(sum-result);
		else
			System.out.println(-1);
	}
	
	private static void union(int a, int b) {//union 연산 : 대표노드끼리 연결
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

class lEdge implements Comparable<lEdge>{

	int s, e, v;
	
	lEdge(int s, int e, int v){
		this.s = s;
		this.e = e;
		this.v = v;
	}
	@Override
	public int compareTo(lEdge o) {
		// TODO Auto-generated method stub
		return this.v - o.v;
	}
	
}
