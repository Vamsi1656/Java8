package Streams.StreamMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// sorted()

public class Demo6 {

	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(3,5,8,1,2,6,4,7,9);
		
//		List<Integer> al=l.stream().sorted().collect(Collectors.toList());
//		
//		System.out.println(al);
//		
////		l.stream().sorted().forEach(value->System.out.println(value));
//		
//         List<Integer> ll=l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		
//		 System.out.println(ll);
		 
		 
		 
		 // For Strings:
		 
		 List<String> List1=Arrays.asList("Nani","Virat","Pallavi","Sai","Vamsi");
		 
		 List<String> al1=List1.stream().sorted().collect(Collectors.toList());
		 
		 System.out.println(al1);
		 
        List<String> al2=List1.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).collect(Collectors.toList());
		 
		 System.out.println(al2);
		 
	}

}
