package workspace6.exception;

public class AccountTest {
	public static void main(String [] args){
		Account myaccount = new Account("441-0290-1203",500000,0.073); 
		System.out.println("계좌정보:"+myaccount.getAccount()+" "+myaccount.getBalance()+" "+myaccount.getInterestRate());
		try{
			myaccount.deposit(-1);
		}catch(Exception e){
			e.getMessage();
			System.out.println("입금 금액이 0보다 적습니다.");
		}
		try{
			myaccount.witdraw(100);
		}catch(Exception e){
			System.out.println("금액이 0보다 적거나 잔액보다 많습니다.");
		}
		System.out.println("이자:"+myaccount.calculateInterest());
		
	}
}
