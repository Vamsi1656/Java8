package Streams.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	
	int id;
	String name;
	double salary;
	
	Employee(int id,String name,double salary){
		
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString() {
		return id+","+name+","+salary;
	}
}

public class M4 {

	public static void main(String[] args) {
		
       List<Employee> p=new ArrayList<Employee>();
		
		p.add(new Employee(101,"Nani",45000));
		p.add(new Employee(102,"Virat",85000));
		p.add(new Employee(103,"Pallavi",100000));
		p.add(new Employee(104,"Vamsi",55000));
		p.add(new Employee(105,"Sai",65000));
		p.add(new Employee(106,"Siva",70000));
		p.add(new Employee(107,"Jaggu",35000));
		p.add(new Employee(108,"DSP",12000));
		
		System.out.println(p);
		
		List<String> l=new ArrayList<>();
		
		l=p.stream().map(I->I.id+":"+I.name+":"+I.salary*2).collect(Collectors.toList());
		System.out.println(l);

	}

}
