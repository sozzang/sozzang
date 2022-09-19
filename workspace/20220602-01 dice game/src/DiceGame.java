import java.util.*;

class DiceGame {
	int diceFace; //필드 
	int userGuess;//필드

	private void rollDice() { //메소드
		diceFace = (int) (Math.random() * 6) + 1;
	}   // (int)를 붙인 이유? int형으로 변환하겠다.
		// 객체를 만들지 않고도 자바 자체에서 호출할 수 있는 
	    // Math클래스는 랜덤된 숫자를 만드는 메소드인데 
	    // 더 쉽게 하려면
		// Random randome = new Random();
		// diceFace = random.nextInt(6) + 1;

	private int getUserInput(String prompt) {
		//리턴타입 int 
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}

	private boolean checkUserGuess() {
		if (diceFace == userGuess) {
			System.out.println("정답");
			return true;
		} else {
			System.out.println("땡");
			return false;
		}
	}

	public void startPlaying() {
		while(true) {
		userGuess = getUserInput("예상값을 입력하세요: ");
		// getUserInput을 호출하면 int 값을 만들어서 준다.
		rollDice();
		boolean result = checkUserGuess();
		if(result) {
			break;
		}
		}
	}
}
