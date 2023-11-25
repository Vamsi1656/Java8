package Threading;

public class Test implements Runnable {
	
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Child Thread");
		}
		
	}


	public static void main(String[] args) {
			Runnable r=new Test();
			
			Thread t=new Thread(r);
			
			t.start();
			
			for(int i=0;i<=10;i++) {
				System.out.println("Main Thread");
			}

	}

	
}
