package PredicateFI;

import java.util.function.Predicate;

public class P4 {

	public static void main(String[] args) {
		Predicate<String> p3=S->S.length()>5;
		System.out.println(p3.test("Vamsi k"));
		System.out.println(p3.test("Nani"));

	}

}
