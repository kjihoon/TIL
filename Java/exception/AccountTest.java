package workspace6.exception;

public class AccountTest {
	public static void main(String [] args){
		Account myaccount = new Account("441-0290-1203",500000,0.073); 
		System.out.println(myaccount.toString());
		System.out.println("∞Ë¡¬¡§∫∏:"+myaccount.getAccount()+" "+myaccount.getBalance()+" "+myaccount.getInterestRate());
		try{
			myaccount.deposit(-10);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		try{
			myaccount.witdraw(0);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println(myaccount.calculateInterest());
		
	}
}
