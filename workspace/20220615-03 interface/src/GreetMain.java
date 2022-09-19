
public class GreetMain {

	public static void main(String[] args) {

		Greetable s1 = new Kor();
		Greetable s2 = new Eng();
		Greetable s3 = new American();
		
		s1.greet();
		s2.greet();
		s3.greet();
	}

}
