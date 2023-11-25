package PredicateFI;

import java.util.function.Predicate;

public class P5 {

	public static void main(String[] args) {
		String[] enames= {"Nani","Virat","Pallavi","Vamsi","Sai","Surya","DSP"};
//		Predicate<String> p=s1->s1.length()%2!=0;
//		Predicate<String> p=s1->s1.length()%2==0;
		Predicate<String> p=s1->s1.length()>3;
		for(String ename:enames) {
			if(p.test(ename)) {
				System.out.println(ename);
			}
		}
 
	}

}