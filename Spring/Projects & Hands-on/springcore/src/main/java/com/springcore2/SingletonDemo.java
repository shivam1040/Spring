package com.springcore2;

public class SingletonDemo {
	private static SingletonDemo singletonDemo1;
	
	public static SingletonDemo getInstance() {
		if(singletonDemo1==null) {
			singletonDemo1=new SingletonDemo();
			System.out.println("a");
			return singletonDemo1;
		}
			else { //singleton logic
				System.out.println("b");
				return singletonDemo1;
				
			}
		}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException(); //this will avoid cloning of singleton obj,a way to bypass singleton principle and create more than one obj for same
	}
	
	
	}

