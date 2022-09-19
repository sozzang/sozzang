//Queue : 맨 앞에 있는거 빼고 추가하는 것은 맨 뒤에 추가
//queue.add,queue.offer 추가
//queue.poll,queue.remove 삭제
//LinkedList는 List,	Queue를 implements 하고있다
//poll,remove는 맨 앞에 있는 원소를 꺼내어줌

import java.util.LinkedList;
import java.util.Queue;

public class Main3 {
	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();
		queue.add("원소1");
		queue.offer("원소2");
		// 마지막에 추가하는 것
		// offer는 queue에만 있음

		System.out.println(queue);

		String elem1 = queue.poll();
		String elem2 = queue.remove();
		//맨 앞에꺼 꺼내오는것
		//poll은 queue에만 있음
		//큐에 원소가 없으면 remove는 예외발생, poll은 null반환

		System.out.println(elem1);
		System.out.println(elem2);
		
		System.out.println(queue.size());
	}
}
