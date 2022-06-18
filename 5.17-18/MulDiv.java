public class MulDiv{
    public static void main(String[] args){
        //System.out.println("ABC" - 5); 
    	//문자열과 정수는 연산할 수 없어서 에러
    	
        System.out.println(50 / 0);
        //int형이지만 '0'으로는 나눌 수 없어서 에러


        System.out.println("10 곱하기 5는" + (10 * 5));
        System.out.println("22 나누기 4는" + (22 / 4));
        System.out.println("22 나누기 4는" + (22.0 / 4.0));

        System.out.println("프로그램 정상 종료");
    }

}