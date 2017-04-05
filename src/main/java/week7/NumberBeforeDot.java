package week7;

public class NumberBeforeDot {

	public static void main(String[] args) {
		Double a=99.99;
		String str=new String(a.toString());
		int dot=str.indexOf(".");
		System.out.println("The value before dor is:"+str.substring(0,dot));
		//Another  way//System.out.println(a.intValue());
				
		
	}
}
