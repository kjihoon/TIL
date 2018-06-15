package day16;



enum Season2{ //특별한 형태의 class 입니다!!!
	봄, 여름, 가을
}


public class enumTest2 {

	public static void main(String[] args) {
		System.out.println(Season2.봄);
		System.out.println(Season2.여름);
		System.out.println(Season2.가을);

		
		Season2 data = Season2.가을; 
		System.out.println(data);
		
		if (data == Season2.가을){
			System.out.println("ww");
		}
	}
}
