package com.springcore2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component(value="com.springcore2")
public class ConfigForNoXML {
	
	@Bean
	public Address getObj1() {
		return new Address();
	}
	//@Bean(name= {"obj, obj1"}) //if we don't wish to use method name for passing it as parameter to getbean method then we can declare array of names or no array to use the name as per our choice
	@Bean //this can be used instead of defining Component tag in ConnfigWithoutXML class
	public ConnfigWithoutXML getObj() {
		return new ConnfigWithoutXML(this.getObj1()); //a non static method can be called by using this
	}
}
