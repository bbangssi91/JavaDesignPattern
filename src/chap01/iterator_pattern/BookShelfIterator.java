package chap01.iterator_pattern;

public class BookShelfIterator implements Iterator{

	private BookShelf bookShelf;
	private int index;

	// Constructor
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		return index < bookShelf.getLength() ? true : false;
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
	
	
	
	
}
