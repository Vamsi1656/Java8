package DefaultMethods;

interface Interf1{
	default void m1() {
		System.out.println("Interf1 m1 method");
	}
}

interface Interf2{
	default void m1() {
		System.out.println("Inter2 m1 method");
	}
}

class Demo implements Interf1,Interf2{
	
	public void m1() {
//		System.out.println("Class Demo m1 method");
		
		Interf1.super.m1();
		Interf2.super.m1();
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		
		Interf1 d=new Demo();
		d.m1();
		

	}

}
