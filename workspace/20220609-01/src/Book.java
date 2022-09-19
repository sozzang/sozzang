
public class Book { //없는 Book 클래스를 만든
	private String title;
	private String author;
	private String publisher;
	private String category;
	private int price;

	public Book(String t, String a, String p, String c, int pr) {
		this.title = t;
		this.author = a;
		this.publisher = p;
		this.category = c;
		this.price = pr;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String t) {
		this.title = title;
		
	}
	
	public String getAuthor() {
		return title;
	}
	public void setAuthor(String a) {
		this.author = author;
		
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String p) {
		this.publisher = publisher;
		
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String c) {
		this.category = category;
		
	}
	public int getPrice() {
		return price;
	}
	public void setPice(String pr) {
		this.price = price;
		
	}
	
	public String toString() {
		return(title + "/" + author + "/" + publisher + "/" + category + "/" + price);
		
	}
	
}
