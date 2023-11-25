package PredicateFI;

import java.util.function.Predicate;

public class P2 {

	public static void main(String[] args) {
		Predicate<String> p1=S->(S.startsWith("N"));
          System.out.println(p1.test("Nani"));
          System.out.println(p1.test("Pallavi"));

	}

}
