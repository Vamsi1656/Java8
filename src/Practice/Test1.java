package Practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// First 10 odd numbers

public class Test1 {

	public static void main(String[] args) {
		
//		for(int i=0;i<=19;i++) {
//			if(i%2!=0) {
//				System.out.println(i);
//			}
//		}
		
//		Stream.iterate(new int[] {1,3}, f->new int[] {f[1],f[1]+2}).limit(10).map(f->f[0]).forEach(n->System.out.println(n+" "));
		
		List<Integer> l=Stream.iterate(new int[] {1,3}, f->new int[] {f[1],f[1]+2}).limit(10).map(f->f[0]).collect(Collectors.toList());
		System.out.println(l);
	}

}
