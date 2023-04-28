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

public class Main7 {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 빈주입
		// SELECT 문
		SqlSessionTemplate sst = context.getBean(SqlSessionTemplate.class);
		List<BbsDto> list = sst.selectList("selectAll");
		for(BbsDto dto:list) {
			System.out.println(dto);
		}

	}

}
