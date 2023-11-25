package Practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//  Find the age of a person in years if the birthday has given?

public class Test {

	public static void main(String[] args) {
		
		
		LocalDate birthday=LocalDate.of(1999,06,11);
		
		LocalDate today=LocalDate.now();
		
		System.out.println(ChronoUnit.YEARS.between(birthday,today));

	}

}
