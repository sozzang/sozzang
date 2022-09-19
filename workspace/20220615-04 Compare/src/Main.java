import java.util.Arrays;

//인터페이스 구현에서  대소비교할 수 있을까?
//Comparable 인터페이스
//Comparable 인터페이스는  compareTo 메소드를 가진다.
//작은수에서 큰수로, 알파벳 순서대로, 가나다 순서대로 정렬
//<> 제네릭 안에 원하는 클래스를 넣으면 그 클래스로 비교를 할 수 있도록 제한해준다.

class Member implements Comparable<Member> {

	String name; // 이름
	int height; // 키
	int weight; // 몸무게

	public Member(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Member o) {
		// compareTo메소드
		return (this.height - o.height);
		// 나.compareTo(너) //
		// 나 = 너 -> 0, 나 < 너 -> 음수, 나 > 너 -> 양수
	}

}

public class Main {
	public static void main(String[] args) {
		Member[] members = { new Member("키큰놈", 190, 60), new Member("작놈", 120, 34), new Member("보통", 170, 60) };
		System.out.println(members[0].compareTo(members[1]));
		Arrays.sort(members);
		for (Member m : members)
			System.out.println("이름" + m.name + "키" + m.height + "몸무게" + m.weight);
		// for-each문으로 전부 순서대로 배열했다.
	}
}
