package week7;

import java.io.*;
import java.util.*;

public class Freshdesk1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len1=A.length();
        int len2=B.length();
        int sumlen=len1+len2;
        System.out.println("the sum lenght"+sumlen);
        if(A.compareTo(B)<0)
            {   System.out.println("LEXI");   
        }else 
            {System.out.println("NO LEXI");}
        String C=A.substring(0,1).toUpperCase()+A.substring(1);
        String D=B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(C+" "+D);
        
    }
}

