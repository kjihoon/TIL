package day4;

public class ArraysLab2 {

	public static void main(String[] args) {
		char list [] = {'J','a','v','A'};
		int capital;
		for (int i=0;i<=3;i++) {
			if (list[i]>='a'&&list[i]<='z') {
			capital=list[i]-32;
			System.out.println((char) capital);
			}else {
				capital=list[i]+32;
				System.out.println((char) capital);
			}
		}
	}
}
