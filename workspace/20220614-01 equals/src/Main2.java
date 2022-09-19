//컵라면
//제조사
//이름
//가격

//생성자, 게터세터

//Override
//toString
//equals - 제조사와 이름이 같으면 

public class Main2 {

	public static void main(String[] args) {
		Noodle a = new Noodle ("왕뚜껑", "팔도", 500);
		Noodle b = new Noodle ("왕뚜껑", "팔도", 1000);
		
		if (a.equals(b)) {
			System.out.println("동일한 제조사와 이름입니다.");
		}else {
			System.out.println("동일한 제조사와 이름이 아닙니다.");
		}
		
		System.out.println(a.toString());
		System.out.println(b.toString());
	}
}
