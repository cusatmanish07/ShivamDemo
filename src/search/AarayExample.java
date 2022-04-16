package search;
import java.util.Arrays;  


public class AarayExample {
	
	
	public void dfl() {
		
		for(int i=1; i<=5;i++) {
			for(int j=0;j<5;j++) {
				for(int k=2; k<5;k++) {
					
					
					System.out.println(i +" "+j+" "+k);
				}
				
			}
			
		}
		
	}
	
	
	
	public void arraydemo() {
		
		int SachinScore[] = new int[5];
		char SachinSeries[] = {'z', 'b', 'q', 'e', 'a'};
		String SachinTrophy[] = new String[5];
		
		
		int j=12;
		
		for(int i=0;i<5;i++) {
			
			SachinScore[i]= i*17+j;
		}
		
		for(int i=0;i<5;i++) {
			
			if(i==0) {
				SachinTrophy[i] = "MOM";
			}else if(i==1) {
				SachinTrophy[i]="MOS";
			} else if (i==2) {
				
				SachinTrophy[i]="MOM";
			}else if (i==3) {
				
				SachinTrophy[i]="MOT";
			} else {
				
				SachinTrophy[i]="MOM";
			}
			
			
		}
		
		
		//Print the run he scored in all series
		for(int i=0;i<SachinScore.length;i++) {
			
			System.out.println("Sachin Scores are : "+SachinScore[i]);
		}
		
		
		for(int i=0;i<SachinSeries.length;i++) {
			
			System.out.println(SachinSeries[i]);
		}
		
		for(int i=0;i<SachinTrophy.length;i++) {
			
			System.out.println(SachinTrophy[i]);
		}
		
		Arrays.sort(SachinSeries);
		
		
          for(int i=0;i<SachinSeries.length;i++) {
			
			System.out.println(SachinSeries[i]);
		}
		
          
          int day = 6;
          switch (day) {
            case 1:
              System.out.println("Monday");
              break;
            case 2:
              System.out.println("Tuesday");
              break;
            case 3:
              System.out.println("Wednesday");
              break;
            case 4:
              System.out.println("Thursday");
              break;
            case 5:
              System.out.println("Friday");
              break;
            case 6:
              System.out.println("Saturday");
              break;
            case 7:
              System.out.println("Sunday");
              break;
          } 
		        
          
	}
	

	 //FizzBuzz Problem 
    
    public void fizzbuzz(int start, int end) {
    	
  	  
    	for(int i=start;i<=end; i++) {
    		
    		if(i%3==0 && i%5==0) {
    			
    			System.out.println("FizzBuzz");
    		} else if(i%3==0) {
    			System.out.println("Fizz");
    		} else if(i%5==0) {
    			
    			System.out.println("Buzz");
    		}else {
    			System.out.println(i);
    		}
 	
    	}
    }
    
	public int add(int x, int y) {
		
		int z = x + y;
		return z;
	
	}
	
	
	public boolean testTF(int x, int y) {
		
		int z= x+y;
		
		if(z%2==0) {
			return true;
		} else {
			
			return false;
		}
		
		
	}
	
		
	private int x =10;
	public int y =20;
	protected int z= 40; //

	
	}


    