package com.springcore;

public class Aref {
	private int x;
	private Bref ob;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public Bref getOb() {
		return ob;
	}
	public void setOb(Bref ob) {
		this.ob = ob;
	}
	public Aref() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Aref [x=" + x + ", ob=" + ob + "]";
	}
	
	
}
