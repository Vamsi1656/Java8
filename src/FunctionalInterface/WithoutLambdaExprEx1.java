package FunctionalInterface;


interface Add {
	public void add(int a,int b);
}

public class WithoutLambdaExprEx1 implements Add {
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Add a=new WithoutLambdaExprEx1();
		a.add(10, 20);
		a.add(100, 200);

	}

}
