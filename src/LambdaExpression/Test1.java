package LambdaExpression;

@FunctionalInterface
interface WishI{
	public void wish();
}

public class Test1 {

	public static void main(String[] args) {
//		WishI s=()->{System.out.println("Hello,Good Morning");};
//		s.wish();
		
 		WishI s=()->System.out.println("Hello,Good Morning");
		s.wish();
		
		


	}

}
