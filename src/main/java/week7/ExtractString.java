package week7;

public class ExtractString {

	public static void main(String[] args) {
		
//	        String s1 = " 8 sometext 7 3";
//	        String arr[] = s1.trim().split("[a-zA-Z0-9 ]+"); // Please note a space is there after Z
//	// System.out.println(arr+" ");
//	        int sum = 0;
//	 
//	        for (int i = 0; i < arr.length; i++){
//	            sum += Integer.parseInt(arr[i]);
//	        
//	        System.out.println(sum);
	//	}
	///Another Method
		String str = "abc d 1234567890pqr 54897";
	    StringBuilder myNumbers = new StringBuilder();
	    for (int i = 0; i < str.length(); i++) {
	        if (Character.isDigit(str.charAt(i))) {
	            myNumbers.append(str.charAt(i));
	            System.out.println(str.charAt(i) + " is a digit.");
	        } else {
	            System.out.println(str.charAt(i) + " not a digit.");
	        }
	    }
	    System.out.println("Your numbers: " + myNumbers.toString());
	
	
	}

}
