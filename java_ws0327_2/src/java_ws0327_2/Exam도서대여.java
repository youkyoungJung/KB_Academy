package java_ws0327_2;

public class Exam도서대여 {

	public static void main(String[] args) {
		RentalManager2 rm = new RentalManager2();

		//대여매니저
		try {
			Video v = new Video(3333, "미래엔", "따뜻한", 150, 10000, false);
			Book b = new Book(1111, "작가미상", "홍길동", 234, 15000, false);
			rm.add(v);
			rm.add(b);
			v = new Video(2222, "미래엔", "따뜻한", 150, 10000, false);
			b = new Book(1111, "작가미상", "홍길동", 234, 15000, false);
			rm.add(v);
			rm.add(b);
			System.out.println("자료등록완료");
		}catch(NumExistException e) {
			System.err.println("중복오류발생"+e.getMessage());
			//err 오류출력 전문
		}
		int total = rm.getTotalCount();
		System.out.println("총등록갯수="+ total);
		int b_count = rm.getBookCount();
		int v_count = rm.getVideoCount();
		System.out.println("도서등록갯수="+ b_count);
		System.out.println("비디오등록갯수="+ v_count);
		
		//비디오 검색
		try {
			 Video v1 = rm.findByVideo(2222);
			 System.out.println("비디오검색 성공: "+ v1);
		}catch(Exception e) {
			System.err.println("비디오검색 실패: "+e.getMessage());
		}
		//도서 검색
		try {
			 Book v1 = rm.findByBook(1111);
			 System.out.println("도서검색 성공: "+ v1);
		}catch(Exception e) {
			System.err.println("도서검색 실패: "+e.getMessage());
		}
		
		try {
			rm.VideoRental(2222);
		} catch (NotFoundException | InvalidTypeException e) {
			System.err.println("대여중 오류"+e.getMessage());
		}
		try {
			rm.BookRental(1111);
		} catch (NotFoundException | InvalidTypeException e) {
			System.err.println("대여중 오류"+e.getMessage());
		}
		
		rm.printAll();
	}

}
