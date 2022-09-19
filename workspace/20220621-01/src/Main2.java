import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));

		list.remove(0);

		list.remove("C");

		LinkedList<String> list2 = new LinkedList<>(list);
		list2.addFirst("asdf");
		list2.removeFirst();
		list2.getFirst();
		//LinkedList에 추가로 있는 메소드들
	}
}
