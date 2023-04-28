package sp0427.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sp0427.dto.BbsDto;

@Repository
public class MyBbsDao {
	@Autowired
	private SqlSessionTemplate sst;
	
	public List<BbsDto> selectAll(){
		return sst.selectList("selectAll");
	}
	public BbsDto selectOne(int no) {
		return sst.selectOne("selectOne", no);
	}
	
	public int count() {
		return sst.selectOne("count");
	}

}

