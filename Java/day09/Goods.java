package day9;


class Product{
	int price;
	int bonus;
	
}

class Tv extends Product{
	Tv(){
		price=1000;
		bonus=100;
	}
}
class Audio extends Product{
	Audio(){
		price=800;
		bonus=200;
	}
}
class buyer{
	int money;
	int bonus;
	buyer(int money,int bonus){
		this.money=money;
		this.bonus=bonus;
	}
	
	void buy(Product p){
		money = money - p.price;
		bonus = bonus + p.bonus;
		System.out.println(money);
		System.out.println(bonus);
		
	}
	
}
public class Goods {
	public static  void main (String [] args){
		buyer a = new buyer(10000,100);
		Product p1 = new Tv();
		Product p2 = new Audio();
		a.buy(p1);
		a.buy(p2);
		a.buy(p1);
	}
}
