package MyJava;

class Game { 
	private int number = 0;
	private String name;
	private int age;
	private int level;
	private int count;
	
	Game(String name, int age, int level) { 
		this.name = name;
		this.age = age;
		this.level = level;
		count = ++number;
	}
	String GetName() { 
		return name;
	}
	int GetAge() { 
		return age;
	}
	int GetLevel() { 
		return level;
	}
	int GetCount() { 
		return count;
	}
}

public class Gamer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Game first = new Game("가나다", 32, 12);
		Game second = new Game("마바사", 23, 10);
		
		System.out.println("플레이어 이름 : " + first.GetName());
		System.out.println("플레이어 나이 : " + first.GetAge());
		System.out.println("플레이어 레벨 : " + first.GetCount());
		System.out.println("몇번째 플레이어 인가요 ? : " + first.GetCount());

		System.out.println("플레이어 이름 : " + second.GetName());
		System.out.println("플레이어 나이 : " + second.GetAge());
		System.out.println("플레이어 레벨 : " + second.GetCount());
		System.out.println("몇번째 플레이어 인가요 ? : " + second.GetCount());
		
	}

}
