package work2;

public class SaleTv extends Tv {
	private int price;
	
	public SaleTv(){}
	public SaleTv(int price,String model,int size,int channel){
		super(model,size,channel);
		this.price=price;
	}
	
	public void play(){
		System.out.println("�Ǹ� TV ä�� "+getChannel()+" "+getModel()+"���� ���θ� �÷����մϴ�.");
	}
	public void sale(){
		String str = String.format("%,d", price);
		System.out.println(getModel()+"���� ��ǰ�� �Ǹ��մϴ�. "+str+" �� �������ּ���!");
	}
	public String toString(){
		String str = String.format("%,d", price);
		return "�ǸŻ�ǰ����:\t�𵨸�:("+getModel()+")\t����:("+str+")\tũ��:("+getSize()+")";
	}
}
