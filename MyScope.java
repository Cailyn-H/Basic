package MyJava;

public class MyScope {
	//전역변수입니다.
	static int x = 10;
	
	static void MyPoint() { 
		System.out.println("MyPoint" + x);
	}

	public static void main(String[] args) {
		//지역변수입니다.
		int x = 12;
		System.out.println("x = " + x);
		x++;
		System.out.println(x);
		
		//전역변수를 출력하는 부분입니다.
		System.out.println(MyScope.x);
		MyScope.x++;
		
		System.out.println(MyScope.x);
		
		//MyPoint함수로 이동합니다.
		MyPoint();

	}

}
