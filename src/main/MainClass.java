package main;
import order.MobileOrder;
import search.AarayExample;
import search.ProtectedTest;
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
		  
	}

}
