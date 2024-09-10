import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Library implements Searchable {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) throws InvalidBookException {
        if (book.getTitle().isEmpty() || book.getAuthor().isEmpty()) {
            throw new InvalidBookException("Book details cannot be empty.");
        }
        books.add(book);
    }

    public void checkOutBook(String isbn) throws BookNotFoundException {
        Book book = search(isbn);
        if (book != null) {
            books.remove(book);
            System.out.println("Book checked out: " + book);
        } else {
            throw new BookNotFoundException("Book with ISBN " + isbn + " not found.");
        }
    }

    public void returnBook(Book book) {
        books.add(book);
        System.out.println("Book returned: " + book);
    }

    public void sortBooksByTitle() {
        Collections.sort(books, Comparator.comparing(Book::getTitle));
    }

    public void sortBooksByAuthor() {
        Collections.sort(books, Comparator.comparing(Book::getAuthor));
    }

    public void sortBooksByIsbn() {
        Collections.sort(books, Comparator.comparing(Book::getIsbn));
    }

    @Override
    public Book search(String keyword) {
        for (Book book : books) {
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword) || book.getIsbn().equals(keyword)) {
                return book;
            }
        }
        return null;
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
