package Streams.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {

	public static void main(String[] args) {
		
		
		List<String> l=Arrays.asList("A","B","C","1","2","3");
		
		Optional<String> l1=l.stream().reduce((value,combinedvalue)->{return combinedvalue+value;});
		
		System.out.println(l1.get());

	}

}
