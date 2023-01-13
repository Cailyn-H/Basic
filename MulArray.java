package MyJava;

public class MulArray {

	public static void main(String[] args) {
		
		int[][] myArray = new int[2][4];
		
		for(int i = 0; i < 2; i++) { 
			for(int j = 0; j < 4; j++) { 
				System.out.println("myArray[" 
					+ i + "][" + j + "]");
			}
			System.out.println();
		}
	}

}

