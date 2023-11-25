package BiConsumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee{
	String name;
	double salary;
	
	Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
}

public class BiC1 {

	public static void main(String[] args) {
		
		ArrayList<Employee> al=new ArrayList<>();
		Emp(al);
		BiConsumer<Employee,Double> c=(e,d)->e.salary=e.salary+d;
		
		for(Employee e:al) {
			c.accept(e, 1000.00);
		}
		for(Employee e:al) {
			System.out.println("Emp Name:"+e.name);
			System.out.println("Emp Salary:"+e.salary);
			System.out.println();
		}
	}
		public static void Emp(ArrayList<Employee> al) 
		{
		al.add(new Employee("Nani",1000));
		al.add(new Employee("Virat",2000));
		al.add(new Employee("Pallavi",3000));
		al.add(new Employee("Vamsi",4000));
		}
}
