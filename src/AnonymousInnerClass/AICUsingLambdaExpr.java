package AnonymousInnerClass;


interface Interf1 {
	public void eat();
}

public class AICUsingLambdaExpr {

	public static void main(String[] args) {
		
		Interf1 i=()->System.out.println("Dog eats meat");
		i.eat();
		
	}

}
