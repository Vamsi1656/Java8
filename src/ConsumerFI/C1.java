package ConsumerFI;

import java.util.function.Consumer;
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

public class C1 {

	public static void main(String[] args) {
		
			Function<Student,String> f=s->{
				int marks=s.marks;
				String grade="";
				if(marks>90) grade="Outstanding";
				else if(marks>70) grade="Excellent";
				else if(marks>55) grade="Good";
				else if(marks>35) grade="Better";
				else if(marks<35) grade="Failed";
				return grade;
			};
			
			Predicate<Student> p=s1->s1.marks>60;
			
			Consumer<Student> c=s1->{
				System.out.println("Student name:"+ s1.name);
				System.out.println("Student marks:"+ s1.marks);
				System.out.println("Student grade:"+ f.apply(s1));
				System.out.println();
				
			};
			
			Student[] s={
				
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
			   c.accept(s1);
			
				}
			
			}
		

	}

}
