package Practice;

import java.util.stream.IntStream;

// Palindrome program using Java 8 streams

public class Test16 {

	public static void main(String[] args) {
		/*String str="Rotator",reverseStr="";
		
		str=str.toLowerCase();
		
		int strlength=str.length();
		
		for(int i=(str.length()-1);i>=0;--i) {
			
			reverseStr=reverseStr+str.charAt(i);
			
		}
		  if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		    }*/
		
		String str="ROTATOR";
		
		boolean s=IntStream.range(0, str.length()/2).noneMatch(i->str.charAt(i)!=str.charAt(str.length()-i-1));
		  if (s)
	        {
	            System.out.println(str+" is a palindrome");
	        }
	        else
	        {
	            System.out.println(str+" is not a palindrome");
	        }
		
		/*int r,sum=0,temp;
		
		int n=343;
		
		temp=n;
		
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
		if(temp==sum) {
			System.out.println("Given number is palindrome");
		}
		else
			System.out.println("Given number is not palindrome");*/
		
	}

}
