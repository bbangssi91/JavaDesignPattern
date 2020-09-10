package chap05.singleton_pattern.example3;

public class Triple {
	
	private static Triple[] triple = new Triple[] {
		new Triple(0),
		new Triple(1),
		new Triple(2)
	};
	
	private int id;
	
	// Constructor
	private Triple(int id) {
		System.out.println(">> Instance id created : " + id);
		this.id = id;
	}
	
	public static Triple getInstance(int id) {
		return triple[id];
	}
	
	@Override
	public String toString() {
		return "Triple ID :: " + id;
	}
	
	
}
