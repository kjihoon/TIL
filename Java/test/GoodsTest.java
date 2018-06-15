package test;

class Goods2{
	String prodId; // ��ǰ ���̵� 
	String prodName; // ��ǰ �̸� 
	int price; // ��ǰ ���� 
	char asYn; // AS ���� ���� 
	
// ������ �� ���� �����Ͻÿ�. 
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

// getGoodsInfo() �޼��带 �����Ͻÿ�.
	public String getGoodsInfo(){
		if (asYn =='N')
			return "��ǰID : "+prodId + "��ǰ�� : " + prodName + ", ���� : "+ price +"��, AS���ɿ��� : " +"�Ұ�";
		else{
			return "��ǰID : "+prodId + "��ǰ�� : " + prodName + ", ���� : "+ price +"��, AS���ɿ��� : " +"����";
		}
	}
}

public class GoodsTest{	
	public static void main(String[] args) {
		Goods prod1 = new Goods("PRD-0001", "��ũ��ǻ��", 10000, 'N'); 
		System.out.println(prod1.getGoodsInfo()); 
		Goods prod2 = new Goods("PRD-0002", "�ν���ǻ��", 20000); 
		System.out.println(prod2.getGoodsInfo());
	}
}

//������
//��ǰID : PRD-0001, ��ǰ�� : ��ũ��ǻ��, ���� : 10,000��, AS���ɿ��� : �Ұ�
//��ǰID : PRD-0002, ��ǰ�� : �ν���ǻ��, ���� : 20,000��, AS���ɿ��� : ����

