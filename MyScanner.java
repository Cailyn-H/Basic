package MyJava;


//스캐너가 들어있는 곳에서 import(수입) 해옵니다.
import java.util.Scanner;

public class MyScanner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Scanner를 인스턴스를 생성해줍니다.
		//scan 이라는 이름에 Scanner 기능을 넣습니다.
		Scanner scanThis = new Scanner(System.in);
		
		System.out.print("X의 값은 ? : ");
		//x라는 상자에 scan.nextInt()
		// . 의 의미는 ~의 라고 해석합니다.
		//scan의 다음 인트값(키보드 입력값을 받습니다.
		int x  = scanThis.nextInt();
		System.out.print("Y의 값은 ? : ");
		int y  = scanThis.nextInt();
		
		System.out.println("더한 값은 " + (x + y) 
				+ " 입니다.");
		
	}

}
