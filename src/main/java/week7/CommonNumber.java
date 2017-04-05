package week7;

import java.util.TreeSet;

public class CommonNumber {

	public static void main(String[] args) {
		int[] a1={6,3,4,5,9};
		int[] a2={2,3,4,5,6};
		TreeSet<Integer> a3= new TreeSet<Integer>();

		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if (a1[i]==a2[j]){
					a3.add(a1[i]);
                       }
			}
			
		}
		System.out.println(a3);

	}}

