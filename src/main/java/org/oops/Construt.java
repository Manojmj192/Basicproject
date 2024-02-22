package org.oops;

public class Construt {

	String value;

	int v;

	public Construt(String b) {

		
		this.value=b;

		System.out.println(value);

	}
	
	public Construt(String c,int a) {
		
		this.value=c;
		int k =a;
		System.out.println(value);
		System.out.println(k);
		
		
		
		
	}

	public static void main(String[] args) {
		
		
		Construt cc = new Construt("manoj");
		
//		Construt con = new Construt("MLM");
//		Construt c = new Construt("HGF", 10);

	}

}
