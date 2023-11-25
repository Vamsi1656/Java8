package FunctionalInterface;

interface Test{
	
	public void list(int i,String s);
}

public class WithLambdaExprEx4 
{

	public static void main(String[] args)
	{
		Test t = (a,b)->{System.out.println(a+","+b);};
		t.list(4, "Vasu");
	}

}
