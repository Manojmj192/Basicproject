package org.oops;

public class ChildAbstract extends Abstract implements inter {

	@Override
	public void hm() {

		System.out.println("hello");
		
		

	}

	public static void main(String[] args) {

		ChildAbstract a = new ChildAbstract();
		a.hm();

	}

	@Override
	public void ks() {
		System.out.println();	
	}
	
	

}
