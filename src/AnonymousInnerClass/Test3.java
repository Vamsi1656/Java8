package AnonymousInnerClass;

interface Interf3{
	
	public void m1();
	
	public void m2();
}

public class Test3 implements Interf3 {

	public static void main(String[] args) {
		
		Runnable r=new Runnable()
		{
			
			public void run() {
				
			   System.out.println("Hello");

			}
			
			
		};
		
		Test3 i=new Test3();
	     i.m1();
	     i.m2();
	     
          
	}
	 

	@Override
	public void m1() {
		System.out.println("Hii");
		
	}

	@Override
	public void m2() {
		System.out.println("Good Morning");
		
	}

}
