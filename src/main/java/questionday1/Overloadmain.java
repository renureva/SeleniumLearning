package questionday1;

public class Overloadmain {

	static public void main(String[] args) {
		System.out.println("String[]");
		main(10);
	}
	public static void main(int a) {
		System.out.println("Int a value is "+a);
	}
	public static void main(Double[] args) {
		System.out.println("Double");
	}
}
/*/Now you know that its possible to overload main in Java but its not possible to override it,
simply because its a static method. 
Execution of Java program has no impact on overloading main 
because JVM always call the original main method and if it doesn't found in class 
then it throws java.lang.NoSuchMethodError: main Exception in thread "main" error at runtime.

*/