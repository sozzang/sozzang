import java.util.Arrays;

public class StudentTest {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("홍길동", 3.39);
		students[1] = new Student("임걱정", 4.21);
		students[2] = new Student("황진이", 2.19);
		
		Arrays.sort(students);
		//원시형타입은 대소비교를 잘 파악할 수 있지만
		//student는 우리가 만든 클래스라 기준을 모르고 있다가
		//대소를 비교할 수 있는 compareTo를 구현해주면
		//기준이 정해져 비교를 하고 정렬을 할 수 있다.
		for (Student s : students) {
			System.out.println("이름=" + s.getName() + " 평점=" + s.getGpa());
		}
	}
}

class Student implements Comparable {
	private String name;
	private double gpa;
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}
	public String getName() {
		return name;
	}
	public double getGpa() {
		return gpa;
	}
//	public int compareTo(Object obj) {
//		Student other = (Student) obj;
//		if (gpa < other.gpa) {
//			return -1;
//		} else if (gpa > other.gpa) {
//			return 1;
//		} else {
//			return 0;
//		}
//	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}