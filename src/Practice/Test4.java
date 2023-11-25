package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {
		
		
		List<String> l=Arrays.asList("Nani","Virat","Pallavi","Vamsi","Nani","Sai","Virat","Pallavi");
		
		List<String> l1=l.stream().distinct().collect(Collectors.toList());
		
		System.out.println(l1);

	}

}
 