package day3;

public class WhileLab3 {

	public static void main(String[] args) {
		int i =2;
		while (i<=9) {
			int ii =1;
			System.out.print(i+"´Ü\t");
			while (ii<=9) {
				System.out.print(i+"x"+ii+"="+i*ii+"\t");
				ii=ii+1;
			}
			i=i+1;
			System.out.println();
		}
	}
}
