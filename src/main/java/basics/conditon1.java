package basics;

import java.util.Scanner;

public class conditon1 {

	public void con() {

		Scanner scan = new Scanner(System.in);

		System.out.println("please enter your DOB");
		int n = scan.nextInt();

		if (n >= 18) {
			System.out.println("Your eligible for voting ");

		} else if (n <= 17) {
			System.out.println("you are not eligible for voting");

		}

	}

	public static void main(String[] args) {

		conditon1 a = new conditon1();
		a.con();

	}

}
