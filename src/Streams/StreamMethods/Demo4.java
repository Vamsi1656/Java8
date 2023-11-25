package Streams.StreamMethods;

import java.util.Arrays;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		
		List<String> l=Arrays.asList("A","B","C","1","2","3");
		
		Object arr[]=l.stream().toArray();
		
//		System.out.println(arr.length);`
		
		for(String v:l) {
			System.out.println(v);
		}
	}

}
