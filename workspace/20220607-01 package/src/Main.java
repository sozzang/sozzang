//자바는 클래스를 찾을때 같은 패키지에서  찾기때문에 
//InPackageClass test = new InPackageClass();
//AnotherClass test2 = new AnotherClass();가 불가하기때문에 
//import를 사용하여 표현한다.

import first.InPackageClass;
import first.second.AnotherClass;

public class Main {
	private static void name() {
		InPackageClass test = new InPackageClass();

		AnotherClass test2 = new AnotherClass();
		test2.number = 10;
//		test2.mySecret = 22;
//		test.test = 33;
	}
}
