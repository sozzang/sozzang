//학급
//학생1,2,3
//1.3명의 학생의 이름을 콘솔에 출력
//2.학생 3명의 총 평균
//3.평균점수가 가장 높은 학생(참조)을 알려줄 수 있

public class TestStudent {

	public static void main(String[] args) {
		  Student my1 = new Student("김", 50, 80, 20);
	      Student my2 = new Student("박", 65, 65, 65);
	      Student my3 = new Student("윤", 80, 90, 95);
	      System.out.println(my1.getAver()); 
	      System.out.println(my2.getAver());
	      System.out.println(my3.getAver());
	      
	      Class cat = new Class(my1, my2, my3);
	      cat.printAllName();
	      
	      System.out.println(cat.classAver());
	      System.out.println(cat.highStudent().getName());
//	      my1.name = "길동";
//	      System.out.println(my1.name);
	     // my1.setName("길동");
	    //  System.out.println(my1.getName());
	}

}
