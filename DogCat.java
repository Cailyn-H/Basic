package MyJava;

class MyAnimal{
	String name;
	int power;
	int HP;
}
public class DogCat {

	public static void main(String[] args) {
		
		MyAnimal dog = new MyAnimal();
		MyAnimal cat = new MyAnimal();
		
		dog.name = "강아지";
		dog.power = 30;
		dog.HP = 100;
		
		cat.name = "고양이";
		cat.power = 50;
		cat.HP = 100;
		
		cat.HP += 20;
		dog.HP -= 30;
		
		System.out.println("강아지정보");
		System.out.println("이름 : " + dog.name);
		System.out.println("힘 : " + dog.power);
		System.out.println("체력 : " + dog.HP);
		System.out.println("고양이정보");
		System.out.println("이름 : " + cat.name);
		System.out.println("힘 : " + cat.power);
		System.out.println("체력 : " + cat.HP);
	}
}
