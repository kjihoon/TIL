package day8;
import day5.MethodLab3; 
class GuGu {
	private int dan;
	private int number;
	GuGu() {
	}
	GuGu(int dan) {
		this.dan = dan;
	}
	GuGu(int dan, int number) {
		this.dan = dan;
		this.number = number;
	}
	void printPart() {
		if (number == 0) {
			for (int n = 1; n <= 9; n++)
				System.out.print("\t" + dan + "*" + n + "=" + dan * n);
			System.out.println();
		} else {
			System.out.print(dan * number);
		}
	}
}
class GuGuDan extends GuGu{
	GuGuDan(){
	}
	GuGuDan(int dan){
		super(dan);
	}
	GuGuDan(int dan,int number){
		super(dan,number);
	}
	public static void printAll() {
		for (int i =1;i<10;i++) {
			for (int j =1;j<10;j++) {
				GuGu gg = new GuGu(j,i);
				System.out.print(i+"  *  "+j+"  =  ");
				gg.printPart();
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

public class GuGudanTest2 {
	public static void main(String[] args) {
		int dan = MethodLab3.getRandom2(1,20);
		int number = MethodLab3.getRandom2(1,20);
		
		if (dan<10&&number<10) {
			GuGu gugu = new GuGu(dan,number);
			System.out.print(dan+"*"+number+"=");
			gugu.printPart();
		}else if(dan<10&&number>=10) {
			GuGu gugu2 = new GuGu(dan,number);
			for (int i=1;i<10;i++) {
				System.out.print(" "+dan+"*"+i+"=");
				gugu2.printPart();
			}
		}else {
			GuGuDan.printAll();
		}
	}

}
