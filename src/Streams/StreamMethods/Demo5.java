package Streams.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo5 {

	public static void main(String[] args) {
		
		List<String> l=Arrays.asList("Nani","Virat","Pallavi","Vamsi","Nani","Virat","Sai");
		
		 l.stream().distinct().forEach(value->System.out.println(value));
		 
		long c= l.stream().count();
		System.out.println(c);
		
		l.stream().limit(5).forEach(System.out::println);
		
		
		Optional<String> min=l.stream().min((val1,val2)->{return val1.compareTo(val2);});
		System.out.println(min.get());
		
		
		Optional<String> max=l.stream().min((val1,val2)->{return val1.compareTo(val2);});
		System.out.println(max.get());
		
		
		Optional<String> reduced=l.stream().reduce((value,combinedvalue)->{return combinedvalue+value;});
		System.out.println(reduced.get());
		 
	}

}
