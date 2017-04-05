package week7;

public class WordTrim {

	public static void main(String[] args) {
		String S1="hi world  ";
		//to trim the white spaces at the end
		System.out.println(S1+"hehe");
		System.out.println(S1.trim()+"hehe");
		
	//To use replacall
		String S2="Hello Friend";
		String S3=S2.replaceAll("Hello", "Hi");
		System.out.println(S3);
		
	//To find the duplicate value 
		int dup=0;
		for(int i=0;i<S2.length();i++){
			for(int j=0;j<S2.length();j++){
				if(S2.charAt(i)==S2.charAt(j))
				{
					dup++;
					System.out.println(S2.charAt(j)+"---"+dup);
				}
				
			}
			
		}
			
		
	}

}
