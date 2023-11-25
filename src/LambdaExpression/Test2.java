package LambdaExpression;

interface WishInterface {

	public int length(String s);
}

public class Test2 {

	public static void main(String[] args) {
//		WishInterface l=(s)->{return s.length();};
//		System.out.println(l.length("Hello"));
		
		WishInterface l=(s)->s.length();
		System.out.println(l.length("Nani"));

	}

}
