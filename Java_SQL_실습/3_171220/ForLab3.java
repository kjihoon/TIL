package day3;

public class ForLab3 {

	public static void main(String[] args) {
		//System.out.print("\n");
		for (int i=9;i>=5;i--) {
			System.out.print("\n"+i+"´Ü:");
			
			for (int ii=1;ii<10;ii++) {
				System.out.print(i+"x"+ii+"="+i*ii+"\t");
			}
		}
	}

}
