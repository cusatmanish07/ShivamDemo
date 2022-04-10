package order;
import search.CredicardPayment;

public class Payment implements CredicardPayment  {
	
	
	
	public void ici_cpay(String Name) {
		
		
		System.out.println(Name);
		
		
	}
	public void hdfc_cpay(String Name) {
		
		System.out.println(Name);
		
	}
	public void sbi_cpay(String Name) {
		
		System.out.println(Name);
		
	}
	
	public void onlineBanking(int accountNumber) {
		
		System.out.println(accountNumber);
		
	}

}
