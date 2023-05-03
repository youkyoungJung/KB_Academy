package com.itkbs.myapp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itkbs.myapp.dto.CustomerDto;

@Repository
public class CustomerDao {
	
	@Autowired
	private SqlSession sst;

	public List<CustomerDto> selectAll() {
		return sst.selectList("selectAll");
	}

	public CustomerDto selectOne(String email) {
		return sst.selectOne("selectOne", email);
	}

	public int count() {
		return sst.selectOne("count");
	}

	public int insert(CustomerDto dto) {
		return sst.insert("insert", dto);
	}

	public int update(CustomerDto dto) {
		return sst.update("update", dto);
	}
}
