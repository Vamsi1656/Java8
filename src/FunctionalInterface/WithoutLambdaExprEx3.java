package FunctionalInterface;

interface Maths{
	
	public int squareIt(int x);
}

public class WithoutLambdaExprEx3 implements Maths {
	
	public int squareIt(int x) {
		
		
		return x*x;
	}

	public static void main(String[] args) {
		Maths s=new WithoutLambdaExprEx3();
		System.out.println(s.squareIt(4));
		System.out.println(s.squareIt(234));

	}

}
