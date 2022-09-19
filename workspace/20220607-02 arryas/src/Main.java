//Array,배열: 같은 타입의 변수들의 모임
//변수를 몇개를 사용할건지 알려주면 그 개수만큼의 공간을 만들어 배열에 대한 한개의 이름을 붙임
//긴~ 칸 하나를 원하는 칸의 개수로 나누어 순서(index,0부터~)대로 사용

public class Main {
	public static void main(String[] args) {
		int[] aBox; //정수형 배열 변수 선언 int 타입을 선언해준 것.
		aBox = new int[4];
		//길이가 4인(4개의 원소를 가지는) 배열 객체 생성, 초기화 
		//길이는 한번 정해두면 상수로서 추후 변경할 수 없음
		System.out.println("배열의 길이값: " + aBox.length);
		//aBox.length 배열(칸)의 길이를 알 수 있음
		
		aBox[0] = 56;
		aBox[1] = 57;
		aBox[2] = 58;
		aBox[3] = 59;
		//원소는 배열 한 칸에 들어가 있는 것 56, 57, 58
		
		System.out.println(aBox[0]);
		System.out.println(aBox[1]);
		System.out.println(aBox[2]);
		System.out.println(aBox[3]);
		//인덱스는 0부터 !! 인덱스의 범위는 배열의 길이 -1 이다.
	}

}
