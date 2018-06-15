package day5;

public class MethodLab2 {

	public static void main(String[] args) {
		int number1;
		int number2;
		for (int i=1;i<=5;i++) {
			number1 = (int) (Math.random()*30)+1;
			number2 = (int) (Math.random()*30)+1;
			System.out.println(number1+"과"+number2+"의 차는"+Output2(number1,number2));
		}
	
	}
	public static int Output2(int n1,int n2){
		int output;
		if (n1>n2) {
			output=n1-n2;
		}else{ //n1=n2 포함
			output=n2-n1;
		}
		return output;
	}

}