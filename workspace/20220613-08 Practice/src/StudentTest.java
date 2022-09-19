

public class StudentTest {

	public static void main(String[] args) {
	Student s1 = new Student("박", 20141201, "가", "국문", 3);
	
	UnderGraduate s2 = new UnderGraduate("둘리", 123, "라" , "국문", 4, "독서");
		
	Graduate s3 = new Graduate("나", 12345,"몰라", "몰라요", 324, "연구조교", 3.3);
	
	System.out.println(s1.toString());
	System.out.println(s2.toString());
	System.out.println(s3.toString());
	
	

	}

}
