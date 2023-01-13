package MyJava;

import java.util.Random;
import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		
		Scanner scanIt = new Scanner(System.in);
		Random rand = new Random();
		
		int enemyHP = 100;
		int myHP = 100;
		int randnumber;
		int attack;
		
		System.out.println("적의 체력을 깍아보세요!");
		
		do { 
			randnumber = rand.nextInt(50);
			System.out.println(randnumber
					+ " 보다 작은 공격력으로 공격해보세요!");
			attack = scanIt.nextInt();
			
			if(attack > randnumber) { 
				System.out.println("MISS!!");
			}
			else if(attack <= randnumber){ 
				System.out.println("공격이 들어갔습니다.");
				enemyHP -= attack;
			}
			if(enemyHP <= 0) { 
				System.out.println("적을 잡았습니다.");
				
			}
		} while(enemyHP >= 0);
		
		System.out.println("게임 종료");
	}

}

