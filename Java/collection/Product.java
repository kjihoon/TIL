package collection;

class Product implements Comparable <Product> {
	private String productID,productName;
	private int productPrice;
	
	Product(String productID,String productName,int productPrice){
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

	public int compareTo(Product p) {
		int result = 0;
		if (productPrice<p.productPrice){
			result=1;
		}else if (productPrice>p.productPrice){
			result=-1;
		}
		return result;
	}

}
