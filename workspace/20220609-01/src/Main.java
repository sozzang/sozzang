/*
 * 도서 관리 프로그램
 * 
 * 목록 보기
 * 1. 가격순으로(오름차순, 내림차순 선택가능)
 * 2. 분야를 선택해서 해당 분야만 보기
 */

// 1. 작별인사                / 김영하 / 복복서가 / 장편소설 / 12,600원
// 2. 불편한 편의점                / 김호연 / 나무옆의자 / 장편소설 / 12,600원
// 3. 지금 알고 있는 걸 그때도 알았더라면    / 류시화 / 열림원 / 시집 / 8,100원
// 4. 코스모스                  / 칼 세이건 / 사이언스북스 / 과학 공학 / 16,650원
// 5. 여행의 이유               / 김영하 / 문학동네 / 에세이 / 12,150원

import java.util.Scanner;

public class Main {
	public class BookList {
		Book[] books = new Book[5];

		Book b1 = new Book("작별인사", "김영하", "복복서가", "장편소설", 12600);
		Book b2 = new Book("불편한 편의점", "김호연", "나무옆의자", "장편소설", 12600);
		Book b3 = new Book("지금 알고 있는 걸 그때도 알았더라면", "류시화", "열림원", "시집", 8100);
		Book b4 = new Book("코스모스", "칼 세이건", "사이언스북스", "과학 공학", 16650);
		Book b5 = new Book("여행의 이유", "김영하", "문학동네", "에세이", 12150);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("목록보기");
		System.out.println("1.가격순 2.분류별 3.상세보기 4.도서정보수정 5.도서정보추가");
		int a = scan.nextInt();
		if (a == 2) {
			System.out.println("1.장편소설 2.시집 3.과학 공학 4.에세이");
			int b = scan.nextInt();
			if (b == 1) {
				for(int i = 0; i <= 5; i++);{
					
				}
				
			}
		}
	}

	}


