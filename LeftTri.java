package MyJava;

import java.util.Scanner;

public class LeftTri {
	
	static void Triangle(int leng) { 
		
		for(int i = 0; i <= leng; i++) { 
			for(int j = 0; j < i ; j++) { 
				System.out.print(" ");
			}
			for(int j = leng; j > i; j--)  { 
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Scanner scanIt = new Scanner(System.in);
		
		
		System.out.println("오른쪽 위의 모서리가 90도인 삼각형을" 
				+ "만들어 보세요.");
		
		System.out.print("삼각형 세로줄의 길이는 ? :");
		int leng = scanIt.nextInt();
		
		Triangle(leng);
	}
}

