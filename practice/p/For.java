package practice.p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class For {
	public static void main(String[] args) {
		For main = new For();
//		List<Map> list = main.factorialList();

//		main.factorial();
//		main.factorialw();
//		main.factorialDo();
		
		main.list();


	}

	public For() {
	}
	
    //팩토리얼 list
	public void list() {
	List<Fact> list = factorialList();
		
		for(int i = 0; i < list.size(); i++) {
//			String strMul = list.get(i).getMul().toString();
//			String strResult = list.get(i).getResult().toString();
			
//			System.out.println(stri + "*" + strMul + "=" + strResult);
			System.out.println(list.get(i));
		}
	}

    //팩토리얼 map 
	public List<Fact> factorialList() {
		List result = new ArrayList();
		int mul = 1;
//		for (int i = 1; i <= 10; i++) {
//			Map map = new HashMap();
//			map.put("i", i);
//			map.put("mul", mul);
//			mul = mul * i;
//			map.put("result", mul);
//
//			result.add(map);
//		}
		for (int i = 1; i <= 10; i++) {
			Fact fact = new Fact();
			fact.setInter(i);
			fact.setMul(mul);
			fact.setResult((mul * i));
			mul = fact.getResult();
			result.add(fact);
		}
		return result;
	}
	//팩토리얼 for, while, dowhile
	public void factorial() {
		int i;
		int mul = 1;

		for (i = 1; i <= 10; i++) {
			System.out.print(i + "*" + mul);
			mul = mul * i;
			System.out.println("=" + mul);
		}
	}
	//팩토리얼 while
	public void factorialw() {
		int i = 1;
		int mul = 1;
		while (i <= 10) {
			System.out.print(i + "*" + mul);
			mul = mul * i;
			i++;
			System.out.println("=" + mul);
		}
	}
	//팩토리얼  dowhile
	public void factorialDo() {
		int i = 1;
		int mul = 1;
		do {
			System.out.print(i + "*" + mul);
			mul = mul * i;
			i++;
			System.out.println("=" + mul);
		} while (i <= 10);

	}
	
	class Fact  {
		private int inter = -1;
		private int mul = -1;
		private int result = -1;
		
		public Fact() {
			
		}
		public Fact( int inter, int mul ) {
			this.inter = inter;
			this.mul = mul;
			this.result = mul * inter;
		}
		public void calcu() {
			this.result = mul * inter;
		}
		public int getInter() {
			return inter;
		}
		public void setInter(int inter) {
			this.inter = inter;
		}
		public int getMul() {
			return mul;
		}
		public void setMul(int mul) {
			this.mul = mul;
		}
		public int getResult() {
			return result;
		}
		public void setResult(int result) {
			this.result = result;
		}
		
		@Override public String toString() {
			return inter + " * " + mul + " = "  + mul;
		}
		
	}

}
