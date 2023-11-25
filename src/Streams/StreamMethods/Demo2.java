package Streams.StreamMethods;

import java.util.*;

public class Demo2 {

	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//count:
		
		long countvalues=l.stream().filter(num->num%2==0).count();
		System.out.println(countvalues);
		
		//min():
		
		Optional<Integer> minvalue=l.stream().min((val1,val2)->{return val1.compareTo(val2);});
		System.out.println(minvalue.get());
		
		
		//max();
		
		Optional<Integer> maxvalue=l.stream().max((val1,val2)->{return val1.compareTo(val2);});
		System.out.println(maxvalue.get());
	}

}
