package Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//  sort the given list of decimals in reverse order

public class Test8 {

	public static void main(String[] args) {
		
		List<Double> l=Arrays.asList(12.3,34.6,90.5,86.7,45.3,65.8,55.5,74.9);
		
		l.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.println(n));
		
	}

}
