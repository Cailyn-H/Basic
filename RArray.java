package MyJava;

import java.util.Random;
import java.util.Scanner;

public class RArray {

	public static void main(String[] args) {
		
		Scanner scanIt = new Scanner(System.in);
		Random rand = new Random();
		//배열의 칸을 결정하는 변수입니다.
		int num;
		System.out.println("배열을 역순으로 표시합니다.");
		
		//배열의 크기를 설정합니다.
		System.out.print("만들 배열의 크기는 ? : ");
		num = scanIt.nextInt();
		int[] myArr = new int[num];
		//배열의 칸을 만들었으면 랜덤으로 myArr[i] 에 숫자를 넣습니다.
		for(int i = 0; i < myArr.length; i++) { 
			myArr[i] = rand.nextInt(1000) + 1;
			System.out.println("myArr[" + i + "] =  "
			+ myArr[i]);
		}
		/* 중간에 j /myArr.length/2를 한 이유는 절반만 바꾸면 전체
		 * 바꿀수 있기 때문에 나누기 2를 해야합니다.
		 * 쉽게 생각해서 첫번쨰칸과 마지막칸을 바꾸고 그 다음
		 * 첫번째 다음칸과 마지막 칸의 전칸을 바꾸기 때문입니다.
		 * */
		for(int j = 0; j < myArr.length/2; j++) { 
			int change = myArr[j];
			myArr[j] = myArr[myArr.length - j - 1];
			myArr[myArr.length - j - 1] = change;
		}
		
		System.out.println("배열을 역순으로 교체했습니다.");
		//역순된 배열을 출력합니다.
		for(int i = 0; i < myArr.length; i++) { 
			System.out.println("myArr [" 
		+ i + "] = " + myArr[i]);
		}
	}
}
