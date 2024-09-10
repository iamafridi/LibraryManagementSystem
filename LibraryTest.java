import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    private Library library;

    @Before
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testAddBook() {
        try {
            library.addBook(new Book("Himu (Novel)", "Humayun Ahmed", "101"));
            library.addBook(new Book("Opekkha", "Humayun Ahmed", "102"));
            library.addBook(new Book("Nondito Noroke", "Humayun Ahmed", "103"));
        } catch (InvalidBookException e) {
            fail("Should not throw InvalidBookException");
        }
        assertEquals(3, library.getBooks().size());
    }

    @Test
    public void testCheckOutBook() {
        try {
            library.addBook(new Book("Himu (Novel)", "Humayun Ahmed", "101"));
            library.checkOutBook("101");
        } catch (BookNotFoundException e) {
            fail("Should not throw BookNotFoundException");
        } catch (InvalidBookException e) {
            fail("Should not throw InvalidBookException");
        }
        assertEquals(0, library.getBooks().size());
    }

    @Test
    public void testSearchBook() {
        try {
            library.addBook(new Book("Himu (Novel)", "Humayun Ahmed", "101"));
            Book foundBook = library.search("Himu");
            assertNotNull(foundBook);
            assertEquals("101", foundBook.getIsbn());
        } catch (InvalidBookException e) {
            fail("Should not throw InvalidBookException");
        }
    }

    @Test(expected = BookNotFoundException.class)
    public void testCheckOutNonExistentBook() throws BookNotFoundException {
        library.checkOutBook("999");
    }

    @Test(expected = InvalidBookException.class)
    public void testAddInvalidBook() throws InvalidBookException {
        library.addBook(new Book("", "Unknown Author", "104"));
    }
}

