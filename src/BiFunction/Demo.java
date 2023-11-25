package BiFunction;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee{
	int id;
	String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
		
	}
}

public class Demo {

	public static void main(String[] args) {
		
		ArrayList<Employee> al=new ArrayList();
		
		BiFunction<Integer,String,Employee> f=(id,name)->new Employee(id,name);
		
		al.add(f.apply(101, "Rahul"));
		al.add(f.apply(102, "Priyanka"));
		al.add(f.apply(103, "Sonia"));
		al.add(f.apply(104, "Modi"));
		al.add(f.apply(105, "Amitsha"));
		al.add(f.apply(106, "Loki"));
		
		for(Employee ename:al) {
			System.out.println("Emp Id:"+ename.id);
			System.out.println("Emp Name:"+ename.name);
			
			System.out.println();
		}
		
	}

}
