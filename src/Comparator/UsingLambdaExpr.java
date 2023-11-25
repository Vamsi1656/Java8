package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UsingLambdaExpr {

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
		Comparator<Integer> c=(I1,I2)->(I1<I2)?-1:(I1>I2)?+1:0;
		Collections.sort(al,c);
		System.out.println(al);
		

	}

}
