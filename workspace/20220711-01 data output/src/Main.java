import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student implements Serializable {
	//직렬화가 가능하게 인터페이스 구성해줌(implements Serializable)
	//직렬화에서 빼고싶은 것은 private 'transient' String name; 으로 만들어주면 됨 
	
	private String name;
	private int age;
	private double score;

	public Student(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

}

public class Main {

	public static void main(String[] args) {
		// 학생
		// 이름:문자열
		// 나이:정수
		// 학점:실수

		BufferedReader br = null;
		List<Student> list = new ArrayList<>();

		try {
			br = new BufferedReader(new FileReader(new File("d:\\filetest\\student.txt")));

			while (true) {
				String name = br.readLine();
//		     	String age = br.readLine(); //사실 얘는 int형
//			    String score = br.readLine(); //사실 얘는 double형이니까 형변환해주자
				int age = Integer.valueOf(br.readLine());
				double score = Double.valueOf(br.readLine());

				Student s = new Student(name, age, score);
				list.add(s);
				//학생 s를 list에 담기
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println(list);

		//학생리스트를 파일로서 관리하고자 하는 상황
		// 파일에 자바 객체를 나타내야하므로 학생이름과 정보를 문자열 자체로 표현
		// "홍길동,22,2.5" or "홍길동/22/2.5"처럼 구분할 수 있는 기호로 구분해주기
		// 여기서는 한 줄씩
//		List<Student> list = new ArrayList<>(
//				Arrays.asList(new Student("홍길동", 22, 2.5), new Student("둘리", 33, 3.3), new Student("도우너", 44, 4.4)));
//
//		PrintWriter pw = null;
//
//		try {
//			pw = new PrintWriter(new File("d:\\filetest\\student.txt"));
//
//			for (int i = 0; i < list.size(); i++) {
//				Student s = list.get(i);
//				pw.println(s.getName());
//				pw.println(s.getAge());
//				pw.println(s.getScore());
//			}
//			pw.flush();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			pw.close();
//		}

	}

}
