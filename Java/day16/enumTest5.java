package day16;


enum Season5{
	SPRING("������"),SUMMER("����"),FALL("�ÿ���"),WINTER("�߿�");
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
