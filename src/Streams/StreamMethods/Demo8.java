package Streams.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo8 {

	public static void main(String[] args) {
	
		
		List<String> l=Arrays.asList("Lion","Tiger","Fox");
		
		List<String> l1=Arrays.asList("Peacock","Parraot","Sparrow");
		
		
		Stream<String> stream1=l.stream();
		
		Stream<String> stream2=l1.stream();
		
		List<String> fl=Stream.concat(stream1, stream2).collect(Collectors.toList());
		
		for(String name:fl) {
			
			System.out.println(name);
		}
	}

}
