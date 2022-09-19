import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main4 {
	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

		Set<Integer> setUnion = new HashSet<>();
		setUnion.addAll(setA);
		setUnion.addAll(setB);
		System.out.println(setUnion);
		
		//교집합		
		Set<Integer> setDuplicate = new HashSet<>();
		setDuplicate.addAll(setA);
		setDuplicate.retainAll(setB);
		System.out.println(setDuplicate);

		//차집합
		Set<Integer> setLeftOuter = new HashSet<>();
		setLeftOuter.addAll(setA);
		setLeftOuter.removeAll(setB);
		System.out.println(setLeftOuter);
		
	}
}
