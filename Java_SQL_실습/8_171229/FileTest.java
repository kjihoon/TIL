package day8;
import java.io.File;
import java.util.*;
public class FileTest {

	public static void main(String[] args) {
		//�����Ϸ��� ���ϸ��̳� ���丮���� ǥ���Է�
		//���� �޾� ó���ϵ��� �ҽ� ���� - Scanner
		Scanner scanner = new Scanner(System.in);
		String pathname = "C:/Users/student/eclipse-workspace/practice_day1/src/";
		String filename = scanner.nextLine();
		
		File f = new File(pathname+filename);
		

		
		if(f.exists()) {
			if(f.isDirectory()) {
				System.out.println("���丮 �Դϴ�");
			}else {
				System.out.println(f.length()+"byte �����Դϴ�.");
			}
		}else {
			System.out.println("�������� �ʴ´�!");
		}		
	}
}
