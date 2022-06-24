public class Loop2 {
	public static void main(String[]args) {
	
	/* 1~10000까지
	
	int i = 1;
	while (i <= 10000){
		System.out.println(i);
		i++;
	} */
	

	/*20~29까지
	
	int i = 20;
	while ( i <= 29){
		System.out.println(i);
		i++;
	}
	*/
	
	/* 10 9 8 ~ 0까지
	
	int i = 10;
	
	while(i >= 0){
		System.out.println(i);
		i--;
	}
	*/
	

	/*3의 배수를 출력해보세요.
	
	int i = 3;
	while(i < 100){
		System.out.println(i);
		i += 3;
	}
	*/
	

	  
	  //☆ 
	  //★ 2
	  //☆ 
	  //★ 4
	  //☆ 
	  //★ 6
	  //☆ 
	  //★ 8
	  	
	   int s = 0 ;
	  while (s <= 7) {
      System.out.println((s % 2 ==0) ? "☆" : "★"); //s가 짝수면 빈 별 , 아니면 찬 별 //삼항연산자
     s++;
	  }
	  
	}

}