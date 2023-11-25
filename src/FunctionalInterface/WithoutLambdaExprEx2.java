package FunctionalInterface;

interface Name{
	
	public void get_length(String s);
}

public class WithoutLambdaExprEx2 implements Name {
	
	public void get_length(String s) {
		
		System.out.println(s.length());
	}

	public static void main(String[] args) {
			Name n=new WithoutLambdaExprEx2();
			n.get_length("Nani");
			n.get_length("Virat");
			n.get_length("Pallavi");

	}

}
