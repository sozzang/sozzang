public class LoopBreak {
	public static void main(String [] args){
		for (int i = 0; i < 10; i++){
			if(i == 5) {
				break; //개발자들의 선호도가 낮음
			}
			System.out.println(i);
		}
		System.out.println("프로그램 종료");
	}
	for(int i = 10; i < 20; i++){
		if(i % 10 == 5){
			continue;
		}
		System.out.println(i);
	}

	int i = 20;
	while (i < 30){
		if(i == 25){
			continue;
		}
		System.out.println(i);
		i++;
	}
		System.out.println("프로그램 종료");
	}
}