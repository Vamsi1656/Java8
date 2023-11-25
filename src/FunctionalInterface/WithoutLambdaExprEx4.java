package FunctionalInterface;

interface List{
	
	public void list(int i,String s);
}

public class WithoutLambdaExprEx4 implements List {
	
	public void list(int i,String s) {
		
		System.out.println(i);
		System.out.println(s);
	}

	public static void main(String[] args) {
			List l=new WithoutLambdaExprEx4();
		    l.list(101, "Nani");

	}

}
