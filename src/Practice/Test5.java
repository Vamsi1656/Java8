package Practice;

// Frequency of Strings

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.Set;
import java.util.stream.Collectors;

public class Test5 {

	public static void main(String[] args) {
		
		String str="VamsiKrishna";
		str=str.toUpperCase();
		
		/* Map<Character,Integer> map= new HashMap<>();
		
		for(char ch:str.toCharArray()) {
			if(map.get(ch)==null) {
				map.put(ch, 1);
			}
			else {
				map.put(ch, map.get(ch)+1);
			}
		}
		
		Set<Entry<Character, Integer>> mf=map.entrySet();
		for(Entry<Character, Integer> entry:mf) {
			Character key=entry.getKey();
			Integer values=entry.getValue();
//			System.out.println(key+">>>>>>>"+values);
			System.out.println(entry);
		}*/
		
			Map<Character, Long> map=  str.chars()
					                  .mapToObj(c->(char) c)
					                  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			
			System.out.println(map);
		
	}

}
