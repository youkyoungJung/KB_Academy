package java01;

public class ExamBreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			if(i==2)
				continue;
			if(i==5)
				break;
			System.out.println(i);
		}

	}

}
