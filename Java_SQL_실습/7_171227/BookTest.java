package day7;


class Book{
	String title;
	String author;
	int	price;
	public String getBookInfo() {
		return title+" "+author+" "+price;
	}
	Book(){ 
	}
	Book(String title,String author,int	price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
}



public class BookTest {

	public static void main(String[] args) {
		
		Book [] bookk = new Book[5];
		
		bookk[0] = new Book("Java¿« ¡§ºÆ","≥≤±√",30000);
		bookk[1] = new Book("C++","≥≤±√πŒ",25000);
		bookk[2] = new Book("C","≥≤±√πŒ",25000);
		bookk[3] = new Book("R","≥≤±√πŒ",25000);
		bookk[4] = new Book("Pyyhon","≥≤±√πŒ",25000);
		
		for (Book b:bookk) {
			System.out.println(b.getBookInfo());
		}
		
		
	}

}
