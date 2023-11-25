package DefaultMethods;


interface Wish{
	
	public void wish();
	public void Hii();
	
	default void Hello() {
		System.out.println("Interface Default method");
	}
}

public class Test1 implements Wish {

	public void wish() {
		System.out.println("Test1 class wish Method");
	}
	public void Hii() {
		System.out.println("Test1 class Hii Method");
	}
		
	public void Hello() {
		System.out.println("Test1 Hello Method");
	}
	

}

class Test2 implements Wish{
	public void wish() {
		System.out.println("Test2 class wish Method");
	}
	public void Hii() {
		System.out.println("Test2 class wish Method");
	}
		
	public void Hello() {
		System.out.println("Test2 Hello Method");
	}
}

class Test{
	public static void main(String[] args) {
		Wish t=new Test1();
		t.wish();
		t.Hii();
		t.Hello();
		
		Wish t1=new Test2();
		t1.wish();
		t1.Hii();
		t1.Hello();
	}
}
