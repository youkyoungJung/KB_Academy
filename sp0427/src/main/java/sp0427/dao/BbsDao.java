package sp0427.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import sp0427.dto.BbsDto;

@Repository
public class BbsDao {

	@Autowired
	private JdbcTemplate tpl;
	
	public List<BbsDto> selectAll(){
		//List<BbsDto> list;
		String sql = "SELECT * FROM BBS ORDER BY no DESC";
		List<BbsDto> list = tpl.query(sql, new BeanPropertyRowMapper<BbsDto>(BbsDto.class));
		return list;
	}
	
	/*
	 * public int insert() { String sql =
	 * "insert into Bbs(no, title, writer_id, content, regdate) " +
	 * "values(bbs_seq.nextVal, #{title}, #{writer_id}, #{content}, sysdate)";
	 * return list; }
	 */
}
