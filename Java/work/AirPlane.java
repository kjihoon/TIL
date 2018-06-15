package work;

public class AirPlane extends Plane {
	public AirPlane(){	
	}
	public AirPlane(String planName,int fuelSize){	
		super(planName,fuelSize);
	}
	public void flight(int distance){
		int fuel = super.getFuelSize();
		for (int i =0;i<distance/10;i++){
			fuel=fuel-30;
		}
		super.setFuelSize(fuel);
		
	}
}
