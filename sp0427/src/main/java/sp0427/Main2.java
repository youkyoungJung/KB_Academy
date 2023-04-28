package sp0427;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import sp0427.dto.BbsDto;

public class Main2 {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//빈주입
//		DataSource ds = context.getBean(DataSource.class);
//		Connection con  = ds.getConnection();
//		System.out.println("DB연결성공" + con);
		JdbcTemplate tpl = context.getBean(JdbcTemplate.class);
		//insert 코드
		String sql = "insert into bbs(no, title, writer_id, content, regdate)";
		sql += "values(bbs_seq.nextval, ?,?,?,sysdate)";
		tpl.update(sql, "sp_title", "sp001", "스프링 jdbctemplate 테스트");
		System.out.println("등록성공");

		

	}

}
