import java.math.BigDecimal;
import java.math.BigInteger;

public class Main4 {

	public static void main(String[] args) {
//		System.out.println(Long.MAX_VALUE);
		//long 이상의 큰 범주를 나타내고 싶을 때 BigInteger 사용
		
		BigInteger value1 = new BigInteger("9223372036854775808");
		//문자열이지만 숫자처럼 표현할 수 있다.
        System.out.println(value1.add(new BigInteger("10")));
        
        //주의 : value1은 변하지않는 상태값이다. 못바꾼다.
        
        BigDecimal dec = new BigDecimal ("0.123456789");
        //긴~ 실수형을 나타내고싶을 때 , 정확한 소수점을 나타내고싶을 때
        System.out.println(dec);
        
        //BigDecimal d = new BigDecimal(0.1);
        //주의:실수형을 알고싶다고 실수 0.1를 넣으면 안됨, 문자열로 입력
	}

}
