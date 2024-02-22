package basics;

public class palindrom {

	public static boolean Mkd(String str) {

		String rev = "";

		boolean ans = false;

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			ans = true;
		}
		return ans;

	}
	
	private void pali() {

  
		 int num = 12345;
		 
		 int i =0; int j=0; int a = num;
		 
		 while (a>0) {
			 
			 i= a%10;
			 j= (j*10)+i;
			 a=a/10;
			
		}
		
		System.out.println(j);

	}
	
	
	
	
	
	public static void main(String[] args) {
		
		String str ="level";
		
		String lowerCase = str.toLowerCase();
		boolean d = Mkd(str);
		System.out.println(d);
		
		palindrom p = new palindrom();
		p.pali();
		
		

	}

}
