
//동물원 관리
//동물 - 종 나이 몸무게
//직원- 역할(조련사,경영 등), 이름
//조련사는 동물들을 담당

//동물은 육식/초식으로 나누어서 관리
//주식으로 분류하여 동물 목록을 볼 수 있다.
//조련사 담당에 따라 동물 목록을 볼 수 있다. (담당자가 없는 동물도 볼 수 있어야함)
//instanceof 클래스,인터페이스 둘 다 구분가능


import java.util.Arrays;
import java.util.Scanner;

class Zootopia {
	public Animal[] a = new Animal[5]; // 밖에서 필드값으로 있어야함

	public void set() { // 메소드(동작)
		Animal a1 = new Meat("사자", 5, 77, "meat", "박소현");
		Animal a2 = new Meat("호랑이", 1, 47, "meat", "박소현");
		Animal a3 = new Grass("거북이", 145, 24, "grass", "김효정");
		Animal a4 = new Grass("토끼", 5, 11, "grass", "김효정");
		Animal a5 = new Grass("기니피그", 4, 5, "grass", "김효정");

		a[0] = a1; a[1] = a2; a[2] = a3; a[3] = a4; a[4] = a5;
		
		Animal[] newa = Arrays.copyOf(a, a.length + 1 ); //배열복사 + 추가 
		
	}

	public void settingZoo() {

		Scanner scan = new Scanner(System.in);
		Zootopia zoooo = new Zootopia();

		zoooo.set();
		System.out.println("동물원 관리 프로그램입니다.");
		System.out.println("1.모든 동물 보기" + "," + "2.육식동물로 보기" + "," 
		+ "3.초식동물로 보기" + "," + "4.담당자별로 보기");
		
		int p = scan.nextInt();

		if (p == 1) {
			for (int i = 0; i <= 4; i++) {
				System.out.println(zoooo.a[i].toString());
			}
		}

		if (p == 2) {
			for (int i = 0; i <= 4; i++) {
				if (zoooo.a[i] instanceof Meat) {
					System.out.println(zoooo.a[i]);
				}
			}
		}

		if (p == 3) {

			for (int i = 0; i <= 4; i++) {
				if (zoooo.a[i] instanceof Grass) {
					System.out.println(zoooo.a[i]);
				}
			}
		}
		if (p == 4 ) {
			System.out.println("1.박소현" + "2.김효정");
		
		}
		
	}
	
}

public class Zoo {

	public static void main(String[] args) {
		Zootopia z = new Zootopia();
		z.settingZoo();
	}

}
