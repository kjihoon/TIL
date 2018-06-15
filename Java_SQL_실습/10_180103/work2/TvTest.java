package work2;

public class TvTest {

	public static void main(String[] args) {
		SaleTv saletv = new SaleTv(300000,"SALETV-1",40,1);
		RentalTv rentaltv = new RentalTv(100000,"RENTALTV-10",42,1);
		saletv.channelUp();
		saletv.channelUp();
		rentaltv.channelDown();
		rentaltv.channelDown();
		rentaltv.channelDown();
		printAllTv(saletv);
		printAllTv(rentaltv);
		//printRentalTv(rentaltv);
		
	}
	static void printAllTv(Tv tv){
		System.out.println(tv.toString());
		
		if (tv instanceof SaleTv){
			((SaleTv)tv).play();
			((SaleTv)tv).sale();
		}else{
			((RentalTv)tv).play();
			((RentalTv)tv).rent();
		}
	}
	static void printRentalTv(Rentable tv){
		tv.rent();
	}

}
