package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// To find frequency of each element in an array or a list?

public class Test7 {

	public static void main(String[] args) {
		
	   List<String> l = Arrays.asList("Nani","Virat","Pallavi","Vamsi","Nani","Virat","Sai","Pallavi");
	   
	   
	   /*Map<String,Integer>m=new HashMap<>();
	   
	   for(String name:l) {
		   if(m.get(name)==null) {
			   m.put(name,1);
		   }
		   else {
			   m.put(name, m.get(name)+1);
		   }
	   }
	   Set<Entry<String, Integer>> mf=m.entrySet();
		for(Entry<String, Integer> entry:mf) {
			String key=entry.getKey();
			Integer values=entry.getValue();
//			System.out.println(key+">>>>>>>"+values);
			System.out.println(entry);
	   
		}*/
	   
	   Map<String,Long> m=l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	   
	   System.out.println(m);

	}

}
