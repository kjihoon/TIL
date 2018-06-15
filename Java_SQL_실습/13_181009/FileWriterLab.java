package day13;
import java.util.*;
import java.io.*;

class KoreanDay{
	public static String day,day2;
	static String KorDayName[] = {",","일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
	
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
			writer.write("오늘은 "+KoreanDay.day+" 입니다.");
			writer.write("\r\n");		
			writer.write("곽지훈은 "+KoreanDay.day2+"에 태어났어요.");
			
			
		}catch(IOException ioe){
			System.out.println("파일로 출력 할 수 없습니다.");
		}finally{
			System.out.println("수행종료");
		}
	}

}
