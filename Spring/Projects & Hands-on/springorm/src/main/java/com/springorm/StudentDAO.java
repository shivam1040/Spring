package com.springorm;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDAO {
	
	private HibernateTemplate hibernateTemplate1;
	
	@Transactional //this tag is to enable transaction and commit for this method, basicallyit allows to do write operations
	public int insert(Student student) {
		Integer i=(Integer) this.hibernateTemplate1.save(student);
		return i;
	}
	
	public Student get(int id) {
		return this.hibernateTemplate1.get(Student.class, id);
	}
	
	public List<Student> getAll(){ //get all records in DB
		return this.hibernateTemplate1.loadAll(Student.class);
	}
	
	@Transactional
	public void delete(int id) {
		Student student1=this.hibernateTemplate1.get(Student.class, id);
		this.hibernateTemplate1.delete(student1); //getting is necessary for delete operations
	}
	
	@Transactional
	public void update(Student student) {
		this.hibernateTemplate1.update(student);
	}
	
	public HibernateTemplate getHibernateTemplate1() {
		return hibernateTemplate1;
	}

	
	public void setHibernateTemplate1(HibernateTemplate hibernateTemplate1) {
		this.hibernateTemplate1 = hibernateTemplate1;
	}
	
	
}
