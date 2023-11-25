package Streams;

import java.util.*;
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
		return id+":"+name+":"+marks;
	}
}

public class FM3 {

	public static void main(String[] args) {
		
		List<Student> stdList1=new ArrayList<>();
		stdList1.add(new Student(101,"Nani",100));
		stdList1.add(new Student(102,"Virat",100));
		stdList1.add(new Student(103,"Pallavi",100));
		
		List<Student> stdList2=new ArrayList<>();
		stdList2.add(new Student(104,"Vamsi",90));
		stdList2.add(new Student(105,"Sai",95));
		stdList2.add(new Student(106,"DSP",80));
		
		List<List<Student>> stdList=Arrays.asList(stdList1,stdList2);
		
//		for(List<Student> s:stdList) {
//			
//			for(Student name:s) {
//				System.out.println(name.id+":"+name.name+":"+name.marks);
//			}
//		}
		
		List<Student> FinalList=stdList.stream().flatMap(s->s.stream()).collect(Collectors.toList());
		System.out.println(FinalList);
	}

}
