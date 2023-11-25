package Streams.StreamMethods;


/* Non-Terminal Methods

1.distinct();
2.Limit();

Terminal Methods

1.count()
2.foreach()*/

import java.util.*;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		
		
		List<String> l=Arrays.asList("Nani","Virat","Pallavi","Nani","Virat","Pallavi","Nani","Virat","Pallavi");
		
		
		// Distinct : Remove the duplicate values
		
		 List<String> distinctvalues=l.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctvalues);
		
		/*l.stream().distinct().forEach(value->System.out.println(value));
		
		
		l.stream().distinct().forEach(System.out::println);*/
		
		// Count:
		
		long values=l.stream().distinct().count();
		System.out.println(values);
		
		// Limit:
		
		List<String> limitedvalues=l.stream().limit(5).collect(Collectors.toList());
		System.out.println("LimitedValues"+limitedvalues);
		
		l.stream().limit(9).forEach(value->System.out.println(value));
		

	}

}
