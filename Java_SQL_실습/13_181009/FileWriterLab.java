package day13;
import java.util.*;
import java.io.*;

class KoreanDay{
	public static String day,day2;
	static String KorDayName[] = {",","�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
	
	static {
		GregorianCalendar cal = new GregorianCalendar();
		int numDay = cal.get(Calendar.DAY_OF_WEEK);
		day = KorDayName[numDay];
	}
	
	static {
		GregorianCalendar cal2 = new GregorianCalendar(1992,8,14);
		int birthday =cal2.get(cal2.DAY_OF_WEEK);
		day2 = KorDayName[birthday];
	}
}

public class FileWriterLab {
	public static void main(String[] args) {
		
		try(FileWriter writer = new FileWriter("C:/iotest/lab_0109.txt")){		
			writer.write("������ "+KoreanDay.day+" �Դϴ�.");
			writer.write("\r\n");		
			writer.write("�������� "+KoreanDay.day2+"�� �¾���.");
			
			
		}catch(IOException ioe){
			System.out.println("���Ϸ� ��� �� �� �����ϴ�.");
		}finally{
			System.out.println("��������");
		}
	}

}
