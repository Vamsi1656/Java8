package AnonymousInnerClass;

public abstract class Test1 {
	
	public abstract void m1();

	public static void main(String[] args) {
       Test1 t=new Test1() {
    	   public void m1() {
    		  System.out.println("Hello,GOod Evening");
    	   }
    	   
       }; 
       t.m1();
       
	}

}
