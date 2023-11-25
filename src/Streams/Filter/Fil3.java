package Streams.Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fil3 {

	public static void main(String[] args) {
		
		List<String> l=Arrays.asList("Nani","Virat","Pallavi","Vamsi","Sai","Siva","Jaggu","Vasu Anna","Naveen Anna");
		
		List<String> l1=new ArrayList<>();
		
		l1=l.stream().filter(s->s.length()>6 && s.length()<9).collect(Collectors.toList());
		
		System.out.println(l1);

	}

}
