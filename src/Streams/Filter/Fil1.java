package Streams.Filter;

import java.util.*;
import java.util.stream.Collectors;

public class Fil1 {

	public static void main(String[] args) {
//		ArrayList<Integer> al=new ArrayList<>();
//		al.add(0);
//		al.add(10);
//		al.add(20);
//		al.add(30);
//		al.add(5);
//		al.add(15);
//		al.add(20);
		List<Integer> al=Arrays.asList(0,10,20,30,5,15,25);
		
		System.out.println(al);
		
		
//		List<Integer> l1=new ArrayList<>();
//		for(Integer I1:al) {
//			if(I1%2==0) {
//				l1.add(I1);
//			}
//		}
//		System.out.println(l1);
//		
		
//		List<Integer> l1=al.stream().filter(I->I%2==0).collect(Collectors.toList());
//		System.out.println(l1);

		al.stream().filter(I->I%2==0).forEach(I->System.out.println(I));
	}

}
