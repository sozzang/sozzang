public class Class { //없는 Class클래스를 만듦
	private Student s1; 
	private Student s2; 
	private Student s3; 
	//Student클래스를 Class의 필드값으로 불러옴
	
	//생성자1
	public Class(Student a, Student b, Student c) {
		s1 = a;
		s2 = b;
		s3 = c;
	}
	
	//메소드1:
	public void printAllName() {
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		System.out.println(s3.getName());
	}
	
	//메소드 
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

