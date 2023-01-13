package MyJava;

import java.util.Scanner;

class MyDay { 
	private int year;
	private int month;
	private int date;
	
	//생성자를 만들어 줍니다.
	MyDay(int year, int month, int date) { 
		this.year = year;
		this.month = month;
		this.date = date;
	}
	//get 합니다.
	int getYear() { 
		return year;
	}
	int getMonth() { 
		return month;
	}
	
	int getDate() { 
		return date;
	}
	
	//set 합니다.
	void setYear(int year) { 
		this.year = year;
	}
	void setMonth(int month) { 
		this.month = month;
	}
	void setDate(int date) { 
		this.date = date;
	}
	//년, 월, 일을 설정하는 구간입니다.
	
	
}

public class GetSet {

	public static void main(String[] args) {
		Scanner scanIt = new Scanner(System.in);
		
		System.out.println("당신의 생일을 입력해 주세요!");
		System.out.print("년 : "); 
		int y = scanIt.nextInt();
		System.out.print("월 : "); 
		int m = scanIt.nextInt();
		System.out.print("일 : "); 
		int d = scanIt.nextInt();
		
		MyDay birth = new MyDay(y, m, d);
		System.out.println("나의 생일은 " 
				+ birth.getYear() + " 년 "
				+ birth.getMonth() + " 월 "
				+ birth.getDate() + " 일 ");	
	}
}
