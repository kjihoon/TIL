package day4;

public class ArraysLab3 {

	public static void main(String[] args) {
		int list [] = new int [10];
		for (int i=0;i<=9;i++) {
			int a = (int)(Math.random()*26)+1;
			list[i]=a;
			System.out.print(list[i]+"\t");
		}
		System.out.println();
		
		char list2 [] = new char [10];
		for (int i=0;i<=9;i++) {
			list2[i]=(char) (list[i]+64);
		
			System.out.print(list2[i]+"\t");
		}

	}
}
