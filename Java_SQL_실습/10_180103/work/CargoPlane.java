package work;

public class CargoPlane extends Plane{
	public CargoPlane(){	
	}
	public CargoPlane(String planName,int fuelSize){	
		super(planName,fuelSize);
	}
	public void flight(int distance){
		int fuel = super.getFuelSize();
		for (int i =0;i<distance/10;i++){
			fuel=fuel-50;
		}
		super.setFuelSize(fuel);
	}
}
