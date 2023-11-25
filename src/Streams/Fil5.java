package Streams;

import java.util.*;
import java.util.stream.Collectors;

class Employees{
	
	int id;
	String name;
	String gender;
	double salary;
	
	Employees(int id,String name,String gender,double salary){
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.salary=salary;
	}
	
	public String toString() {
		return id+","+name+","+gender+","+salary;
	}
}

public class Fil5 {

	public static void main(String[] args) {
              
		
		List<Employees> l=new ArrayList<>();
		
		l.add(new Employees(101,"Nani","Male",45000));
		l.add(new Employees(102,"Virat","Male",55000));
		l.add(new Employees(103,"Pallavi","Female",55000));
		l.add(new Employees(104,"Vamsi","Male",75000));
		l.add(new Employees(105,"Sai","Female",85000));
		l.add(new Employees(106,"DSP","Male",95000));
		l.add(new Employees(107,"Surya","Male",35000));
		l.add(new Employees(108,"Sindhu","Female",25000));
		l.add(new Employees(109,"Sailu","Female",15000));
		l.add(new Employees(110,"Siva","Male",5000));
		
		System.out.println(l);
		
		List<Employees> al=new ArrayList<>();
		
		al=l.stream().filter(s->s.gender.equals("Male")).collect(Collectors.toList());				
				

		System.out.println(al);

	}

}
