package org.oops;

public class Polyclas {

	public int check(name a) {
		int abc = 20;

//		System.out.println(abc);
		return abc;

	}

	public int check(int s, int a) {

		System.out.println(s + a);
		return s + a;

	}

	public String check(String s) {

		return s;

	}

	public static void main(String[] args) {

		Polyclas c = new Polyclas();

		name n = new name();
		int check = c.check(n);
		System.out.println(check);
		
	}

}
