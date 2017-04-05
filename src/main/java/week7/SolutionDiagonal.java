package week7;

import java.io.*;
import java.util.*;

public class SolutionDiagonal {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[][]=new int[n][n];
        int i=0,j=0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int sum1=0,sum2=0;
        for(i=0;i<n;i++){
            sum1+=arr[i][i];   }
        
        int k=n-1;
        for(i=0;i<n;i++)
            {
            sum2=sum2+arr[i][k];
            k--;
        }
        
        System.out.println(-sum1+sum2);
    }
}