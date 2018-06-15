package day12;


import day8.Friend;
import java.util.*;
public class FriendTestLinkedList {

	public static void main(String[] args) {
		LinkedList<Friend> f = new LinkedList<Friend>();
		f.add(new Friend("ÁöÈÆ","010 2834 0595","naver"));
		f.add(new Friend("Á¾ÈÆ","010 2834 0595","naver"));
		f.add(new Friend("´ÙÇı","010 2834 0595","naver"));
		f.add(new Friend("È£Áø","010 2834 0595","naver"));
		f.add(new Friend("À¯Á¤","010 2834 0595","naver"));
		for (int i=0;i<f.size();i++){
			System.out.println(f.get(i).getInfo());
		}
		
	}

}
