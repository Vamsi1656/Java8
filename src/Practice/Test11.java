package Practice;



import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Find second largest number in an integer array?
     
    public class Test11 {
    	
    	/*public static int m1(Integer[] a,int total) {
    		
    		List<Integer> l=Arrays.asList(a);
    		
    		Collections.sort(l);
    		
    		int element=l.get(total-2);
    		
    		return element;
    		
//    		Arrays.sort(a);
//    		
//    		return a[total-2];
    		
    	}
	
	public static void main(String[] args) {
		
		Integer a[]= {10,34,65,46,77,89,67};
		
		System.out.println(m1(a,7));
		
	}*/
    		
    	
    		public static void main(String[] args) {
    			
    		List<Integer> l=Arrays.asList(10,20,56,78,95,45,67,87);
    		
    		List<Integer> al=l.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).collect(Collectors.toList());
    		
    		System.out.println(al);
    		}
    		
    
}

