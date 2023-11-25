package FunctionFI;

import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	
	String name;
	
	int marks;
	
	Student(String name,int marks){
		this.name=name;
		this.marks=marks;
	}
}

public class F2 {

	public static void main(String[] args) {
		
		Function<Student,String> f=s->{
			
			int marks =s.marks;
			String grade="";
			if(marks>90) grade ="OutStanding";
			else if(marks>75) grade ="Excellent";
			else if(marks>50) grade ="Good";
			else if(marks>35) grade ="Better";
			else if(marks<35) grade ="Fail";
			return grade;
		};
		
		Predicate<Student> p=s->s.marks>=65;
		
		Student[] s= {
				new Student("Nani",94),
				new Student("Virat",100),
				new Student("Pallavi",86),
				new Student("Vamsi",74),
				new Student("Siva",65),
				new Student("Jaggu",57),
				new Student("Surya",45),
				new Student("DSP",36),
				new Student("Loki",22),
		};
		
		for(Student s1:s) {
			
			if(p.test(s1)) {
			System.out.println("Student name:" + s1.name);
			System.out.println("Student Marks:" + s1.marks);
			System.out.println("Student Grade:" + f.apply(s1));
			System.out.println();
			}
		}
		

	}

}
