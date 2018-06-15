package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class ProductTest {

	public static void main(String[] args) {
		TreeSet <Product> set = new TreeSet <Product>();
		Product productset [] = new Product [4];
		productset[0] = new Product("p100","TV\t",20000);
		productset[1] = new Product("p200","Computer",10000);
		productset[2] = new Product("p100","MP3\t",9900);
		productset[3] = new Product("p300","Audio\t",9900);
		AddProduct(productset,set);
		System.out.println();
		PrintInform(set);
		/*TreeSet set2 = new TreeSet();
		for (Product p : set){
			p.compareTo(p);
		}
		System.out.println(set2);*/
		
		
		
	}
	public static void PrintInform(TreeSet<Product> x){
		System.out.println("제품ID\t제품명\t제품가격");
		System.out.println("-----------------------");
		for (Product p:x){
			System.out.println(p.toString());
		}
	}
	public static void AddProduct(Product [] p,TreeSet<Product> h){
		int size;
		for (int i=0;i<p.length;i++){
			size=h.size();
			h.add(p[i]);
			if (h.size()>size){
				System.out.println("성공적으로 저장됨");
			}else{
				System.out.println("동일한 ID 존재");
			}
		}
	}
}
