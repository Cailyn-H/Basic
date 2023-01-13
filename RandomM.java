package MyJava;

import java.util.Random;

public class RandomM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		int number1 = rand.nextInt(50+10)-20;
		
		System.out.println(number1);
	}

}
