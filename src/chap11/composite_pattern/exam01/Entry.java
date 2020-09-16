package chap11.composite_pattern.exam01;

public abstract class Entry {
	
	public abstract String getName();
	public abstract int getSize();
	
	public Entry add(Entry entry) throws FileTreatmentException{		
		throw new FileTreatmentException();
	}
	
	public void printList() {
		printList("");
	}
	
	// Entry 하위 구조에서만 사용하도록
	protected abstract void printList(String prefix);
	
	@Override
	public String toString() {
		return getName() + " (" + getSize() + ")";
	}
	
	
}
