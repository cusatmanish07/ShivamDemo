package main;


import search.ProtectedTest;
import search.AarayExample;
import search.Car;
import search.Dog;
import search.Ritz;
import order.MobileOrder;
import search.Animal;
import search.RitzNew;
import order.Payment;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Hello Shivam");
	
		for(int i=0;i<10;i++) {
			
			System.out.print(i+" ");
		}
		
		MobileOrder mo = new MobileOrder();
		mo.printTwentyToOne();

		
	  System.out.println("First Function finished ");
		
		mo.PrintOneToTwenty();
		
		  System.out.println("Second  Function finished ");
		  
		  mo.getMobileDetails("Asus");
		  
		  for(int i=1;i<=10;i++) {
			  
			  if(i==7 || i==9) {continue;}
				
				 
			  System.out.println(i);
			  
		  }
		  
		  
		  for(int i=99; i>=80;i--) {
			  
			  if(i%5==0) {
				  
				  System.out.println(i);
				  break;
				
			  }
			  
		  }
		  
		  System.out.println("Double for loop example");
		  AarayExample ae = new AarayExample();
		  ae.dfl();
		  ae.arraydemo();
		  System.out.println("Solving Fizzbuzz ");
		  
		  ae.fizzbuzz(30, 45);
		  
		  int  sum = ae.add(5, 7);
		  System.out.println(sum);
		  
		
		  boolean x= ae.testTF(sum, 5);
		  System.out.println(x);
		  
		  int y= ae.y;
		 
		 System.out.println(y);
		 
		 ProtectedTest pt = new ProtectedTest();
		 pt.show1();
		 
		
		 System.out.println("Show Inheritance------");
		 
		 Car c = new Car();
		 
		 c.run();
		 c.turn();
		 c.wheelInfo();
		
		 
		 Ritz r = new Ritz();
		 r.run();
		 r.turn();
		 r.wheelInfo();
		 System.out.println(c.x);
		 r.add(50, 12);
		 r.add(12, 12, 12);
		
		 System.out.println(r.x);
		 
		 //You can not create an object of Abstract Class
		// Animal  a = new Animal();
		 
		 RitzNew rn = new RitzNew();
		 
		rn.run();
		
		Dog d = new Dog();
		d.animalSound();
		d.sleep();
		System.out.println(d.papa);
		 
		
		Payment p = new Payment();
		
		p.hdfc_cpay("Manish_hdfc");
		p.ici_cpay("Manish_icici");
		p.sbi_cpay("Manish_SBI");
		
		//Scope of a variable-- you can not use before declare
		//System.out.println(papi);
		int papi= 10;
		
		
		
	}
	
	
}
