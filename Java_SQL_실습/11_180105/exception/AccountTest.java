package workspace6.exception;

public class AccountTest {
	public static void main(String [] args){
		Account myaccount = new Account("441-0290-1203",500000,0.073); 
		System.out.println("��������:"+myaccount.getAccount()+" "+myaccount.getBalance()+" "+myaccount.getInterestRate());
		try{
			myaccount.deposit(-1);
		}catch(Exception e){
			e.getMessage();
			System.out.println("�Ա� �ݾ��� 0���� �����ϴ�.");
		}
		try{
			myaccount.witdraw(100);
		}catch(Exception e){
			System.out.println("�ݾ��� 0���� ���ų� �ܾ׺��� �����ϴ�.");
		}
		System.out.println("����:"+myaccount.calculateInterest());
		
	}
}
