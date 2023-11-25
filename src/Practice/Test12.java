package Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Given a list of strings, sort them according to increasing order of their length?


public class Test12 {

	public static void main(String[] args) {
		List<String> l=Arrays.asList("Nani","Virat","Pallavi","Vamsi","Sai","Siva");
		
		l.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);		
		
	}

}
