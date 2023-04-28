package com.multicampus.kb03;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource ds = context.getBean(DataSource.class);
		Connection con  = ds.getConnection();
		System.out.println("DB연결성공" + con);
		

	}

}
