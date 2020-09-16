package chap11.composite_pattern.exam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry{

	private String name;
	private List<Entry> directory = new ArrayList<>();
	
	// Constructor
	public Directory(String name) {
		this.name = name;
	}
	
	public Entry add(Entry entry) {
		directory.add(entry);
		return this;
	}
	
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		int size = 0;
		
		Iterator<Entry> it = directory.iterator();
		
		while(it.hasNext()) 
		{
			Entry entry = it.next();
			size += entry.getSize();
		}
		
		return size;
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
		
		Iterator<Entry> it = directory.iterator();
		
		while(it.hasNext()) 
		{
			Entry entry = it.next();
			entry.printList(prefix + "/" + name);
		}

	}
	
}
