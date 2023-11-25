package CollectionsUsingLambdaExpr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	String name;
	int id;
	double sal;
	
	Employee(String name,int id,double sal){
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	public String toString() {
		return id+","+name+","+sal;
	}
}

public class Test  {

	public static void main(String[] args) {
		
//		Employee e=new Employee("Nani",101,45000.00);
//		System.out.println(e);
		
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("Nani",1623782,45000.00));
		al.add(new Employee("Virat",1829371,45000.00));
		al.add(new Employee("Pallavi",2364362,45000.00));
		al.add(new Employee("Vamsi",1290378,45000.00));
		System.out.println(al);
		
		Collections.sort(al,(i1,i2)->(i1.id<i2.id)?-1:(i1.id>i2.id)?+1:0);
		System.out.println(al);
		Collections.sort(al,(i1,i2)->(i1.name.compareTo(i2.name)));
		System.out.println(al);
	}

}
