package sp0427;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.naming.Context;
import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import sp0427.dto.BbsDto;

public class Main8 {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 빈주입
		// SELECT 문
		SqlSessionTemplate sst = context.getBean(SqlSessionTemplate.class);
		BbsDto dto = new BbsDto();
		dto.setTitle("mybatis 테스트");
		dto.setWriter_id("user01");
		dto.setContent("MyBatis 테스트 내용입니다");
		sst.insert("insert", dto);
		System.out.println("등록성공");

	}

}
