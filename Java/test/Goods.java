package test;

public class Goods{
	String prodId; // ��ǰ ���̵� 
	String prodName; // ��ǰ �̸� 
	int price; // ��ǰ ���� 
	char asYn; // AS ���� ���� 
	
// ������ �� ���� �����Ͻÿ�. 
	Goods(String prodId,String prodName,int price){
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.asYn = 'Y';
	}
	Goods(String prodId,String prodName,int price,char asYn){
		this(prodId, prodName, price);
		this.asYn =asYn;
	}

// getGoodsInfo() �޼��带 �����Ͻÿ�.
	public String getGoodsInfo(){
		if (asYn =='N')
			return "��ǰID : "+prodId + "��ǰ�� : " + prodName + ", ���� : "+ price +"��, AS���ɿ��� : " +"�Ұ�";
		else{
			return "��ǰID : "+prodId + "��ǰ�� : " + prodName + ", ���� : "+ price +"��, AS���ɿ��� : " +"����";
		}
	}
}
