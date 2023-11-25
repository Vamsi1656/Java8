package CollectionsUsingLambdaExpr;

import java.util.Collections;
import java.util.LinkedList;

class Employee1{
	int id;
	String name;
	int sal;
	
	Employee1(int id,String name,int sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
		
	}
	public String toString() {
		return id+","+name+","+sal;
	}
}

public class Test1 {
	
	

	public static void main(String[] args) {
		LinkedList<Employee1> ll=new LinkedList<Employee1>();
		ll.add(new Employee1(101,"Nani",88000));
		ll.add(new Employee1(102,"Virat",76500));
		ll.add(new Employee1(103,"Pallavi",99000));
		ll.add(new Employee1(104,"Vamsi",45000));
		ll.add(new Employee1(105,"Sai",55000));
		System.out.println(ll);
		Collections.sort(ll,(i1,i2)->(i1.sal<i2.sal)?-1:(i1.sal>i2.sal)?+1:0);
		System.out.println(ll);
		Collections.sort(ll,(i1,i2)->(i1.sal>i2.sal)?-1:(i1.sal<i2.sal)?+1:0);
		System.out.println(ll);

	}

}
