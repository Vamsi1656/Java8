package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {
		
		
		List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		
		List<Integer> l1=l.stream().filter(I->I%2==0).collect(Collectors.toList());
		List<Integer> l2=l.stream().filter(I->I%2!=0).collect(Collectors.toList());
		
		System.out.println("Even Numbers"+" : "+l1);
		System.out.println("Odd Numbers"+" : "+l2);

	}

}
