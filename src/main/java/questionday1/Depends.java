package questionday1;

import org.testng.annotations.Test;

public class Depends {
	
	@Test
	public void testcaseA()
	{
		System.out.println("Method A is running");
	}

	@Test(dependsOnMethods  ="Depends.testcaseA")
	public void testcaseB()
	{
		System.out.println("Mehtod B is running");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
