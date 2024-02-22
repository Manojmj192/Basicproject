package basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Alphabets {

	public void usingMap() {

		Map<Character, Integer> value = new HashMap<>();

		for (Character c = 'a'; c <= 'z'; c++) {
			System.out.println(c - 'a');
			value.put(c, c - 'a' + 1);

			System.out.println(c + " = " + value.get(c));
		}

	}

	public static void main(String[] args) {

		Alphabets a = new Alphabets();
		a.usingMap();

	}

}
