package basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Systemtime {

	
	public static void main(String[] args) {
		
		
		LocalDateTime d = LocalDateTime.now();
		System.out.println(d);
		
		DateTimeFormatter c = DateTimeFormatter.ofPattern("dd-mm-yy hh:mm:ss");
		String format = d.format(c);
		System.out.println(format);
		
		
		
		
		
	}
	
	
}
