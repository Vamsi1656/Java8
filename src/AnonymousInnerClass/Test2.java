package AnonymousInnerClass;

interface Interf{
	public void animal();
}

public class Test2 {

	public static void main(String[] args) {
		Interf i=new Interf() {
			public void animal() {
				System.out.println("Dog is an animal");
			}
		};
		i.animal();

	}

}
