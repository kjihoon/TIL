package day12;
import java.util.*;
public class ListTest {

	public static void main(String[] args) {
		int array[]={3,4,2,5,2,3,6,7,5,7,9};
		ConvertList cl = new ConvertList();
		for (int i=0;i<array.length;i++){
			System.out.println(cl.convertList(array).get(i));
		}
	}

}
