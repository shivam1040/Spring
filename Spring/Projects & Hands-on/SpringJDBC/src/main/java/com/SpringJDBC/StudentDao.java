package com.SpringJDBC;

import java.util.List;

public interface StudentDao {
	public int insert(Student student);
	public int updateById(Student student);
	public int delete(int studentID);
	public Student get(int studentID);
	public List<Student> getAll();
}
