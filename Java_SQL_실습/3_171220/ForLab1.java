package day3;

public class ForLab1 {

	public static void main(String[] args) {
		int count= (int)(Math.random()*10)+3; 
		int deco = (int)(Math.random()*3)+1; 
		System.out.println(deco);
		for (int i=1;i<=count;i++) {
			if (deco == 1) {
				System.out.print("*");
			}else if(deco == 2) {
				System.out.print("$");
			}else {
				System.out.print("#");
			}
		}		
	}

}
