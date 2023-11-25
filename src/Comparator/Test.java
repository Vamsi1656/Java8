package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>{
	
	
	public int compare(Integer I1,Integer I2) {
	
		return (I1<I2)?-1:(I1>I2)?+1:0;
		
//	   if(I1<I2) {
//			return -1;
//		}
//		else if(I1>I2) {
//			return +1;
//		}
//		else {
//			return 0;
//		}
	}
}

public class Test {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(55);
		al.add(72);
		al.add(89);
		al.add(45);
		al.add(65);
		al.add(7);
		al.add(34);
		System.out.println(al);
		Collections.sort(al,new MyComparator());
		System.out.println(al);

	}

}
