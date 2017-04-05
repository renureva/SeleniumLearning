package testcases;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main (String args[]){

		// Define the pattern
		String pattern = "[0-9]";

		// Compile the pattern
		Pattern p = Pattern.compile(pattern);

		// Get the matcher
		Matcher match = p.matcher("ani17tha84");		
		System.out.println(match);
		
		
		// if multiple matches
		while (match.find()) {
			System.out.println("first  "+match);
            String group = match.group();
            System.out.println("second "+group);
            
           		
            }
System.out.println();


	}
}