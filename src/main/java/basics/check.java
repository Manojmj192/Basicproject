package basics;

public class check {

	public void reverse() {

		String ABC = "level";

		for (int i = ABC.length() - 1; i >= 0; i--) {

			char aaa = ABC.charAt(i);
			System.out.print(aaa);

		}

	}

	public void palindrome(String value) {

		String rev = "";

		for (int i = value.length() - 1; i >= 0; i--) {

			rev = rev + value.charAt(i);

			System.out.println(rev);

		}

		if (value.equals(rev)) {

			System.out.println("its a palindrome");

		} else {

			System.out.println("not a  palindorm");

		}

	}

	public static void main(String[] args) {

		check c = new check();
		c.reverse();

//		c.palindrome("level");

	}

}
