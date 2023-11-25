package Streams.StreamMethods;

import java.util.Arrays;
import java.util.List;

public class Demo7 {

	public static void main(String[] args) {
		
	   List<String> l=Arrays.asList("Nani","Virat","Pallavi","Sai","Vamsi");
	   
	  boolean s= l.stream().anyMatch(value->{return value.startsWith("V");});
	  
	  System.out.println(s);
	  
     
	  boolean s1= l.stream().allMatch(value->{return value.startsWith("V");});
	  
	  System.out.println(s1);
	  
	  
     
	  boolean s2= l.stream().noneMatch(value->{return value.startsWith("V");});
	  
	  System.out.println(s2);

	}

}
