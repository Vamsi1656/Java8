package FunctionalInterface;


interface Maths1{
	
	public int squareIt(int x);
}

public class WithLambdaExprEx3 {
	
	public static void main(String[] args) {
		Maths1 m=(x)->x*x;
	   System.out.println(m.squareIt(10));

	}

}
