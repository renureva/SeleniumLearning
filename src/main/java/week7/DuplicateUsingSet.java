package week7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

public class DuplicateUsingSet {

	public static void main(String[] args) {
		int[] a={1,9,9,11,78,90};
		int len=a.length;
		
		TreeSet<Object> set=new TreeSet<>();
		for(int i=0;i<len;i++){
			set.add(a[i]);		
		}
		System.out.println(set);	
	}
	
}
