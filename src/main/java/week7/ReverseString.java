package week7;

public class ReverseString {

	public static void main(String[] args) {
		/* Get the string
		 * split by space
		 * store it in an array 
		 * get arrange length
		 * type it in reverse order
		
		 */
		String s1="hello world";
		String[] s2=s1.split("e");
		
		int length =s2.length;
		String rev=" ";
		
		for(int i=length-1;i>=0;i--){
			rev=rev+" "+s2[i];
		}
		System.out.println(rev);	
	
		
	}

	}

