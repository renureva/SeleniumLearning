package questionday1;

public class PrintEachletter {

	public static void main(String[] args) {
		String name="renu";
		char c[]=name.toCharArray();
		int num=name.length();
		for(int i=0;i<name.length();i++){
			System.out.println("The letters are::"+c[i]);
		}

	}

}
