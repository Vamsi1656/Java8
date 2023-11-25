package FunctionFI;

import java.util.function.Function;

public class F1 {

	public static void main(String[] args) {
		Function<String,Integer> f=s->s.length();
		System.out.println(f.apply("Pallavi"));

	}

}
