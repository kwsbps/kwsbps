package com.example.demo;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 *
 *
 * @author : kimwonseok
 * @Date : 2017. 10. 26.
 * @Version :
 */
@SpringBootApplication
@MapperScan(value = { "com.example.demo.board.mapper" })
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/*
	 * sqlsessionfactory 설정
	 */
	@Bean
	public SqlSessionFactory sqlSessionFactory(javax.sql.DataSource dataSource) throws Exception {

		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();

		sessionFactory.setDataSource(dataSource);
		return sessionFactory.getObject();

	}

}
