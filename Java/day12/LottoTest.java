package day12;

import java.util.HashSet;
class LottoSet{
	LottoSet(){}
	public HashSet<Integer> generateLotto(){
		int rand;
		int i=0;
		int size;
		HashSet<Integer> set =new HashSet<>() ;
		for (;i<10;i++){
			rand= (int) (Math.random()*21)+10;
			size=set.size();
			set.add(rand);
			if (size==set.size()){				
				i--;
			}
		}
		/*while (i<10){
			rand= (int) (Math.random()*21)+10;
			size=set.size();
			set.add(rand);
			if (size!=set.size()){				
				i++;
			}
		}*/
		return set;
	}
}

public class LottoTest {
	public static void main(String [] args){
		LottoSet ls = new LottoSet();
		HashSet <Integer> lotto = ls.generateLotto();
		System.out.println(lotto);

	}
}