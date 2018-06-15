package workspace6.exception;

public class Account extends Exception{
	private String account;
	private double balance, interestRate;
	
	public Account(){}
	public Account(String account,double balance,double interestRate){
		this.account=account;
		this.balance=balance;
		this.interestRate=interestRate;
		
	}
	@Override //이걸 붙히면 오버라이드 메서드 생성시에 철자가잘못되어, 또는 매개변수 사양이 다르면 오버라이드가 잘못되었다고 알림!
	//애노테이션: 코드를 설명하는 구문
	public String toString() {
		return "계좌정보 [account=" + account + ", balance=" + balance + ", interestRate=" + interestRate + "]";
	}


	public double calculateInterest(){
		return interestRate*balance;
	}
	
	public void deposit(double money)throws Exception{
		if (money<0){
			throw new Exception("입금 금액이 0보다 적습니다.");
		}else{
			balance+=money;
		}		
	}
	public void witdraw(double money) throws Exception{
		if (balance-money<0||money<0){
			throw new Exception("금액이 0보다 적거나 잔액보다 많습니다.");
		}else{
			balance-=money;			
		}
	}
	
	
	
	
	
	
	
	
	
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}
