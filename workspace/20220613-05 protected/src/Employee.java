//부모클래스

public class Employee {
	public String name; // 이름: 공용멤버
	String address;// 주소: 패키지 멤버
	protected int salary; // 월급: 보호멤버
	private int RRN;// 주민등록번호 : 전용멤버
	//위에서 아래로 갈 수록 엄격하게 제한
	
	public Employee() {
		
	} //기본생성자

	public Employee(String name, String address, int salary, int RRN) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.RRN = RRN;
	}

	public String toString() {
		return name + "," + address + "," + RRN + "," + salary;
	}
}
