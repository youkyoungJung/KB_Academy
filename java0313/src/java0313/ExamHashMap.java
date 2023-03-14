package java0313;

import java.util.HashMap;

public class ExamHashMap {

	public static void main(String[] args) {
		//Collection 에는 크게 2가지 부류의 타입
		//1. Collection - 값만 저장(순서지원-List, 미지원-Set)
		//2. Map - 키, 값 저장
		HashMap<String, Integer> scores = new HashMap<>();
		scores.put("홍길동", 90);
		scores.put("김길동", 80);
		scores.put("박길동", 85);
		System.out.println(scores);
		//검색
		System.out.println(scores.get("홍길동"));
		//키값이 없을경우 null 반환
		System.out.println(scores.getOrDefault("강길동", null));
		System.out.println(scores.getOrDefault("김길동", null));
		//수정 : put(K,V)
		//삭제 
		scores.remove("홍길동");
		System.out.println(scores);
	}//main_f
}
