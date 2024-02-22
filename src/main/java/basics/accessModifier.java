package basics;

public class accessModifier {

	public Integer typeR(int dob, int year, int currentyear) {

		int a = currentyear - dob;

		System.out.println(a);
		System.out.println(a + year);

		return null;

	}

	public static void main(String[] args) {

		accessModifier acc = new accessModifier();
		acc.typeR(1997, 2024, 2024);

	}

	
}

