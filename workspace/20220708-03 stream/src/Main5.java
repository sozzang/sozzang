//BufferedReader

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main5 {
	public static void main(String[] args) {
		// 파일 생성 (직접 손으로)
		// persons.txt
		// 파일 정보를 한 줄씩 읽어서
		// 1. 콘솔 출력
		
		// 2. 사람 평균 나이 구해서 콘솔 출력
		
		File file = new File("d:\\filetest\\persons.txt");
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			int sum = 0;
			int count = 0;
			String line;
			while ( (line = br.readLine()) != null ) {
				//readLine한 줄 씩 읽음, 파일의 끝을 null값으로 반환
				System.out.println(line);
				
				int index = line.indexOf(','); 
				//, 을 기준으로 잘라 
				String strAge = line.substring(index + 1);
				//, 의 인덱스 다음부터가 숫자임
				Integer age = Integer.valueOf(strAge);
				//Integer.valueOf();를 통해 문자열을 int형으로 바꿔줘야함
				System.out.println("숫자변환 결과 : " + age);
				sum += age;
				count++;
			}
			System.out.println("평균 나이 : " + sum / count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close(); //자원해제
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
