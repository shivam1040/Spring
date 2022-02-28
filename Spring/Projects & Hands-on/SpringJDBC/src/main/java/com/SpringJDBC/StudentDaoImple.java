package com.SpringJDBC;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("studentDaoImple1")
public class StudentDaoImple implements StudentDao {

	@Autowired //this autowired can be used above setter method too
	private JdbcTemplate jdbcTemplate1;
	@Override
	public int insert(Student student) {
		String query="insert into student(id, name, city) value(?, ?, ?)";
		int update=this.jdbcTemplate1.update(query, student.getId(), student.getName(), student.getCity());
		return update;
	}
	public JdbcTemplate getJdbcTemplate1() {
		return jdbcTemplate1;
	}
	public void setJdbcTemplate1(JdbcTemplate jdbcTemplate1) {
		this.jdbcTemplate1 = jdbcTemplate1;
	}
	
	@Override
	public int updateById(Student student) {
		String query="update student set name=?, city=? where id=?";
		int result=this.jdbcTemplate1.update(query, student.getName(), student.getCity(), student.getId());
		return result;
	}
	@Override
	public int delete(int studentID) {
		String query="delete from student where id=?";
		int result=this.jdbcTemplate1.update(query, studentID);
		return result;
	}
	@Override
	public Student get(int studentID) { //this returns only one row as per condition
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper1=new RowMapperImpl();
		Student student=this.jdbcTemplate1.queryForObject(query, rowMapper1, studentID);
		return student;
	}
	@Override
	public List<Student> getAll() { //returns all records
		String query="select * from student";
		List<Student> students=this.jdbcTemplate1.query(query, new RowMapperImpl());
		return students;
	}

}
