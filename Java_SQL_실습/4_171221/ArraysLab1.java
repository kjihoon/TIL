package day4;

public class ArraysLab1 {

	public static void main(String[] args) {
		int list [] = new int [10];
		int sum=0;
		System.out.print("��� ������ ��: ");
		for (int i=0;i<=9;i++) {
			int a = (int)(Math.random()*16)+4;
			list[i]=a;
			sum=sum+list[i];
			System.out.print(list[i]+"\t");
		}
		
		System.out.println("\n"+"��� ������ ��: "+sum);
		
		
	}

}
