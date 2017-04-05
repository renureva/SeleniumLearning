package week7;

public class ThreeDigitNumber {

	public static void main(String[] args) {
        int p= 0;
        for(int i = 100;i <=999;i++) {
            for(int j = i;j <=999;j++) {
                int value1 = i * j;
                StringBuilder sb1 = new StringBuilder(""+value1);
                String sb2 = ""+value1;
                
                sb1.reverse();
                if(sb2.equals(sb1.toString()) && p<value1) {
                   p = value1;
                }                    
            }
        }

        System.out.println("The Palindrome value is- "+p);
    }
}

