
public class Class {
	private Student s1; //만들어둔 Student 클래스 사용
	private Student s2; 
	private Student s3; 

	
	public Class(Student a, Student b, Student c) {
		s1 = a;
		s2 = b;
		s3 = c;
	}
	
	public void printAllName() {
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		System.out.println(s3.getName());
	}
	
	public int classAver() {
		return (s1.getAver() + s2.getAver() + s3.getAver()) / 3;
		
	} 
	
	
	public Student highStudent() {
		
		Student high;
	
		if(s1.getAver() < s2.getAver()) {
			high = s2;
		}else { high = s1;
		}
		
		if(high.getAver() < s3.getAver()) {
			high = s3;
		}
		
		return high;
		}
	}

