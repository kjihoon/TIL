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
		this("듀크",5,100000);
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
		pd[0] = new product("사과",1,1);
		pd[1] = new product("배",132,100);
		pd[2] = new product("오이",1,1000);
		pd[3] = new product("과자",2,10);
		pd[4] = new product("상자",5,30);
		
		for (product a:pd) {
			System.out.println(a.getname());
			System.out.println(a.getbalance()+"개");
			System.out.println(a.getprice()+"원\n");
		}
		
	}
}
