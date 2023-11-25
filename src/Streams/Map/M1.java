package Streams.Map
;

import java.util.*;
import java.util.stream.Collectors;

public class M1 {

	public static void main(String[] args) {
//		ArrayList<Integer> al=new ArrayList<>();
//		al.add(0);
//		al.add(10);
//		al.add(20);
//		al.add(30);
//		al.add(5);
//		al.add(15);
//		al.add(25);
		
		List<Integer> al=Arrays.asList(0,10,20,30,5,15,25);
		
		System.out.println(al);
		
//		List<Integer> l=new ArrayList<>();
//		for(Integer I1:al) {
//			l.add( I1*2);
//		}
//		System.out.println(l);
		
		List<Integer> l=al.stream().map(I->I*2).collect(Collectors.toList());
		System.out.println(l);
	}

}
