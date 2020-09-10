package chap05.singleton_pattern.example1;

public class Main {

	public static void main(String[] args) {

		System.out.println("===== START =====");
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) 
		{
			System.out.println("RESULT :: Same Object");
		}else 
		{
			System.out.println("RESULT :: Different Object");
		}

		System.out.println("===== END =====");
		
	}

}
