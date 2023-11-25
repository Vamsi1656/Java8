package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	
	String name;
	Integer salary;
	
	Employee(String name,Integer salary){
		this.name=name;
		this.salary=salary;
	}
	
	public String toString() {
		return name+" "+salary;
	}
}

public class Test6 {

	public static void main(String[] args) {
		
		List<Employee> n=new ArrayList<Employee>();
		
		n.add(new Employee("Nani",55000));
		n.add(new Employee("Virat",35000));
		n.add(new Employee("Pallavi",85000));
		n.add(new Employee("Vamsi",63000));
		n.add(new Employee("Sai",25000));
		n.add(new Employee("Siva",95000));
		
		System.out.println(n);
		
         List<Employee> l=new ArrayList<>();
         
         l=n.stream().sorted((a,b) ->a.salary.compareTo(b.salary)).collect(Collectors.toList());
         System.out.println(l);
         l=n.stream().sorted((a,b) ->a.salary.compareTo(b.salary)).limit(3).skip(2).collect(Collectors.toList());
         System.out.println(l);
		

	}

}
