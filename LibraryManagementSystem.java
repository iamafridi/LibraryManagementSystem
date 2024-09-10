public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        try {
            library.addBook(new Book("Himu (Novel)", "Humayun Ahmed", "101"));
            library.addBook(new Book("Opekkha", "Humayun Ahmed", "102"));
            library.addBook(new Book("Nondito Noroke", "Humayun Ahmed", "103"));
        } catch (InvalidBookException e) {
            System.out.println(e.getMessage());
        }

        // Displaying books in the library
        System.out.println("\n Books in Library:");
        library.displayBooks();

        // Sorting and displaying books by title
        System.out.println("\nSorting books by title:");
        library.sortBooksByTitle();
        library.displayBooks();

        // Searching for a book with the keyword "Himu"
        System.out.println("\nSearching for book with keyword 'Himu':");
        Book foundBook = library.search("Himu");
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found. \n");
        }

        // Checking out a book with ISBN "101"
        try {
            library.checkOutBook("101");
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Returning the book with ISBN "101"
        library.returnBook(new Book("Himu (Novel)", "Humayun Ahmed", "101"));
System.out.println(" ");
        // Test case: Student Afridi borrows a book with ISBN "103"
        Student studentAfridi = new Student("Afridi", "193003912");
        studentAfridi.borrowBook(library, "103");
        System.out.println(" ");
        // Test case: Faculty Tanvir Azhar borrows a book with ISBN "101"
        Faculty facultyTanvir = new Faculty("Tanvir Azhar", "1");
        facultyTanvir.borrowBook(library, "101");
        System.out.println(" ");
        // Display the library books again to see the changes
        System.out.println("Books in Library after borrowing:");
        library.displayBooks();
        System.out.println(" ");
    }
}




// public class LibraryManagementSystem {
//     public static void main(String[] args) {
//         Library library = new Library();

//         try {
//             library.addBook(new Book("Himu (Novel)", "Humayun Ahmed", "101"));
//             library.addBook(new Book("Opekkha", "Humayun Ahmed", "102"));
//             library.addBook(new Book("Nondito Noroke", "Humayun Ahmed", "103"));
//         } catch (InvalidBookException e) {
//             System.out.println(e.getMessage());
//         }

//         System.out.println("Books in Library:");
//         library.displayBooks();

//         System.out.println("\nSorting books by title:");
//         library.sortBooksByTitle();
//         library.displayBooks();

//         System.out.println("\nSearching for book with keyword 'Himu':");
//         Book foundBook = library.search("Himu");
//         if (foundBook != null) {
//             System.out.println("Book found: " + foundBook);
//         } else {
//             System.out.println("Book not found.");
//         }

//         try {
//             library.checkOutBook("101");
//         } catch (BookNotFoundException e) {
//             System.out.println(e.getMessage());
//         }

//         library.returnBook(new Book("Himu (Novel)", "Humayun Ahmed", "101"));
//     }
// }
