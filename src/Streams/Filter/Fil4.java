package Streams.Filter;

import java.util.*;
import java.util.stream.Collectors;
class Product{
	
	int id;
	String productname;
	double price;
	
	Product(int id,String productname,double price){
		this.id=id;
		this.productname=productname;
		this.price=price;
	}
}

public class Fil4 {

	public static void main(String[] args) {
		
		List<Product> p=new ArrayList<Product>();
		
		p.add(new Product(101,"OneplusNord",20000));
		p.add(new Product(102,"Realme",18000));
		p.add(new Product(103,"Redmi",12000));
		p.add(new Product(104,"IPhone",55000));
		p.add(new Product(105,"HP",65000));
		p.add(new Product(106,"Dell",70000));
		p.add(new Product(107,"Lenovo",350000));
		p.add(new Product(108,"Asus",40000));
		
		System.out.println(p);
		
		p.stream().filter(s->s.price>20000).forEach(pr->System.out.println(pr.id +":"+ pr.productname +":"+pr.price));
		
		

	}

}
