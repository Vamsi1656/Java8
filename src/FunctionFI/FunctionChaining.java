package FunctionFI;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
		Function<Integer,Integer> f1=i->4*i;
		Function<Integer,Integer> f2=i->i*i*i;
		Function<Integer,Integer> f3=i->i*i;
		System.out.println(f1.andThen(f2).andThen(f3).apply(3));
		System.out.println(f1.compose(f2).compose(f3).apply(3));

	}

}