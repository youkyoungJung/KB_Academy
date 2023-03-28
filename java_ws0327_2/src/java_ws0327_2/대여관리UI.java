package java_ws0327_2;

import java.util.Scanner;

public class 대여관리UI {
	
	RentalManager2 rm = new RentalManager2();
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws NotFoundException, InvalidTypeException {
		대여관리UI ui = new 대여관리UI();
		
		ui.mainMenu();
		
	}

	public void mainMenu() throws NotFoundException, InvalidTypeException {
		while(true) {
			System.out.println("** 도서 대여 프로그램 v0.1 **");
			System.out.println("[총등록수:" + rm.getTotalCount()+ "]");
			System.out.println("1)도서등록 2)비디오등록 3)대여) 4)반납 5)전체출력 99)종료");
			System.out.print("메뉴번호> ");
			int menu = Integer.parseInt(sc.next());
			if(menu == 1)
				도서등록메뉴();
			else if(menu == 2)
				비디오등록();
			else if(menu == 3)
				대여();
			else if(menu == 4)
				반납();
			else if(menu == 5)
				rm.printAll();
			else if(menu == 99)
				break;
			else
				return;
			}
	}

	private void 반납() throws NotFoundException, InvalidTypeException {
		System.out.println("** 반납 **");
		System.out.println("1)비디오반납 2)도서반납 99)이전메뉴");
		System.out.print("메뉴번호>");
		int menu = Integer.parseInt(sc.next());
		if(menu == 1)
			비디오반납();
		else if(menu == 2)
			도서반납();
		else
			return;
	}

	private void 도서반납() {
		System.out.print("반납할 도서 번호> ");
		int en = Integer.parseInt(sc.next());
		try {
			rm.BookReturn(en);
		} catch (NotFoundException | InvalidTypeException e) {
			System.err.println("반납에 문제가 생겼습니다.");
			return;
		}
		
	}

	private void 비디오반납(){
		System.out.print("반납할 비디오 번호> ");
		int en = Integer.parseInt(sc.next());
		try {
			rm.VideoReturn(en);
		} catch (NotFoundException | InvalidTypeException e) {
			System.err.println("반납에 문제가 생겼습니다.");
		}
	}

	private void 대여() {
		System.out.println("** 대여 **");
		System.out.println("1)비디오대여 2)도서대여 99)이전메뉴");
		System.out.print("메뉴번호>");
		int menu = Integer.parseInt(sc.next());
		if(menu == 1)
			비디오대여();
		else if(menu == 2)
			도서대여();
		else
			return;
		
	}

	private void 도서대여() {
		System.out.print("대여할 도서 번호> ");
		int en_isbn = Integer.parseInt(sc.next());
		
		try {
			rm.BookRental(en_isbn);
			//System.out.println("성공적으로 대여했습니다.");
		} catch (NotFoundException | InvalidTypeException e) {
			System.err.println("대여에 문제가 생겼습니다.");
			return;
		}
		
	}

	private void 비디오대여() {
		System.out.print("대여할 비디오 번호> ");
		int en_vnum = Integer.parseInt(sc.next());
		
		try {
			rm.VideoRental(en_vnum);
			//System.out.println("성공적으로 대여했습니다.");
		} catch (NotFoundException | InvalidTypeException e) {
			System.err.println("대여에 문제가 생겼습니다.");
			return;
		}
	}

	private void 비디오등록() {
		System.out.println("** 비디오등록 **");
		System.out.println("1)비디오정보입력 99)이전메뉴");
		System.out.print("메뉴번호>");
		int menu = Integer.parseInt(sc.next());
		if(menu == 1)
			비디오정보입력();
		else
			return;
		
	}

	private void 비디오정보입력() {
		System.out.print("등록할 비디오관리번호> ");
		int en_vnum = Integer.parseInt(sc.next());
		System.out.print("등록할 비디오출판사 >");
		String publisher = sc.next();
		System.out.print("등록할 비디오제목 >");
		String title = sc.next();
		System.out.print("등록할 비디오상영시간> ");
		int runningTime = Integer.parseInt(sc.next());
		System.out.print("등록할 비디오가격> ");
		int price = Integer.parseInt(sc.next());
		
		Video video = new Video();
		video.setNum(en_vnum);
		video.setTitle(title);
		video.setPublisher(publisher);
		video.setRunningTime(runningTime);
		video.setTitle(title);
		video.setPrice(price);
		
		try {
			rm.add(video);
			System.out.println("--> 비디오가 등록되었습니다.");
		} catch (NumExistException e) {
			System.out.println("비디오가 등록되지 않았습니다");
			return;
		}
		
	}

	private void 도서등록메뉴() {
		System.out.println("** 도서등록 **");
		System.out.println("1)도서정보입력 99)이전메뉴");
		System.out.print("메뉴번호>");
		int menu = Integer.parseInt(sc.next());
		if(menu == 1)
			도서정보입력();
		else
			return;
	}

	private void 도서정보입력() {
		System.out.print("등록할 도서관리번호> ");
		int en_isbn = Integer.parseInt(sc.next());
		System.out.print("등록할 도서제목 >");
		String title = sc.next();
		System.out.print("등록할 도서저자 >");
		String author = sc.next();
		System.out.print("등록할 도서페이지수> ");
		int page = Integer.parseInt(sc.next());
		System.out.print("등록할 도서대여료> ");
		int price = Integer.parseInt(sc.next());
		
		Book book = new Book();
		book.setNum(en_isbn);
		book.setTitle(title);
		book.setAuthor(author);
		book.setPage(page);
		book.setPrice(price);
		
		try {
			rm.add(book);
			System.out.println("--> 도서가 등록되었습니다.");
		} catch (NumExistException e) {
			System.out.println("도서가 등록되지 않았습니다");
			return;
		}
		
	}

}
