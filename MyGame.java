package MyJava;

public class MyGame {

	public static void main(String[] args) {
		
		String dogName = "강아지";
		int dogPower = 5;
		int dogHP = 100;
		
		String catName = "고양이";
		int catPower = 6;
		int catHP = 90;
		
		dogHP -= 10;
		catHP += 10;
		
		System.out.println("강아지정보");
		System.out.println("이름 : " + dogName);
		System.out.println("힘 : " + dogPower);
		System.out.println("체력 : " + dogHP);

		System.out.println("고양이정보");
		System.out.println("이름 : " + catName);
		System.out.println("힘 : " + catPower);
		System.out.println("체력 : " + catHP);
	}

}
