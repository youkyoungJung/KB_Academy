package sp0427;

import java.util.List;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import sp0427.dao.BbsDao;
import sp0427.dto.BbsDto;

public class Main5 {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 빈주입
		// SELECT 문
		BbsDao dao = context.getBean(BbsDao.class);
		List<BbsDto> list = dao.selectAll();
		for(BbsDto dto : list) {
			System.out.println(dto);
		}
	}

}
