public class Add{
    public static void main(String[] args){
        //int: 정수형 data type(자료형)
    	//int라는 자료형 상자를 한개 만들어서 x 라는 변수를 쏙~ 저장
        int x; //변수 선언 
        int y;
        int sum;
        
        //초기화(initialize):변수 선언 후 초기값을 설정
        x = 100; //'='은 같다가 아닌 오른쪽에 있는 것을 왼쪽으로 집어넣는다. 대입연산자(assignment)
        y = 200;
        sum = x + y;

        System.out.println(sum);
        System.out.println(x - y);
   

         int minus;
         minus = x - y;
         System.out.println(minus);
		 
         // x 연산 y 로 출력해줘도 되지만 minus,sum 등을 선언해주면
         //코드가 많아졌을 때 사용하기 용이
    }
}