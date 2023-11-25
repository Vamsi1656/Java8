package PredicateFI;

import java.util.function.*;

public class Primitive {

	public static void main(String[] args) {
		int[] x= {0,10,15,20,25,30,35,40};
//		Predicate<Integer> p=i->i%2==0;
		IntPredicate p=i->i%2==0;
		for(int x1:x) {
			if(p.test(x1)) {
				System.out.println(x1);
			}
		}
	}

}
