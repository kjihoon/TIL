package work2;

public class RentalTv extends Tv implements Rentable{
	private int price;
	
	public RentalTv(){}
	public RentalTv(int price,String model,int size,int channel){
		super(model,size,channel);
		this.price=price;
	}
	
	public void play(){
		System.out.println("�뿩 TV ä�� "+getChannel()+" "+getModel()+"���� ���θ� �÷����մϴ�.");
	}
	public void rent(){
		String str = String.format("%,d", price);
		System.out.println(getModel()+"���� ��ǰ�� �뿩�մϴ�. "+str+" �� �������ּ���!");
	}
	public String toString(){
		String str = String.format("%,d", price);
		return "�뿩��ǰ����:\t�𵨸�:("+getModel()+")\t����:("+str+")\tũ��:("+getSize()+")";
	}
}
