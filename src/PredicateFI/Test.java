package PredicateFI;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	
	int id;
	String name;
	double salary;
	
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}

public class Test {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<>();
			al.add(new Employee(101,"Nani",45000));
			al.add(new Employee(102,"Virat",35000));
			al.add(new Employee(103,"Pallavi",65000));
			al.add(new Employee(104,"Vamsi",20000));
			al.add(new Employee(105,"Sai",55000));
			al.add(new Employee(106,"Surya",80000));
			al.add(new Employee(107,"DSP",7000));
			
			Predicate<Employee> p=e->e.salary>30000;
			
			for(Employee p1:al) {
				if(p.test(p1)) {
					System.out.println(p1.id+":"+p1.name+":"+p1.salary);
				}
			}

	}

}
