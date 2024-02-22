package org.oops;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public void aset() {

		Set<String> s = new HashSet<String>();
		s.add("Manoj");
		s.add("Vijy");
		s.add("ajith");

		System.out.println(s);

		for (String string : s) {
			System.out.println(string);

		}
		Set<String> f = new TreeSet<>();
		f.addAll(s);
		System.out.println();

		boolean containsAll = f.containsAll(s);

		System.out.println(containsAll);

	}

	private void bset() {
		TreeSet<Integer> a = new TreeSet<Integer>();
		a.add(65);
		a.add(70);
		a.add(50);
		a.add(30);
		a.add(100);

		System.out.println(a);
		Integer lower = a.lower(100);
		System.out.println(lower);

		Integer higher = a.higher(30);
		System.out.println(higher);

	}

	public static void main(String[] args) {

		Sets d = new Sets();
		d.aset();
		d.bset();

	}

}
