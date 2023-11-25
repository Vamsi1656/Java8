package Practice;

// Given an integer array, find sum and average of all elements?

public class Test13 {
	
	static int arr[]= {1,2,3,4,5};
	
	public static int sum() {
		int sum=0;
		int i;
		
		for(i=0;i<arr.length;i++) {
			sum+=arr[i];
			
			}
		return sum;
	}
	
	public static double arr1[]= {10,20,30,40,15,13,17};
	
	public static double avg(int i) {
		
		int sum=0;
		for(i=0;i<arr.length;i++) {
			sum+=arr1[i];
		}
		return 0;
		
	}

	public static void main(String[] args) {
		
		System.out.println(sum());
		System.out.println(avg(sum()));
		

	}

}
