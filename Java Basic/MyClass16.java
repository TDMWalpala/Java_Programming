public class MyClass20{
	public static void main(String args[]){
		boolean a = true;
		boolean b = false;

		System.out.println("a & b : "+(a&b));
		System.out.println("a | b : "+(a|b));
		System.out.println("!a : "+(!a));


		// short circuit &&, ||
		System.out.println("a && b : "+(a&&b));
		System.out.println("a || b : "+(a||b));
	}
}