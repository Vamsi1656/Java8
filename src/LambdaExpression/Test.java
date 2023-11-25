package LambdaExpression;


interface  Lambda{
	public void add(int a,int b);
}

public class Test{

	public static void main(String[] args) {
//		int a=10;
//		int b=20;
//		Lambda l=()->{System.out.println(a+b);};
//		l.add();
		
//		Lambda l=(int a,int b)->{System.out.println(a+b);};
//		l.add(10,20);
		
		Lambda l=( a, b)->System.out.println(a+b);
		l.add(10,20);

 
	}

}
