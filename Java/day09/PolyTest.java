package day9;

public class PolyTest {
	public static void main(String [] args){
		printObjectinfo(new Object());
		printObjectinfo(new String("가나다"));
		printObjectinfo("가나다");
		printObjectinfo(new java.io.File("C:/"));
		printObjectinfo(new int[10]);
		printObjectinfo(new Integer(100));
		printObjectinfo(new java.util.Date());
		printObjectinfo(new exercise.Human());
		
	}
	public static void printObjectinfo(Object o){
		if (o instanceof String){  //참조형 변수instanceof 객체타입
			System.out.println("문자열 객체:"+
					o.toString()+"("+((String)o).length()+")");
			
		}else{
			System.out.println("전달된 객체의 클래스명:"+
					o.getClass().getName());
		}
		//System.out.println(o.toString());
		
	}
}
