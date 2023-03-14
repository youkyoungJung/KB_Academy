package java0313;

public class 연속된숫자의순열 {

	public static void main(String[] args) {

		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				for(int k=1; k<=3; k++) {
					//3개 숫자가 모두 다를 경우에만 출력하기
					if(i !=j && j !=k && k != i)
					System.out.println(i +","+j +","+ k);
				}
			}
		}		
	}
}
