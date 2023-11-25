package Streams.Map;

import java.util.*;
import java.util.stream.Collectors;

public class M3 {

	public static void main(String[] args) {
		
		
		List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
//		for(Integer num:l) {
//			
//			System.out.println("3*"+num+"="+num*3);
//		}
		
		List<String> al=new ArrayList<>();
		
		al=l.stream().map(num->"3*"+num+"="+num*3).collect(Collectors.toList());
		System.out.println(al);
		
		l.stream().map(num->"3*"+num+"="+num*3).forEach(s->System.out.println(s));
		
//		l.stream().map(num->"3*"+num+"="+num*3).forEach(System.out::println);
	}

}
