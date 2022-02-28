package com.SpringJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException { //mapping of recieved data in their respective formats
		Student student=new Student(rs.getInt(1), rs.getString(2), rs.getString(3));
		return student;
	}

}