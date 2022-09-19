//드라이브에 파일을 기록하는 데 있어서 알아서 구역을 나눠서 기록하지만 
//우리도 다시 접근하기 위해서는 기록을 해야함 그러려면 폴더라는 기준으로 나누고 
//폴더와 파일에 고유한 이름을 부여한다. 
//실제 내용을 가지고 있는 파일1은 각각 크기 즉 용량을 가지고 있다.
//춘식이가 어떤 종류의 파일인지를 구분하기 위해 확장자가 있다. .png .jpg .txt .hwp 등 
//다시 접근할 때 알맞는 확장자를 컴퓨터에서 알아서 연결해준다.
//우리가 작성한 sw는 실행 시에 드라이브와 무관하게 다른 영역에서 동작한다.
//다시 외부의 드라이브 쪽으로 가야 접근 가능하다.

//그러므로 통로 역할을 하는 추상적인 객체를 불러오며 접근하고자하는 폴더와 파일을 () 속에 적어주면
//짜잔 ~ 통로를 통해 연결이 된다.
//드라이브와 폴더가 다르면 파일이름은 다를 수 있다. 


import java.io.File;

public class Main {

	public static void main(String[] args) {
		
//		File file = new File("d:\\sohyun\\5.23.hwp"); 
//		//윈도우 경로는 \\백슬래쉬 두개~ , 슬래쉬는 url임 
//		System.out.println(file.getName());
//		System.out.println(file.getPath());
//		System.out.println(file.exists());
		
//		File file2 = new File("d:\\sohyun\\asd.hwp");
//		//소통할 수 있게 통로 역할을 하는 추상적인 객체(실제파일은 아님)
		//asd파일이 없어도 추상적인 객체이므로 표현은 가능하다~
//		System.out.println(file2.getName());
//		System.out.println(file2.getPath());
//		System.out.println(file2.exists());

		
		File dir = new File ("d:\\sohyun"); 
		System.out.println(dir.getName());
		System.out.println(dir.getPath());
		System.out.println(dir.exists());
		
		//폴더, 파일을 다 가리킬 수 있어서 파일인지 디렉토리(폴더)인지 확인할 수 있음
		System.out.println("파일인가요?" + dir.isFile());
		System.out.println("디렉토리인가요?" + dir.isDirectory());
		
	}

}
