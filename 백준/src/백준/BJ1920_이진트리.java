package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ1920_이진트리 {
/**
 * 이진탐색
 * @param args
 * @throws IOException
 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//데이터 개수, 탐색데이터 받기
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr1 = new int[n];
		
		
		for(int i=0; i<n; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		//정렬
		Arrays.sort(arr1);
		
		//찾을 값 받기
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr2 = new int[n];
		
		for(int i=0; i<n; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		//이진탐색		
		binarySearch(arr1, arr2, n);

			
		
		
		
	}
	private static int binarySearch(int[] arr1, int[] arr2, int n) {

		for(int i=0; i<n; i++) {
			int s = arr1[0];
			int e = arr1[n-1];
			int target = arr2[i];
			
			while(s <= e) {
				int mid = (s+e)/2;
				if(arr1[mid] == target) {
					//System.out.println(1);
					return 1;
				}else if(arr1[mid] < target) {
					s = mid + 1;
				}else {
					e = mid - 1;
				}
			}
			
		}
		return 0;
	}

}
