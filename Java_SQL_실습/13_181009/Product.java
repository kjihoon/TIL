package collection;

public class Product {
	private String productID,productName,productPrice;
	
	Product(String productID,String productName,String productPrice){
		this.productID=productID;
		this.productName=productName;
		this.productPrice=productPrice;
		
	}
	public boolean equals(Object obj){
		if (obj instanceof Product){
			Product tmp = (Product) obj;
			return productID.equals(tmp.productID);
		}
		return false;
	}
	public int hashCode(){
		return productID.hashCode(); 
	}
	public String toString(){
		return productID +"\t" +productName+"\t" +productPrice;
	}
}
