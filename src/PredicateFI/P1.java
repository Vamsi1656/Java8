package PredicateFI;

import java.util.function.Predicate;

public class P1 {

	public static void main(String[] args) {
		Predicate<Integer> p = I->I%2==0;
		System.out.println(p.test(10));

	}

}
