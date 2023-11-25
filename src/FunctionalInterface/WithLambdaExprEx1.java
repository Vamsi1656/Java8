package FunctionalInterface;

interface Add1 {
	public void m2(int a,int b);
}

public class WithLambdaExprEx1  {

	public static void main(String[] args) {
		Add1 add=(a,b)->{System.out.println(a+b);};
		add.m2(100, 200);

	}

}
