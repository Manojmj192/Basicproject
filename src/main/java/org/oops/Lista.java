package org.oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lista {

	public void alist() {

		List<String> li = new ArrayList<String>();
		li.add("Manoj");
		li.add("Natarajan");
		li.add("Surya");
		li.add("Praveen");

		System.out.println(li);

		String value = li.get(1);
		System.out.println(value);
		String remove = li.remove(1);
		System.out.println(remove);

		System.out.println(li);

		List<String> ml = new ArrayList<String>();

		ml.addAll(li);
		System.out.println(ml);

		ml.add("Prasanna");
		System.out.println(ml);
		ml.set(0, "Vijay");
		System.out.println(ml);

	}

	public void blist() {

		List<Integer> t = new ArrayList<Integer>();
		t.add(1);
		t.add(20);
		t.add(30);
		t.add(15);

		System.out.println(t);

		Iterator<Integer> iterator = t.iterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());

		}

		
	}

	public static void main(String[] args) {

		Lista a = new Lista();
		a.alist();
		a.blist();

	}

}
