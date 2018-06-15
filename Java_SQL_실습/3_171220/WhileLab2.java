package day3;

public class WhileLab2 {

	public static void main(String[] args) {
		
		
		
		int a = 1;
		while (27>=a||a>=30) {
			a = (int)(Math.random()*30);
			if (a==0) {
				break;
			}
			
			System.out.println((char) (a+64)+"("+a+")");
		
			
		}
	}
}
