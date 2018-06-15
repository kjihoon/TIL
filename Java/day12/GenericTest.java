

package day12;
import java.util.*;
public class GenericTest {

	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList <String>(); //Type Class  안넣으면 자동으로 Object로 키인됨
		list.add("java");
		list.add("0200");
		list.add("jihoon");
		list.add("jdbc");
		
		for (int i =0;i<list.size();i++){  //linkedList 는 성능이 떨어짐
			System.out.println(list.get(i));
		}
		System.out.println();
		
		for (String s: list){
			//String s = (String)value;
			System.out.println(s);
		}
		System.out.println();
		
		Iterator <String> iter = list.iterator(); //가장 많이 사용됨
		while(iter.hasNext()){
			String s = (String) iter.next();
			System.out.println(s);
		}
		
	}


}
