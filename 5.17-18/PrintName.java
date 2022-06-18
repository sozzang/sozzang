// 자기 이름 출력

public class PrintName{
    public static void main(String[] args) {
        System.out.println("박소현1");
        System.out.println("박소현2");
        System.out.println("박소현3");
        System.out.println("박소현4");
        System.out.println("박소현5");

        System.out.println("10" + "10"); 
        System.out.println("11" + "10");
        System.out.println("12" + "10");
        //큰따옴표 안에 들었으니 문자열로 인식하고 1010으로 출력
        //20의 결과를 바라면 절대 안됨

        System.out.println(20 + 20);
        System.out.println(21 + 20);
        System.out.println(22 + 20);
        //정수가 왔으니 연산 가능
        //20 + 20 = 40 이라는 원하는 연산이 가능하다


    }
}