package Practice;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//Find sum of all digits of a number ?

public class Test10 {

	public static void main(String[] args) {


		/*int n,digit,sum=0;
		
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		n = sc.nextInt(); 
		
		while(n>0) {
			
			digit=n%10;
			
			sum=sum+digit;
			
			n=n/10;
		}
		
		System.out.println(sum);*/
		
		
		int i=123;
		
		Integer sum=Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		
		System.out.println(sum);

	}

}
