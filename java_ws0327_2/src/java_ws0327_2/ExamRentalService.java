package java_ws0327_2;


public class ExamRentalService {

	public static void main(String[] args) {
		RentalManager rm = new RentalManager();
		
		try {
			rm.add(new Book(1111, "작가미상", "홍길동", 234, 15000, false));
			rm.add(new Book(2222, "작가미상", "세종실록", 100, 20000, false));
			rm.add(new Video(3333, "미래엔", "따뜻한", 150, 10000, false));
			rm.add(new Video(4444, "행복사", "아메리카노", 150, 10000, false));
			System.out.println("등록"
					+ "갯수: "+rm.getCount());
			System.out.println("책등록"
					+ "갯수: "+rm.BookCount());
			System.out.println("비디오등록"
					+ "갯수: "+rm.VideoCount());
		}catch(NumExistException ne) {
			System.out.println("등록오류: "+ ne.getMessage());
		}
		Rental r = null;
		try {
			r = rm.findByNum(1111);
			System.out.println("검색성공:"+r.toString());
		} catch (NotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			r = rm.findByNum(3333);
			System.out.println("검색성공:"+r.toString());
		} catch (Exception e) {
			System.out.println("미등록 비디오:"+e.getMessage());
		}
		//대여state 변환
		try {
			rm.stateUpdate(1111);
			r = rm.findByNum(1111);
			System.out.println("대여성공:"+r.toString());
		} catch (Exception e) {
			System.out.println("대여실패:"+e.getMessage());
		}
		//대여state 변환
		try {
			rm.stateUpdate(3333);
			r = rm.findByNum(3333);
			System.out.println("대여성공:"+r.toString());
		} catch (Exception e) {
			System.out.println("대여실패:"+e.getMessage());
		}
		//전체출력
		rm.printAll();
	}

}
