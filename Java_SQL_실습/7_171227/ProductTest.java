package day7;

class product{
	String name;
	int balance;
	int price;
	
	public String getname(){
		return name;
	}
	public int getbalance(){
		return balance;
	}
	public int getprice(){
		return price;
	}
	
	product(){
		this("��ũ",5,100000);
	}
	product(String name,int balance,int price){
		this.name=name;
		this.balance=balance;
		this.price=price;
	}
}


public class ProductTest {
	public static void main(String [] arg) {
		product [] pd = new product [5];
		pd[0] = new product("���",1,1);
		pd[1] = new product("��",132,100);
		pd[2] = new product("����",1,1000);
		pd[3] = new product("����",2,10);
		pd[4] = new product("����",5,30);
		
		for (product a:pd) {
			System.out.println(a.getname());
			System.out.println(a.getbalance()+"��");
			System.out.println(a.getprice()+"��\n");
		}
		
	}
}
