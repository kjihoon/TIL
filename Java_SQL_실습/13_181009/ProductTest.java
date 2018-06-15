package collection;

import java.util.HashSet;
import java.util.Set;

public class ProductTest {

	public static void main(String[] args) {
		HashSet <Product> set = new HashSet <Product>();
		Product productset [] = new Product [4];
		productset[0] = new Product("p100","TV\t","20000");
		productset[1] = new Product("p200","Computer","10000");
		productset[2] = new Product("p100","MP3\t","700");
		productset[3] = new Product("p300","Audio\t","1000");
		/*int size;
		for (int i=0;i<productset.length;i++){
			size=set.size();
			set.add(productset[i]);
			if (set.size()>size){
				System.out.println("성공적으로 저장됨");
			}else{
				System.out.println("동일한 ID 존재");
			}
		}*/
		AddProduct(productset,set);
		PrintInform(set);
		
	}
	public static void PrintInform(HashSet<Product> x){
		System.out.println("제품ID\t\t제품명\t제품가격");
		System.out.println("-----------------------");
		for (Product p:x){
			System.out.println(p.toString());
		}
	}
	public static void AddProduct(Product [] p,HashSet<Product> h){
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
