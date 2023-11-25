package Streams.ParallelStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	
	int id;
	String name;
	int marks;
	Student(int id,String name,int marks){
		
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString() {
		return id+" "+name+" "+marks;
	}
}

public class Demo {

	public static void main(String[] args) {
		
		List<Student> l=new ArrayList<Student>();
		
		l.add(new Student(101,"Nani",96));
		l.add(new Student(102,"Virat",100));
		l.add(new Student(103,"Pallavi",86));
		l.add(new Student(104,"Vamsi",76));
		l.add(new Student(105,"Sai",80));
		l.add(new Student(106,"Siva",65));
		l.add(new Student(107,"Jaggu",56));
		
		List<Student> al=l.stream().filter(n->n.marks>80).collect(Collectors.toList());
		
		System.out.println(al);
		
		
		
        List<Student> al1=l.parallelStream().filter(n->n.marks>80).limit(2).collect(Collectors.toList());
		
		System.out.println(al1);
		
		
		

	}

}
