package day16;


enum Season4{
	SPRING("따뜻함"),SUMMER("더움"),FALL("시원함"),WINTER("추움");
	private final String name;
	Season4(String name){
		this.name =name;
	}
	String returnName(){
		return name;
	}
}

public class enumTest4 {

	public static void main(String[] args) {
		Season4 day[] = Season4.values();
		for (Season4 value:day)
			System.out.println(value);
		for (Season4 value:day)
			System.out.println(value.returnName());
		Season4 season = Season4.valueOf("SUMMER");
		System.out.println("Season4.valueOf(\"SUMMER\"): "+season);
		System.out.println("Season4.valueOf(\"SUMMER\").returnName(): "+
				Season4.valueOf("SUMMER").returnName());
	}
}
