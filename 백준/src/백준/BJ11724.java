package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ11724 {
	static int n;
	static int m;
	//사용할 스택 정의
	static Stack<Integer> stack = new Stack<>();
	//방문처리에 사용할 배열선어
	static boolean[] visited = new boolean[n+1];
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		stack.push(Integer.parseInt(st.nextToken()));
	}

}
