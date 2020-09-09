package chap01.iterator_pattern;

import java.util.ArrayList;

public class BookShelf implements Aggregate{
	
	private ArrayList<Book> books;
	
	// Constructor
	public BookShelf(int initialSize) {
		this.books = new ArrayList<>(initialSize);
	}
	
	public Book getBookAt(int index) {
		return books.get(index);
	}
	
	public void appendBook(Book book) {
		books.add(book);
	}
	
	public int getLength() {
		return books.size();
	}
	
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
	
}
