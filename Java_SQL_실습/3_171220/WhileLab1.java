package day3;

public class WhileLab1 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*5)+5;
		System.out.println("[ for 결과 ]");
		for (int i =1;i<=a;i++) {
			System.out.println(i+" -> "+(i*i));
		}
		System.out.println("[ while 결과 ]");
		int i =1;
		while (i<=a){
			System.out.println(i+" -> "+(i*i));
			i=i+1;
		}
	}

	
}
