package MyJava;

import java.util.Scanner;

public class UseSwitch {

	public static void main(String[] args) {
		
		Scanner scanIt = new Scanner(System.in);
		
		System.out.println("선풍기 풍속을 조절합니다.");
		System.out.println("1번 : 약, 2번 : 중, 3 : 강");
		//변수를 만듭니다.
		int TurnOn = scanIt.nextInt();
		//switch문을 사용합니다.
		switch(TurnOn) { 
		case 1: System.out.println("약한 바람이 나옵니다.");
		break;
		case 2: System.out.println("중간 바람이 나옵니다.");
		break;
		case 3: System.out.println("강한 바람이 나옵니다.");
		//break;
		default: System.out.println("다른 값을 눌렀습니다.");
		}

	}

}

