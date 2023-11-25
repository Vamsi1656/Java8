package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Given a list of strings, find out those strings which start with a number?

public class Test15 {

	public static void main(String[] args) {
		
//		List<String> l=Arrays.asList("One","2Two","Three","4Four","Five","6Six");
//		
//		l.stream().filter(str->Character.isDigit(str.charAt(0))).forEach(System.out::println);
		
		
		List<String> al=Arrays.asList("Nani","Virat","Pallavi","Vamsi","Sai");
		
		Stream<String> v=al.stream().filter(s->s.startsWith("V"));
		System.out.println(v);
		
		long b=al.stream().filter(s->s.startsWith("V")).count();
		System.out.println(b);
		
		boolean l=al.stream().anyMatch((a)->a.startsWith("V"));
		System.out.println(l);

	}

}
