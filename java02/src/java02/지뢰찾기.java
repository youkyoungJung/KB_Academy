package java02;

import java.util.Random;
import java.util.Scanner;

public class 지뢰찾기 {

	public static void main(String[] args) {
		// 지뢰정보 저장 2차원 배열
		int[][] mineMap = new int[12][12];
		//임의의 좌표에 지뢰지정
		Random r = new Random(100);
		for (int i=0; i<5; i++) {
			int x = r.nextInt(10)+1;
			int y = r.nextInt(10)+1;
			mineMap[x][y] = 9;//9는 지뢰위치
			//지뢰주위 8개 좌표 값을 1 증가
			mineMap[x-1][y]++;//상
			mineMap[x-1][y+1]++;//상우
			mineMap[x][y+1]++;//우
			mineMap[x+1][y+1]++;//우하
			mineMap[x+1][y]++;//하
			mineMap[x+1][y-1]++;//좌하
			mineMap[x][y-1]++;//좌
			mineMap[x-1][y-1]++;//좌상
		}
//		for (int[] mm : mineMap) {
//			for (int i : mm) {
//				System.out.print(i + " ");
//			}
//			System.out.println();//빈줄 출력
//		}

		//사용자 입력 좌표 표시 배열
		boolean[][] userMap = new boolean[12][12];
		//게이머로부터 좌표입력받아 열어주기
		Scanner sc = new Scanner(System.in);
		
		int found = 0;
		
		while (true) {
			System.out.println("X좌표 입력하세요(1~10) ");
			int ux = sc.nextInt();
			System.out.println("Y좌표 입력하세요(1~10) ");
			int uy = sc.nextInt();
			userMap[ux][uy] = true;//게이머가 입력한 좌표
			//게이머가 입력한 좌표결과를 표시
			for (int i = 0; i < userMap.length; i++) {
				for (int j = 0; j < userMap[i].length; j++) {
					if (userMap[i][j] == true)//게이머가 오픈한 좌표
						System.out.print(mineMap[i][j] + " ");
					else//게이머가 오픈 안한 좌표
						System.out.print("X ");
				} //end for j
				System.out.println();
			} //end for i
			//찾은 지뢰수 증가
			if(mineMap[ux][uy] >= 9) {
				found++;
				System.out.println("축하합니다. 찾았습니다. 찾은 개수: "+found);
				if(found == 5)
					break;//반복종료
				
			}
		}//end while
		System.out.println("지뢰찾기를 종료합니다.");
	}//end main

}
