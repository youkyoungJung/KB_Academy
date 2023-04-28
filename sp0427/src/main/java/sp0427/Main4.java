package sp0427;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main4 {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 빈주입
		// SELECT 문
		JdbcTemplate tpl = context.getBean(JdbcTemplate.class);
		String sql = "SELECT count(*) FROM BBS";
		//문자열 하나 출력하기. 뒤에 Integer.class를 붙이면 integer로 변환
		int count = tpl.queryForObject(sql, Integer.class);
		System.out.println(count);
		
		//1개 문자열 출력하기, String.class 붙이면 string으로 반환
		sql = "select title from bbs where no=?";
		String title = tpl.queryForObject(sql, String.class, 1);
		System.out.println(title);

	}

}
