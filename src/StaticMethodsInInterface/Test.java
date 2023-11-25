package StaticMethodsInInterface;


interface Demo{
	public static void m1() {
		System.out.println("Interface m1 method");
	}
}
public class Test {   // It is normal class so we have to call by using only interface name.

	public static void main(String[] args) {
		
		Demo.m1();
//		m1();
//		Test.m1();
//		Test t=new Test();
//		t.m1();
    }

}
