package test;

class Goods2{
	String prodId; // 상품 아이디 
	String prodName; // 상품 이름 
	int price; // 상품 가격 
	char asYn; // AS 가능 여부 
	
// 생성자 두 개를 구현하시오. 
	Goods2(String prodId,String prodName,int price){
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.asYn = 'Y';
	}
	Goods2(String prodId,String prodName,int price,char asYn){
		this(prodId, prodName, price);
		this.asYn =asYn;
	}

// getGoodsInfo() 메서드를 구현하시오.
	public String getGoodsInfo(){
		if (asYn =='N')
			return "상품ID : "+prodId + "상품명 : " + prodName + ", 가격 : "+ price +"원, AS가능여부 : " +"불가";
		else{
			return "상품ID : "+prodId + "상품명 : " + prodName + ", 가격 : "+ price +"원, AS가능여부 : " +"가능";
		}
	}
}

public class GoodsTest{	
	public static void main(String[] args) {
		Goods prod1 = new Goods("PRD-0001", "듀크컴퓨터", 10000, 'N'); 
		System.out.println(prod1.getGoodsInfo()); 
		Goods prod2 = new Goods("PRD-0002", "턱시컴퓨터", 20000); 
		System.out.println(prod2.getGoodsInfo());
	}
}

//실행결과
//상품ID : PRD-0001, 상품명 : 듀크컴퓨터, 가격 : 10,000원, AS가능여부 : 불가
//상품ID : PRD-0002, 상품명 : 턱시컴퓨터, 가격 : 20,000원, AS가능여부 : 가능

