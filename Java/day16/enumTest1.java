package day16;



enum Season{
	SPRING,SUMMER,FALL,WINTER
}

public class enumTest1 {

	public static void main(String[] args) {
		System.out.println(Season.FALL);
		System.out.println(Season.SPRING);
		System.out.println(Season.SUMMER);
		System.out.println(Season.WINTER);
		Season inputSeason;
		Season data = Season.FALL; 
		System.out.println(data);
		
		if (data == Season.FALL){
			System.out.println("ww");
		}
	}
}
