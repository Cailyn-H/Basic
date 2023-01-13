package MyJava;


import java.util.Scanner;

class MyDay1 {

	private int year;
	private int month;
	private int date;
	
	//생성자
	MyDay1(int year, int month, int date) { 
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	int getYear() { 
		return year;
	}
	int getMonth() { 
		return month;
	}
	int getDate() { 
		return date;
	}
	
	void setYear(int year) { 
		this.year = year;
	}
	void setMonth(int month) { 
		this.month = month;
	}
	void setDate(int date) { 
		this.date = date;
	}
	void set(int year, int month, int date) { 
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	int dayOfWeek() { 
		int y = year;
		int m = month;
		int d = date;
		if(m == 1 || m == 2) { 
		y--;
		m += 12;
		}
		return ((y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + d) % 7);
	}
}

public class Mybirth {
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
		
		MyDay1 birth = new MyDay1(MyYear, MyMonth, MyDate);
		
		System.out.println("당신의 생일은 " 
				+ birth.getYear() + "년 " 
				+ birth.getMonth() + "월 "
				+ birth.getDate() + "일 "
				+ allday[birth.dayOfWeek()] + "요일 입니다.");
		
		MyDay1 special = birth;
		special.set(4212, 12, 30);
		
		System.out.println("당신의 생일은 " 
				+ birth.getYear() + "년 " 
				+ birth.getMonth() + "월 "
				+ birth.getDate() + "일 "
				+ allday[ birth.dayOfWeek()] + "요일 입니다.");
		
		System.out.println("당신의 생일은 " 
				+ special.getYear() + "년 " 
				+ special.getMonth() + "월 "
				+ special.getDate() + "일 "
				+ allday[special.dayOfWeek()] + "요일 입니다.");
		
	}
}

