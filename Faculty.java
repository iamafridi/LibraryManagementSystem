public class Faculty extends LibraryUser {
    private int maxBooksAllowed;

    public Faculty(String name, String id) {
        super(name, id, "Faculty");
        this.maxBooksAllowed = 10;  // Faculty can borrow up to 10 books
    }

    public int getMaxBooksAllowed() {
        return maxBooksAllowed;
    }

    public void setMaxBooksAllowed(int maxBooksAllowed) {
        this.maxBooksAllowed = maxBooksAllowed;
    }

    public void borrowBook(Library library, String isbn) {
        if (maxBooksAllowed > 0) {
            try {
                library.checkOutBook(isbn);
                maxBooksAllowed--;
                System.out.println(getName() + " borrowed a book. Books remaining: " + maxBooksAllowed);
            } catch (BookNotFoundException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println(getName() + " cannot borrow more books. Limit reached.");
        }
    }

    public void returnBook(Library library, Book book) {
        library.returnBook(book);
        maxBooksAllowed++;
        System.out.println(getName() + " returned a book. Books remaining: " + maxBooksAllowed);
    }
}
