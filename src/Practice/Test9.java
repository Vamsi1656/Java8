package Practice;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// to check if two strings are anagrams or not? 

public class Test9 {
	
	/*static boolean m1(char[] str1,char[] str2) {
		
		int n1=str1.length;
		int n2=str2.length;
		
		if(n1!=n2) 
			return false;
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for(int i=0;i<n1;i++) {
			if(str1[i]!=str2[i]) {
				return false; 
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		
		char str1[]= {'l','i','s','t','e','n'};
		char str2[]= {'s','i','l','e','n','t'};
		
		
		if(m1(str1,str2)) {
			System.out.println("The given two strings are anagram of each other");
		}
		else {
			System.out.println("The given two strings are not anagram of each other");
		}
	

	}*/
	
	
	
	public static void main(String[] args) {
		
		String s1="Listen";
		String s2="Silent";
		
		s1=Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		s2=Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		
		if(s1.equals(s2)) {
			System.out.println("Given strings are anagrams");
		}
		else {
			System.out.println("Given strings are not anagrams");
		}
	}
	
}
