package PredicateFI;

import java.util.function.Predicate;

public class P3 {

	public static void main(String[] args) {
		Predicate<Integer> p2=I->(I>18);
		System.out.println("Age greater than 18::"+p2.test(11));

	}

}
