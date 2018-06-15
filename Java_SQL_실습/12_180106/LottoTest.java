package day12;

import java.util.HashSet;
import java.util.Iterator;

class LottoSet{
	LottoSet(){}
	public HashSet<Integer> generateLotto(){
		int rand;
		int i=0;
		int size;
		HashSet<Integer> set =new HashSet<>() ;
		while (i<10){
			rand= (int) (Math.random()*21)+10;
			size=set.size();
			set.add(rand);
			if (size!=set.size()){				
				i++;
			}
		}
		return set;
	}
}

public class LottoTest {
	public static void main(String [] args){
		LottoSet ls = new LottoSet();
		HashSet <Integer> lotto = ls.generateLotto();
		for (int data : lotto){
			System.out.println(data);
		}

	}
}