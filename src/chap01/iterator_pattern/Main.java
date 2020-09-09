package chap01.iterator_pattern;

public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		
		bookShelf.appendBook(new Book("1번책"));
		bookShelf.appendBook(new Book("2번책"));
		bookShelf.appendBook(new Book("3번책"));
		bookShelf.appendBook(new Book("4번책"));
		bookShelf.appendBook(new Book("5번책"));
		bookShelf.appendBook(new Book("6번책"));
		
		Iterator it = bookShelf.iterator();
		
		while(it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
		
		
	}

}
