package basics;

import java.util.Iterator;
import java.util.Scanner;

public class FactorialDemo1
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int num; // To hold number
        int fact = 1; // To hold factorial
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
       
        for(int i=1; i<=num; i++)
        {
            fact *= i;
        }
        
        System.out.println("Factorial: "+ fact);
        
        
    }
} 









//public class loop {
//
//	
//	
//	
//	public static void main(String value) {
//		
//		
//		
//		String a = "manoj";
//		
//	for (int i = 0; i < a; i++) {
//		
//		
		
		
		
		
		
		
//	}
//		
//	}
//	
//	
//}
