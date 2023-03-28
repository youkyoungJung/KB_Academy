package java_ws0327_2;

import java.util.Collection;
import java.util.HashMap;

public class RentalManager2 {
	private HashMap<Integer, Rental> map = new HashMap<>();
	
	public void add(Video v) throws NumExistException {
		Rental rental = map.get(v.getNum());
		if(rental != null) {
			throw new NumExistException(v.getNum());
		}
		map.put(v.getNum(), v);
	}
	
	public void add(Book b) throws NumExistException {
		Rental rental = map.get(b.getNum());
		if(rental != null) {
			throw new NumExistException(b.getNum());
		}
		map.put(b.getNum(), b);
	}
	
	public int getTotalCount() {
		return map.size();
	}
	
	public int getBookCount() {
		Collection<Rental> values = map.values();
		int bookCount = 0;
		for(Rental rental : values) {
			if(rental instanceof Book) {
				bookCount++;
			}
		}
		return bookCount;
	}
	
	public int getVideoCount() {
		Collection<Rental> values = map.values();
		int videoCount = 0;
		for(Rental rental : values) {
			if(rental instanceof Video) {
				videoCount++;
			}
		}
		return videoCount;
	}
	//비디오 검색
	public Video findByVideo(int num) throws NotFoundException, InvalidTypeException {
		Rental rental = map.get(num);
		if(rental ==  null) {
			throw new NotFoundException(num);
		}
		//도서타입이면 예외
		if(rental instanceof Book)
			throw new InvalidTypeException("도서타입");
		return (Video) rental;
	}
	//책 검색
	public Book findByBook(int num) throws NotFoundException, InvalidTypeException {
		Rental rental = map.get(num);
		if(rental ==  null) {
			throw new NotFoundException(num);
		}
		//비디오타입이면 예외
		if(rental instanceof Video)
			throw new InvalidTypeException("비디오타입");
		return (Book) rental;
	}
	//비디오대여
	public void VideoRental(int num) throws NotFoundException, InvalidTypeException {
		Video v = findByVideo(num);
		if(v.isState() == true) {
			System.out.println("누군가가 대여중입니다.");
			return;
		}else {
			v.setState(true);
			System.out.println("비디오대여성공^^");
		}
	}
	//책대여
	public void BookRental(int num) throws NotFoundException, InvalidTypeException {
		Book v = findByBook(num);
		if(v.isState() == true) {
			System.out.println("누군가가 대여중입니다.");
			return;
		}else {
			v.setState(true);
			System.out.println("책대여성공^^");
		}
	}
	//책반납
	public void BookReturn(int num) throws NotFoundException, InvalidTypeException {
		Book b = findByBook(num);
		if(b.isState() == true) {
			b.setState(false);
			System.out.println("도서반납이 성공적으로 이루어짐");
		}else {
			System.out.println("빌려진 책이 아닙니다.");
			return;
		}
	}
	//비디오
	public void VideoReturn(int num) throws NotFoundException, InvalidTypeException {
		Video b = findByVideo(num);
		if(b.isState() == true) {
			b.setState(false);
			System.out.println("비디오반납이 성공적으로 이루어짐");
		}else {
			System.out.println("빌려진 비디오가 아닙니다.");
			return;
		}
	}
	
	
	
	 //전체출력
    public void printAll() {
		System.out.println("***전체 출력***");
		Collection<Rental> values = map.values();
		for(Rental rental : values) {
			System.out.println(rental);
		}
	}

}
