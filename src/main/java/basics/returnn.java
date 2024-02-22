package basics;

import java.util.Set;

public class returnn {

	public int add(int a, int b) {

		int sum = a + b;

		System.out.println(sum);

		return sum;

	}

	public int multiple(int c, int d) {

		int multi = c * d;

		System.out.println(multi);
		return multi;

	}

	public void chec(int returnn) {

		System.out.println("stored values" + returnn);

	}

	public String letterone(String one) {

		String loverone = one;

		return loverone;

	}

	public String lettertwo(String two) {

		String lovertwo = two;

		return lovertwo;

	}

	public void leterreturn(String g) {

		System.out.println( g +"she is returned letter ");

	}

	public static void main(String[] args) {

		returnn ret = new returnn();
		int sum = ret.add(10, 20);
		ret.multiple(10, 20);
		ret.chec(sum);
		
		String letterone = ret.letterone("nayanthara");
		String lettertwo = ret.lettertwo("Anushka");
		ret.leterreturn(letterone);

	}

}
