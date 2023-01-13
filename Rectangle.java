package MyJava;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
	
		Scanner scanIt = new Scanner(System.in);
		//변수의 상자를 생성
		double X_length;
		double Y_length;
		
		//x축, y축 길이
		System.out.print("X축의 길이는 ? : ");
		X_length = scanIt.nextDouble();
		System.out.print("Y축의 길이는 ? : ");
		Y_length = scanIt.nextDouble();
		
		System.out.println("넓이는 : "
		+ (X_length * Y_length));
	}

}
