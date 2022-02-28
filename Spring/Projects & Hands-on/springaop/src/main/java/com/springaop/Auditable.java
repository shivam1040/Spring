package com.springaop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//way to create annotation
@Retention(RetentionPolicy.RUNTIME) //this means annotation will be called at runtim
@Target(ElementType.METHOD) //this means annotation can be used for methods
public @interface Auditable {
	AuditDestination value();
	public enum AuditDestination{
		DATABASE, FILE_SYSTEM //giving value to this annotation
	};
}