package F.LacoForEach;

public class Program {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Jo�o", "Francisco"};
		
		// usando o for 
		for(int i = 0; i < 3; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-------------------------------------");
		// usando o for each
		for(String obj : vect) {
			System.out.println(obj);
		}

	}

}
