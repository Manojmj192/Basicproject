package basics;

public class Task {

	public void signal(int value, int value1) {

		int DOB = value;

		int currentyear = value1;

		int age = currentyear-DOB;

//		boolean Indian;

//		String nationality = value2;

//		int a = 18;

	
		if (age >= 18 ) {

			System.out.println("you are eligibible for voting ");

		} else if (age <= 18 ) {

			System.out.println("you are not eligible for voting");

		}
		else {
			
			System.out.println("ABC");
			
		}

	}

	public static void main(String[] args) {
		Task hk= new Task();
		
		hk.signal(2023,1997);

	}

}
