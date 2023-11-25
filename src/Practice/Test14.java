package Practice;

import java.util.Arrays;
import java.util.List;

//How do you get last element of an array?

public class Test14 {

	public static void main(String[] args) {
		
		String a[]={"Nani","Virat","Pallavi","Vamsi","Sai"};	
		
	    int length=a.length;
	   
	     System.out.println("First element:"+ a[0]);
	     System.out.println("Last element:"+ a[length-1]);
	
		
		/*List<String> l=Arrays.asList("Nani","Virat","Pallavi","Vamsi","Sai");
		
		String al=l.stream().skip(l.size()-1).findFirst().get();
		
		System.out.println(al);*/

	}

}
