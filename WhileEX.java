package MyJava;

import java.util.Scanner;

public class WhileEX {
	
	public static void main(String[] args) { 
		
		Scanner scanIt = new Scanner(System.in);
		//num 값을 num1에 복사합니다.
		int num = scanIt.nextInt();
		int num1 = num;
		//while문이 시작됩니다.
		while(num > 0) { 
			//내부 num1을 사용합니다. num에 4를 넣었다면 4번 반복합니다.
			while(num1 >0) {
				System.out.print("*");
				num1--;
			}
			
			System.out.println();
			num--;
			//감소된 num값을 num1에 다시 복사합니다.
			num1 = num;
		}
		
	}
}

