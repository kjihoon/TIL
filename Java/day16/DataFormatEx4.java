package day16;
import java.util.*;
import java.text.*;
public class DataFormatEx4 {
	public static void main(String [] args){
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner sc =new Scanner(System.in);
		Date inDate = null;
		System.out.println("��¥�� "+pattern +"�� ���·� �Է����ּ���.(�Է¿� 2015/12/31)");
		
		while (sc.hasNextLine()){
			try{
				inDate = df.parse(sc.nextLine());
				break;
			}catch(Exception e){
				System.out.println("��¥�� "+pattern +"�� ���·� �Է����ּ���.(�Է¿� 2015/12/31)");
			}
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		long day = (cal.getTimeInMillis()-today.getTimeInMillis())/(60*60*1000);
		System.out.println("�Է��Ͻ� ��¥�� ����� "+day+"�ð����̰� ���ϴ�.");
		
	}
	
}
