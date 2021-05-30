package com.wcs;

public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wilder Jane = new Wilder("Jane");
		Jane.setAware(true);
		Wilder John = new Wilder("John");
		John.setAware(false);
		
		System.out.println(Jane.whoAmI());
		System.out.println(John.whoAmI());

	}

}
