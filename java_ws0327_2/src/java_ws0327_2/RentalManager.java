package java_ws0327_2;

import java.util.ArrayList;


public class RentalManager {
	private ArrayList<Rental> rentalList = new ArrayList<>();
    
    public void add(Rental r) throws NumExistException{
        //num중복검사
        for (Rental rental : rentalList) {
            //같은 num있으면 예외 발생
        	//rental.setState(true);
            if(rental.getNum() == r.getNum()) 
                throw new NumExistException();
        }
        //등록된 모든 도서의 num과 중복되지 않는다면 등록
        rentalList.add(r);
    }

//    public void add(Video v) throws NumExistException{
//        add((Video)v);
//    }
    public int getCount() {
    	return rentalList.size();
    }
    
    public Rental findByNum(int num) throws NotFoundException{
    	for(Rental rental: rentalList) {
    		if(rental.getNum() == num)
    			return rental;
    	}
    	throw new NotFoundException();
    }
    //대여시 상태 업데이트
    public void stateUpdate(int id) throws NotFoundException{
	   Rental rState = findByNum(id);
	   rState.setState(true);	   
    } 
    //책과 비디오 구분
    public int BookCount(){
    	int b_count = 0;
    	for(Rental rental : rentalList) {
			if(rental.getNum() < 3000)
				b_count += 1;
		}
		return b_count;
    }
    public int VideoCount(){
    	int v_count = 0;
    	for(Rental rental : rentalList) {
			if(rental.getNum() < 3000)
				v_count += 1;
		}
		return v_count;
    }
    
    //전체출력
    public void printAll() {
		System.out.println("***전체 출력***");
		for(Rental rental : rentalList) {
			System.out.println(rental.toString());
		}
	}
}
