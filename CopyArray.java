package MyJava;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		
		Scanner scanIt = new Scanner(System.in);
		
		int num;
		
		System.out.println("배열을 복사해 봅시다.");
		
		System.out.print("배열 A의 칸 갯수는 ? :");
		num = scanIt.nextInt();
		int[] ArrayA = new int[num];
		int[] ArrayB = new int[num];
		
		for(int i = 0; i < ArrayA.length; i++) { 
			System.out.print("A배열 A [" 
				+ i + "] = " );
			ArrayA[i] = scanIt.nextInt();
		}
		
		for(int i = 0; i < ArrayA.length; i++) { 
			ArrayB[i] = ArrayA[i];
		}
		System.out.println("B로 복사했습니다.");
		for(int i = 0; i < ArrayB.length; i++) { 
		System.out.println
		("B [" + i + "] = " + ArrayB[i]);	
		}	
	}
}
