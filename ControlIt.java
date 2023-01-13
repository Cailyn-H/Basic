package MyJava;

import java.util.Random;
import java.util.Scanner;

public class ControlIt {

	public static void main(String[] args) {
		
		Scanner scanIt = new Scanner(System.in);
		Random rand = new Random();
		int comNum;
		int myNum;
		int sum = 0;
		int mul = 1;
		int retry;
		System.out.println("컴퓨터가 정해주는 한가지 숫자를 마추고"
				+ " 1부터 맞춘 값까지의 합과 곱을 "
				+ "결과값으로 도출해 보세요.");
		
		
		do {
			comNum = rand.nextInt(10) + 1;
		do { 
			System.out.print("컴퓨터가 원하는 값은 ? (1~10) : ");
			myNum = scanIt.nextInt();
		} while(comNum != myNum);
		
		for(int i = 1; i <= myNum; i++) { 
			sum += i;
			mul *= i;
		}
		System.out.println("합계는 " + sum + " 입니다.");
		System.out.println("총 곱은 " + mul + " 입니다."); 
		System.out.println("다시 숫자 게임을 하시겠습니까?");
		System.out.print("Yes - 1; No - 0");
		retry = scanIt.nextInt();
		if(retry == 1) { 
			sum = 0;
			mul = 1;
		}
		}while(retry == 1);
	}

}
