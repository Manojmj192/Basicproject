package basics;

public class VoterIDTask {

	public void check(int a, int b, String value) {

		int AgeCheck = a - b;

		String nationality = value;

//		if (AgeCheck >= 18) {
//
//			System.out.println("You are eligible for voting");
//
//		} else if (AgeCheck < 18) {
//
//			System.out.println("you are not eligible for voting ");
//
//		}
		if (AgeCheck >= 18 && nationality == "Indian") {

			System.out.println("You are eligible");

		} else if (AgeCheck >= 18 && nationality != "Indian") {

			System.out.println("you are not eligible");

		} else {

			System.out.println("please check the code");

		}

	}

	public void waitingtime(int currentyear, int DOB) {

		int age = currentyear - DOB;

		if (age >= 18) {

			System.out.println("you officially voting person");

		} else {

			for (int i = age; i <= 18; i++) {

				int waitingyear = i;

				System.out.println("your need wait " + i);
			}

		}

	}

	public void another(int currentyear, int DOB) {

		int age = currentyear - DOB;

		if (age >= 18) {

			System.out.println("you officially voting person");

		} else {

			int waitingperiod = 18 - age;
			System.out.println("you need to wait " + waitingperiod+ " more year");
		}

	}

	public static void main(String[] args) {

		VoterIDTask task = new VoterIDTask();
		task.check(2023, 1997, "Indiqan");
		task.waitingtime(2023, 2018);
		task.another(2023, 2010);

	}

}
