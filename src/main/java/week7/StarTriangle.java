package week7;

public class StarTriangle {

	
		public static void main(String[] args) 
		{
		int i,j,k;
		for(i=1; i<=5; i++)
		{
		for(j=2; j>=i; j--)
		{
		System.out.print(" ");
		}
		for(k=1; k<=(2*i-1); k++)
		{
		System.out.print("*");
		}
		System.out.println("");
		}
		}
		}