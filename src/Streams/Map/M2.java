package Streams.Map;

import java.util.*;
import java.util.stream.Collectors;

public class M2 {

	public static void main(String[] args) {
		
		
        /*List<String> l=Arrays.asList("nani","virat","pallavi","vamsi","sai","siva","jaggu","vasu Anna","naveen Anna");
		
		List<String> al=new ArrayList<>();
		
		for(String l1:l) {
			al.add(l1.toUpperCase());
			
		}
		System.out.println(al);*/
		
        
		List<String> l=Arrays.asList("nani","virat","pallavi","vamsi","sai","siva","jaggu","vasu Anna","naveen Anna");
		
		List<String> al=new ArrayList<>();
		
		al=l.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(al);
		
		l.stream().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		l.stream().map(s->s.toUpperCase()).forEach(System.out::println);
		
		
	}

}
