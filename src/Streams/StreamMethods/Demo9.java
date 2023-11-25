package Streams.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo9 {

	public static void main(String[] args) {
		
		
		List<Integer> l=Arrays.asList(1,3,5,7,9);
		
		List<Integer> l1=Arrays.asList(0,2,4,6,8);
		
		
		Stream<Integer> stream1=l.stream();
		Stream<Integer> stream2=l1.stream();
		
//		List<Integer> fl=Stream.concat(stream1, stream2).collect(Collectors.toList());
//		
//		for(Integer value:fl) {
//			
//			System.out.println(value);
//		}
		
		List<Integer> f2=Stream.concat(stream1, stream2).sorted().collect(Collectors.toList());
		
            for(Integer values:f2) {
		
			System.out.println(values);
		}

	}

}
