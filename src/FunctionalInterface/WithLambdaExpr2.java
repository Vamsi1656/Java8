package FunctionalInterface;

interface Name1{
	public void get_length(String s);
}

public class WithLambdaExpr2 {

	public static void main(String[] args) {
		Name1 n=s->System.out.println(s.length());
		n.get_length("Nani");
		n.get_length("Pallavi");
		n.get_length("Virat");
		
	


	}

}
