package StaticMethodsInInterface;


interface Interf{
	
	public static void m1() {
		System.out.println("TOday is Monday");
	}
}

public class Test1 implements Interf {

	public static void main(String[] args) {
					
		Interf.m1();
  
	}

}
