package com.SpringJDBC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages= {"com.SpringJDBC"})
public class JDBCConfigWithoutXML {
	
	@Bean("dataSource1")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jd=new JdbcTemplate();
		jd.setDataSource(getDataSource());
		return jd;
	}
	
	/*
	 * @Bean("studentDaoImple1") public StudentDao getStudentDao() { StudentDaoImple
	 * sd=new StudentDaoImple(); sd.setJdbcTemplate1(getTemplate()); return sd; } //uncomment this when not using autowiring
	 */
}
