package exercise;

public class StudentTest {

	public static void main(String[] args) {
		Student arrays [] = new Student[3];
		arrays[0] =new Student("ȫ�浿",20,171,81,"201101","����");
		arrays[1] =new Student("������",18,182,75,"201101","����");
		arrays[2] =new Student("ȫ�浿",20,171,81,"201101","����");
		for (int i=0;i<arrays.length;i++){
			System.out.println(arrays[i].printInformation());;
		}
	}

}
