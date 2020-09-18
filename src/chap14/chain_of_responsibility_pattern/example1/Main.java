package chap14.chain_of_responsibility_pattern.example1;

public class Main {

	public static void main(String[] args) {
		Support a = new NoSupport("Alice");
		Support b = new LimitSupport("Bob", 100);
		Support c = new SpecialSupport("Cole", 350);
		Support d = new LimitSupport("David", 200);
		Support e = new OddSupport("Ellie");
		Support f = new LimitSupport("Frank", 52);
		
		// make chain
		a.setNext(b).setNext(c).setNext(d).setNext(e).setNext(f);

		for(int i = 0 ; i < 500 ; i+=35)
		{
			a.support(new Trouble(i));
		}
		
	}

}
