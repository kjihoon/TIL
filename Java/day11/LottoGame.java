package day11;

import java.util.Random;

class DuplicateException extends Exception{
	DuplicateException (){
		super("�ߺ��� �ζ� ��ȣ�� �߻��Ͽ����ϴ�.");
	}		
}

class LottoMachine {
	private int nums []=new int [6];
	LottoMachine(){}
	
	public void createLottoNums(){
		Random r = new Random();
		for (int i=0;i<6;i++){
			nums[i]= r.nextInt(20)+1;
		}
	}
	public void checkLottoNums() throws DuplicateException{
		for (int i=0;i<6;i++){
			for (int j=i+1;j<6;j++){
				if (nums[i]==nums[j]){
					throw new DuplicateException();
				}							
			}
		}
	}
	public int [] getNums(){
		return nums;
	}
}


public class LottoGame  {
	public static void main(String [] args) {
		try{
			LottoMachine lm = new LottoMachine();
			lm.createLottoNums();
			lm.checkLottoNums();
			
			System.out.print("( ");
			for (int i=0;i<lm.getNums().length;i++){
				System.out.print(lm.getNums()[i]);
				if(i<lm.getNums().length-1){
					System.out.print(",");
				}
			}
			System.out.println(" )");
		}
		catch(DuplicateException e){
			System.out.println("�����߻�: "+e.getMessage());
		}
	}
}
