package Streams.Filter;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fil2 {

	public static void main(String[] args) {
		
		List<String> l=Arrays.asList("Nani","Virat","Pallavi","Vamsi","Sai","Siva","Jaggu","Vasu Anna","Naveen Anna");
		
		System.out.println(l);
		
//		List<String> l1= new ArrayList();
		
//		for(String ename:l) {
//			
//			if(ename.startsWith("V"))
//			l1.add(ename);
//		}
//		System.out.println(l1);
																																									
//		List<String> l1=l.stream().filter(s->s.startsWith("V")).collect(Collectors.toList());
//		System.out.println(l1);
		
		
//		l.stream().filter(s->s.startsWith("V")).forEach(s->System.out.println(s));
		
		
		l.stream().filter(s->s.startsWith("V")).forEach(System.out::println);
		
				
	}
}
