package work2;
//string.format
public class Tv {
	private String model;
	private int size,channel;
	
	Tv(){}
	Tv(String model,int size,int channel){
		this.model=model;
		this.size=size;
		this.channel=channel;
	}
	public void channelUp(){
		int n=getChannel();
		if (n>=10){
			setChannel(1);
		}else{
			setChannel(n+1);
		}
		
	}
	public void channelDown(){
		int n=getChannel();
		if (n<=1){
			setChannel(10);
		}else{
			setChannel(n-1);
		}
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	
}
