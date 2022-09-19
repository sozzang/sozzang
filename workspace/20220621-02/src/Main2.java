//Main 연장선

// 학생
// 이름
// 나이

// (학생은 이름과 나이가 같으면 동일 학생입니다)

// 홍길동 15
// 둘리 22
// 도우너 33

// 위의 학생들을 원소로 가지는 리스트를 생성하고
// (도우너 33) 학생의 인덱스를 찾아보세요.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> { // 기준을 정해 비교할 수 있도록 Comparable
	private String name;
	private int age;
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	public int compareTo(Student o) {
		return score - o.score;
	}
}

public class Main2 {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 15, 90);
		Student s2 = new Student("둘리", 22, 80);
		Student s3 = new Student("도우너", 33, 80);

		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);

		System.out.println(list.indexOf(new Student("도우너", 33, 0)));

		// 정렬
		Collections.sort(list);
		System.out.println(list);
		// 가지고있는 원소가 학생인데 학생이라는 객체는 대소를 비교할 수 있는 (기준이 되는)능력이 없어서 에러
		// 기준을 정해야함.
		// 점수를 기준으로 하자!
		// 학생 클래스에서 Comparable<Student> 추가

		// 나이 순으로 정렬해보기
		Comparator<Student> comparator = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge() - o2.getAge();
			}
		};
		Collections.sort(list,comparator);
		System.out.println(list);
	}
}
