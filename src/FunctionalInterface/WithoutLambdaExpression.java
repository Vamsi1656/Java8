package FunctionalInterface;

interface Interf{
	public void m1();
}

public class WithoutLambdaExpression implements Interf {
	
	public void m1() {
		System.out.println("Hello,Good Afternoon");
	}

	public static void main(String[] args) {
		Interf i=new WithoutLambdaExpression();
		i.m1();

	}

}
