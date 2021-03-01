package myExceptions;
import java.util.*;
import java.text.SimpleDateFormat;


public class dateFormat {
	static void convertDateFormate(String input) {
		try {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date date = sdf.parse(input);
		SimpleDateFormat outputsdf = new SimpleDateFormat("yyyy/mm/dd");
		String outputDate = outputsdf.format(date);
		System.out.println("after input the date the formatted output is:"+ outputDate);
		}
		catch( java.text.ParseException e) {
			System.out.println("exception occured while inputting the date ");
			
		}
		
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a date ");
		String input = sc.nextLine();
		convertDateFormate(input);
	}
	

}
