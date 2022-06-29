// 3. 영화
// 필드 : 제목, 평점, 감독, 발표된 연도
// 모든 값을 콘솔 출력하는 기능

public class Mov {
	
	String title;
	String grade;
	String director;
	int year;
	
	public Movie(String t, String g, String d, int y){ //생성자 
	    //필드 초기화
		title = t;
		grade = g;
		director = d;
		year = y;
		
	}
    void printAll(){
	System.out.println("제목: " + title);
    System.out.println("평점: " + grade);
	System.out.println("감동: " + director);
	System.out.println("발표연도: " + year);
	 
	}
}
	
	public class GetMov{
		public static void main(String[] args){
			Mov m = new movie("영화", "3점", "박소현", 2022년);
			m.printAll();
			// Mov movie = new Mov();
			// movie.title = "Inside out";
			// movie.grade = "★9.05";
			// movie.director = "Pete Docter";
			// movie.year = 2015;
			// movie.printAll();
		
	}
}