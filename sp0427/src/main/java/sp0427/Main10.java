package sp0427;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.naming.Context;
import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import sp0427.dao.BbsDao;
import sp0427.dao.MyBbsDao;
import sp0427.dto.BbsDto;

public class Main10 {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// SqlSessionTemplate 을 이용한 Dao 만들기
		MyBbsDao dao = context.getBean(MyBbsDao.class);
		//BbsDto dto = new BbsDto();
		int count = dao.count();
		System.out.println(count);
		
	}//end main
}
