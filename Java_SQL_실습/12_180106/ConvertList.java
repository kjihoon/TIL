package day12;
import java.util.*;
public class ConvertList {
	int array[];
	ConvertList(){}
	public ArrayList convertList(int array[]){
		ArrayList <Integer> arr = new ArrayList <Integer>();
		for (int i=(array.length-1);i>=0;i--){
			arr.add(array[i]);
		}
		return arr;
	}
}
