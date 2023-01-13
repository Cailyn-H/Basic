package MyJava;

public class StringArray {

	public static void main(String[] args) {
		
		String[] Animal = {"기린", "사자", "고양이"};
		
		for(int i = 0; i < Animal.length; i++) { 
			System.out.println("동물 " + i 
					+ "번은 : " + Animal[i]);
		}	
	}
}

