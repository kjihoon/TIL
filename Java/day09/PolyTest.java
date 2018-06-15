package day9;

public class PolyTest {
	public static void main(String [] args){
		printObjectinfo(new Object());
		printObjectinfo(new String("������"));
		printObjectinfo("������");
		printObjectinfo(new java.io.File("C:/"));
		printObjectinfo(new int[10]);
		printObjectinfo(new Integer(100));
		printObjectinfo(new java.util.Date());
		printObjectinfo(new exercise.Human());
		
	}
	public static void printObjectinfo(Object o){
		if (o instanceof String){  //������ ����instanceof ��üŸ��
			System.out.println("���ڿ� ��ü:"+
					o.toString()+"("+((String)o).length()+")");
			
		}else{
			System.out.println("���޵� ��ü�� Ŭ������:"+
					o.getClass().getName());
		}
		//System.out.println(o.toString());
		
	}
}
