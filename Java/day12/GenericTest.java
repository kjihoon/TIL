

package day12;
import java.util.*;
public class GenericTest {

	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList <String>(); //Type Class  �ȳ����� �ڵ����� Object�� Ű�ε�
		list.add("java");
		list.add("0200");
		list.add("jihoon");
		list.add("jdbc");
		
		for (int i =0;i<list.size();i++){  //linkedList �� ������ ������
			System.out.println(list.get(i));
		}
		System.out.println();
		
		for (String s: list){
			//String s = (String)value;
			System.out.println(s);
		}
		System.out.println();
		
		Iterator <String> iter = list.iterator(); //���� ���� ����
		while(iter.hasNext()){
			String s = (String) iter.next();
			System.out.println(s);
		}
		
	}


}
