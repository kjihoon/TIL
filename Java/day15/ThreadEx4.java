package day15;
import javax.swing.*;
public class ThreadEx4 {

	public static void main(String[] args) throws Exception{
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է�");
		System.out.println("�Է°��� "+input+"�Դϴ�.");
		for (int i=10;i>0;i--){
			System.out.println(i);
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				
			}
		}
	}
}

