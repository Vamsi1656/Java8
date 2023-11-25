package FunctionalInterface;

interface Interf1{
	
	public void m2();
}

public class WithLambdaExpression {

	public static void main(String[] args) {
		Interf1 i=()->{System.out.println("Hello Good Afternoon");};
		i.m2();

	}

}
