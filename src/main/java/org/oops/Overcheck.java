package org.oops;

public class Overcheck extends overriding {

	
	@Override
	public void sss() {
		
		System.out.println("print this class");
	}
	
	
	public static void main(String[] args) {

		overriding r = new Overcheck();

		r.sss();

	}

}
