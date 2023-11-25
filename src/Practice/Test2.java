package Practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Fibonacci series

public class Test2 {

	public static void main(String[] args) {


//		Stream.iterate(new int[] {0,1}, f->new int[] {f[1],f[0]+f[1]}).limit(10).map(f->f[0]).forEach(n->System.out.println(n));
		
		
		List<Integer> l=Stream.iterate(new int[] {0,1}, f->new int[] {f[1],f[0]+f[1]}).limit(10).map(f->f[0]).collect(Collectors.toList());
		
		System.out.println(l);																			

	}
																												
}
