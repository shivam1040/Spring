package com.springcore2;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//@Component("obj") //by doing so one need not to restrict to using camelCase name of classname to get the bean, "obj" can be used to get the bean
@Component() //this is for creating obj at runtime without having to write bean tags in config xml
//@Scope("prototype") //annotation method to define scope
public class StereoAnnotations {
	@Value("SJ") //tag to inject value into below variable at runtime
	private String studentName;
	@Value("LK")
	private String city;
	@Value("#{temp}") //this tag will search for a standalone collection in xml having temp value in the id attribute and inject the list
	//the literals inside parenthesis above are known as spring expression language
	private List<String> address;
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "StereoAnnotations [studentName=" + studentName + ", city=" + city + ", address=" + address + "]";
	}
	
	
	
}
