package day4;

public class ArraysLab1 {

	public static void main(String[] args) {
		int list [] = new int [10];
		int sum=0;
		System.out.print("모든 원소의 값: ");
		for (int i=0;i<=9;i++) {
			int a = (int)(Math.random()*16)+4;
			list[i]=a;
			sum=sum+list[i];
			System.out.print(list[i]+"\t");
		}
		
		System.out.println("\n"+"모든 원소의 합: "+sum);
		
		
	}

}
