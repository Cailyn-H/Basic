package MyJava;

import java.util.Scanner;

public class PlayMyDay {

	public static void main(String[] args) {
		
		Scanner scanIt = new Scanner(System.in);
		String[] allday = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println("생일을 입력해 보세요~");
		System.out.print("몇년에 태어나셨나요 ? : ");
		int MyYear = scanIt.nextInt();
		System.out.print("몇월에 태어나셨나요 ? : ");
		int MyMonth = scanIt.nextInt();
		System.out.print("몇일에 태어나셨나요 ? : ");
		int MyDate = scanIt.nextInt();
		
		MyDay birth = new MyDay(MyYear, MyMonth, MyDate);
		
		System.out.println("당신의 생일은 " 
				+ birth.getYear() + "년 " 
				+ birth.getMonth() + "월 "
				+ birth.getDate() + " 일"
				+ allday[((MyDay) birth).dayOfWeek()] + " 입니다");
	}

}
