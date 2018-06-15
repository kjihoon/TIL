package day16;


enum Season5{
	SPRING("따뜻함"),SUMMER("더움"),FALL("시원함"),WINTER("추움");
	private final String name;
	Season5(String name){
		this.name =name;
	}
	String returnName(){
		return name;
	}
}
/*
public class enumTest5 {

	public static void main(String[] args) {
		Season5 s5 = Season5.valueOf("SUMMER");
		switch(s5){
			case SPRING;
			System.out.println(s5.returnName());
			break;
		}
	}
}*/
