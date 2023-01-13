package MyJava;

import java.util.Scanner;

public class MyCircleF {

	public static void main(String[] args) {
		
	Scanner scanIt = new Scanner(System.in);
		
		
	final double circlePi = 3.141592;
	
	System.out.print("반지름은 무엇인가요 ? : ");
	double half = scanIt.nextDouble();
	
	System.out.print("원의 면적은 : "
			+ (circlePi * half * half));
	
		
	}

}

