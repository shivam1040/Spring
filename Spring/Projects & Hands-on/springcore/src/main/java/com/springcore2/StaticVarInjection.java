package com.springcore2;

public class StaticVarInjection {
	private static String carName;

	public static String getCarName() {
		return carName;
	}

	public static void setCarName(String carName) {
		StaticVarInjection.carName = carName;
	}
	
	 public static void print() {
		 System.out.println(carName);
	 }
}
