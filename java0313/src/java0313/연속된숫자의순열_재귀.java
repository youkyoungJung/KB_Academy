package java0313;

import java.util.Arrays;

public class 연속된숫자의순열_재귀 {
    private static int n, m;
    private static int[] arr; // 원소를 저장할 배열
    private static boolean[] visited; // 중복을 제거하기 위한 방문 처리

    public static void main(String[] args) {
        n = 4;//전체숫자갯수
        m = 2;//선택숫자갯수
        arr = new int[m];//선택숫자저장용
        visited = new boolean[n + 1];
        permutation(0);
    }
    // 순열
    private static void permutation(int cnt) {
        //종료 조건 검사
    	if (cnt == m) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[cnt] = i;
                //같은메서드 호출
                permutation(cnt + 1);
                visited[i] = false;
            }
        }
    }

}