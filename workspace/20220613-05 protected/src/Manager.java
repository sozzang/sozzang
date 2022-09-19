//자식클래스

public class Manager extends Employee {
	
	public Manager(String name, String address, int salary, int RRN) {
		super(name, address, salary, RRN);
		this.bonus = bonus;

	}

	public Manager() {
		super(); //생략가능
		//부모에 기본생성자가 없으면 컴파일에러남
	}

	private int bonus;

	public void printSalary() {
		System.out.println(name + "(" + address + "):" + (salary + bonus));
	}

	public void printRRN() {
	
		//System.out.println(RRN)은 private으로 접근제한되어있어서 컴파일 에러
	}
}
