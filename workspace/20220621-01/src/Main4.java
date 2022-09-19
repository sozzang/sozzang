//Stack: 제일 먼저 들어간 것이 나중에 나옴 
//Deque인터페이스를 사용

import java.util.Deque;
import java.util.LinkedList;

public class Main4 {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<>();
		stack.push("10");
		stack.push("20");
		stack.push("30");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	
		
	}
}
