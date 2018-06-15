package work2;

public class RentalTv extends Tv implements Rentable{
	private int price;
	
	public RentalTv(){}
	public RentalTv(int price,String model,int size,int channel){
		super(model,size,channel);
		this.price=price;
	}
	
	public void play(){
		System.out.println("대여 TV 채널 "+getChannel()+" "+getModel()+"번의 프로를 플레이합니다.");
	}
	public void rent(){
		String str = String.format("%,d", price);
		System.out.println(getModel()+"모델의 상품을 대여합니다. "+str+" 를 지불해주세요!");
	}
	public String toString(){
		String str = String.format("%,d", price);
		return "대여상품정보:\t모델명:("+getModel()+")\t가격:("+str+")\t크기:("+getSize()+")";
	}
}
