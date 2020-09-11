package chap07.builder_pattern.example1;

public abstract class Builder {

	//1. makeTitle(String)
	public abstract void makeTitle(String title);
	
	//2. makeString(String)
	public abstract void makeString(String str);
	
	//3. makeItems(String[] items)
	public abstract void makeItems(String[] items);
	
	//4. close (void)
	public abstract void close();
	
}
