package day16;



enum Season2{ //Ư���� ������ class �Դϴ�!!!
	��, ����, ����
}


public class enumTest2 {

	public static void main(String[] args) {
		System.out.println(Season2.��);
		System.out.println(Season2.����);
		System.out.println(Season2.����);

		
		Season2 data = Season2.����; 
		System.out.println(data);
		
		if (data == Season2.����){
			System.out.println("ww");
		}
	}
}
