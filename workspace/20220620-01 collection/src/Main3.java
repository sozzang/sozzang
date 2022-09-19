//ArrayList은 상속구조로 만들어짐. 부모: List
//왼쪽에 <Integer> 선언해두었으면 오른쪽 제네릭에서는 생략해도 됨
//List의 형태로도 사용할 수 있다
//list의 다양한 기능들(add, set, contains, indexOf, remove,삽입,clear)
//ArrayList 와 List 의 차이 ?
//ArrayList가 쓰기 좀 더 복잡하니까 List로 추상적이게 쓰자!
import java.util.List;
import java.util.ArrayList;

public class Main3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		// 위의 리스트에 10,20,30,40
		// 모든 원소들을 출력해보기
		
		for (int i = 1; i <= 4; i++) {
			list.add(i * 10);
		}
		System.out.println(list.toString());
		// toString이 오버라이드되어 있어서 문자열으로 출력이 가능하다.

//		// 첫번째 인덱스 20을 15로 바꾸고 싶을 때?
//		list.set(1, 15); // list.set(index,Integer);
//		System.out.println(list);
//		
//		//20이 있는지 없는지 확인하고 싶을 때?
//		System.out.println(list.contains(20));
//		//있으면 true, 없으면 false
//		System.out.println(list.indexOf(30));
//		//있으면 2, 없으면 -1
//		
//		//원하는 인덱스를 제거하고 싶으면?
//		list.remove(2);
//		System.out.println(list);
//		//두번째 인덱스의 번호가 사라지고 우측의 원소들의 인덱스가 한 칸씩 줄어듦
//		//한칸씩 땡겨와진다고 생각하면 됨
//		
//		//원하는 인덱스에 원하는 원소를 넣고싶으면?
//		list.add(0,0); //list.add(index,Integer)
//		System.out.println(list);
//		//0번째 인덱스가 추가되면서 우측의 원소들의 인덱스가 한 칸씩 밀려남 
//		
//		//모든 값을 삭제하고 싶으면?
//		list.clear();
//		System.out.println("지운 결과: " + list);
//		System.out.println(list.size() == 0); //사이즈가 0이면 비어있으니까!
//		System.out.println(list.isEmpty());
//		//지워졌는지 확인할 수 있는 방법들 

	}
}
