package ConsumerFI;

import java.util.function.Consumer;

class Movie{
	String name;
	
	Movie(String name){
		this.name=name;
	}
}

public class ConsumerChaining {

	public static void main(String[] args) {
		
		Consumer<Movie> c1=m->System.out.println(m.name+" "+"ready to release");
		Consumer<Movie> c2=m->System.out.println(m.name+" "+"it will be a huge blockbuster");
		Consumer<Movie> c3=m->System.out.println(m.name+" "+"audience are more entertained");
		
		Consumer<Movie> cc=c1.andThen(c2).andThen(c3);
		
		Movie m=new Movie("Hi Nanna");
		
//		c1.accept(m);
//		c2.accept(m);
//		c3.accept(m);
		
		cc.accept(m);

	}

}
