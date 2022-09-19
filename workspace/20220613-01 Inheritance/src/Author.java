//자식 클래스 


public class Author extends Person{

	private String bookList; //부모에는 없는 작품 필드생성
	
	public Author(String name, int age, String bookList) {
		super(name, age); 
		//부모클래스에 존재하는 name과age는 super를 통해 호출됨
		this.bookList = bookList; 
		//자식클래스에만 있는 bookList 생성자 추가
	}
	
	public String getBookList() {
		return bookList; 
	}
}
