package chap13.visitor_pattern;

import java.util.Iterator;

public abstract class Entry implements Element{
	
	public abstract String getName(); 		// 이름을 얻는다.
	public abstract int getSize(); 			// 사이즈를 얻는다.
	
	public Entry add(Entry entry) throws FileTreatmentException{
		throw new FileTreatmentException();
	}
	
	public Iterator<Entry> iterator() throws FileTreatmentException{
		throw new FileTreatmentException();
	}

	@Override
	public String toString() {
		return getName() + " (" + getSize() + ")"; 
	}
}
