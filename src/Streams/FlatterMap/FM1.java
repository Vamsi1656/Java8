package Streams.FlatterMap;

import java.util.*;
import java.util.stream.Collectors;

public class FM1 {

	public static void main(String[] args) {
		
		
		/*List<Integer> l =Arrays.asList(1,2,3,4,5);
		
		List<Integer> al=new ArrayList<>();
		
		al=l.stream().map(I->I+10).collect(Collectors.toList());
		System.out.println(al);*/
		
		List<Integer> l1=Arrays.asList(1,2);
		List<Integer> l2=Arrays.asList(3,4);
		List<Integer> l3=Arrays.asList(5,6);
		List<Integer> l4=Arrays.asList(7,8);
		
		List<List<Integer>> finalList=Arrays.asList(l1,l2,l3,l4);
		
		List<Integer>finalresult=finalList.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
		System.out.println(finalresult);
	}	

}
