package basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Reverse {

	public void reversee() {

		String value = "Manoj";

		for (int i = value.length() ; i >=0; i--) {

//			System.out.println(value.length());

			System.out.print(value.charAt(i));

		}

	}

	public void lisst() {

		List<Object> myList = new ArrayList<Object>();

		String value = "manoj";

		for (int i = value.length() - 1; i >= 0; i--) {

			myList.add(value.charAt(i));

		}

		System.out.println(myList);

	}

	public void star() {

		int row = 5;

		for (int i = 0; i < row; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();

		}
	}

	public void rstar() {

		int row = 5;

		for (int i = row; i > 0; i--) {

			for (int j = i; j > 0; j--) {

				System.out.print("*");

			}
			System.out.println();

		}

	}

	public void swap() {

		int a = 10;
		int b = 20;

		System.out.println("before swap");

		int temp = a;
		a = b;
		b = temp;

		System.out.println("value A=" + a);
		System.out.println("Value b=" + b);

	}

	public static void main(String[] args) {

		Reverse s = new Reverse();
		s.reversee();
//		s.lisst();
//		s.star();
//		s.rstar();
//		s.swap();
	}
	
	
	
}
