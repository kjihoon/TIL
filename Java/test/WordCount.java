package test;
import java.util.ArrayList;
import java.util.HashSet;

public class WordCount {
	static int countString(String text, boolean word){
		int count = 0;
		String [] x = text.split(" ");
		ArrayList <String> ar = new ArrayList <String>();
		HashSet <String> hs = new HashSet <String>();
		if (word ==false){
			for (String s : x){
				ar.add(s);
			}
			count= ar.size();
		}else{
			for (String s : x){
				hs.add(s);
			}
			count = hs.size();
		}
		return count;	
	}
}
