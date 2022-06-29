// 1. class Book
// 필드(상태) : 제목, 저자
// 메소드(기능) 제목과 저자를 콘솔에 출력 가능

class Book {
	String title;
	String author;
	
	void printAll(){ //호출할 것이 없으면 void 
		System.out.println ("제목: " + title);
		System.out.println ("저자: " + author);
		}

}

public class BookTest{
	public static void main(String[] args){
		Book mybook = new Book(); 
		mybook.title = "불편한 편의점";
		mybook.author = "김호연";
		mybook.printAll();
		
		Book book2 = new Book();
		book2.title = "power java";
		book2.author = "천인국";
		book2.printAll();
		
		book2.author = "천인국, 하성호";
		book2.printAll();
		
	}
}