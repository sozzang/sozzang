import java.util.*;

public class Manager {
	private Class c;

	public Student inputStudent() { // ★리턴으로 Student를 받는다는것!!
		Scanner scan = new Scanner(System.in);
		System.out.println("학생의 이름, 국영수 순으로 입력해 주세요");
		String name = scan.nextLine();
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();

		return new Student(name, kor, eng, math);
	}

	public void start() {
		Student s1 = inputStudent();
		Student s2 = inputStudent();
		Student s3 = inputStudent();

		c = new Class(s1, s2, s3);

		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴");
		System.out.println("1.학생이름보기 2.총 평균 보기 3.1등보기");
		int num = scan.nextInt();

		if (num == 1) {
			c.printAllName();
		} else if (num == 2) {
			System.out.println("총 평균" + c.classAver());
		} else if (num == 3) {
			Student top = c.highStudent();
			System.out.printf(c.highStudent().getName(), c.highStudent().getAver());
		}
	}
}