package order;

public class MobileOrder {
	
	public String Company = "Samsung";
	public String Model = "Xperia";
	public int price = 1000;
	public String ram = "10GB";
	
	public String Company1 = "Nokia";
	public String Model1 = "3310";
	public int price1 = 999;
	public String ram1 = "20GB";
	
	public void printTwentyToOne() {
	
		for (int z=20;z>=1; z--) {
			   
			System.out.println("Print the number: "+ z);
			System.out.println("Print the multipe of 10 "+ z*10);
			System.out.println("Print the square of number "+ z*z);
			
		}
			
	}
	
	
	public void PrintOneToTwenty() {
		
		for(int z=1; z<=20;z++) {
			
			System.out.println("Print the number: "+ z);	
			System.out.println("Print the square of number "+ z*z);
		}
		
		
	}
	
	
	public void getMobileDetails(String CompanyName) {
		
		
		if(CompanyName=="Samsung") {
		System.out.println("Mobile Deatils are below");
		System.out.println(Company +" "+Model +" "+price +" "+ram );
		}
		
		else{
			System.out.println("Mobile Deatils are below");
			System.out.println(Company1 +" "+Model1 +" "+price1 +" "+ram1 );
			}
		
		
	}
	
	
	

}
