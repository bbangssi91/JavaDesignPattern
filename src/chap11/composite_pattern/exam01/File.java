package chap11.composite_pattern.exam01;

public class File extends Entry{

	private String name;
	private int size;
	
	// Constructor
	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this); // toString()
		
	}

}
