package java02;

public class Examgugudan {

	public static void main(String[] args) {
		//2차원배열 arr에 구구단결과값을 저장하는 코드를 작성하세요.
		//단, 단번호와 인덱스는 동일하게 하세요.
		//예:
		//arr[2][1]->2 arr[2][2]->4
		//arr[8][5]->40 arr[9][9]->81
		
		int arr[][] = new int[10][10];
		
		for(int i=1; i <=9; i++) {
			for(int j=1; j <=9; j++) {
				arr[i][j] = (i)*(j);
			}
		}
		System.out.println(arr[9][5]);
		
		for(int i=2; i<=9; i++) {
			System.out.println(i+"단입니다.");
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+arr[i][j]);
			}
		}
		
	}
	

}
