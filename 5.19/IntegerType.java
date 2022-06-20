public class IntegerType{
	public static void main (String[] args){
		byte b = 100;
		short s = 30000;
		int i = 10_000_000; // 실생활에서 쓰는 , 는 컴파일 에러가 나기 때문에 _ 로 대신함
		long l = 123456789L;//long값임을 인지시키기 위해 L을 붙여줌 
		
		long sum = 100 + 100L;
		
		
		/*byte b2 = 100;
		
		byte sum = b + b2;
		System.out.println(sum);*/
	}
}