package chap05.singleton_pattern.example3;

public class Main {

	public static void main(String[] args) {
		
		// 중복된 instance는 생성되지 않음
		for(int id = 0; id < 9; id++) 
		{
			Triple triple = Triple.getInstance(id % 3);
			System.out.println(triple.toString());
		}
		
	}

}
