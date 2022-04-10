package search;

 public class Car {
	
	 final public int x =10;
	 

	
	final public void run(){
		
		System.out.println("Car is running");
	}
	
	public void wheelInfo() {
		
		System.out.println("Car is having 4 wheels");
	}
	
	public void turn() {
		
		System.out.println("It has left turn and right turn function");
	}
	
	//Final Method can not be overridden 
  final	public void add(int x, int y) {
		
		int z = x+y;
		System.out.println(z);
	}
	
	
}
