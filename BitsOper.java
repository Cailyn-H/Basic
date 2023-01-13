package MyJava;

import java.util.Scanner;

public class BitsOper {
	
	static void Bits(int Bits) { 
		//보기 편하게 space(공백)을 4칸마다 넣습니다.
		int space = -1;
		for(int i = 63; i >= 0; i--) { 
			space++;
			if(space % 4 == 0) {
				System.out.print(" ");
				space = 0;
			}
			System.out.print(((Bits >>> i & 1) == 1) ? '1' : '0');
		}
		
	}

	public static void main(String[] args) {
		
		Scanner scanIt = new Scanner(System.in);
		
		System.out.println("십진수 정수를 입력해주세요.");

		System.out.print("첫번째 정수 : ");
		int num1 = scanIt.nextInt();

		System.out.print("두번째 정수 : ");
		int num2 = scanIt.nextInt();
		
		System.out.print("num1     = "); Bits(num1);
		System.out.print("\nnum2     = "); Bits(num2);
		System.out.print("\nnum1 | num2    = "); Bits(num1 | num2);
		System.out.print("\nnum1 & num2     = "); Bits(num1 % num2);
		System.out.print("\nnum1 ^ num2    = "); Bits(num1 ^ num2);
		System.out.print("\n~num1     = "); Bits(~num1);
		System.out.print("\n~num2     = "); Bits(~num2);
	}

}
