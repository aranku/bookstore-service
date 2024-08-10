import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookstoreService bookstore = new BookstoreService();

        // Adding some books
        bookstore.addBook(new Book("978-0061120084", "To Kill a Mockingbird", "Harper Lee", 12.99));
        bookstore.addBook(new Book("978-0451524935", "1984", "George Orwell", 8.99));
        bookstore.addBook(new Book("978-0141439518", "Pride and Prejudice", "Jane Austen", 7.99));
        bookstore.addBook(new Book("978-0743273565", "The Great Gatsby", "F. Scott Fitzgerald", 14.99));

        // Demonstrating some operations
        System.out.println("All books:");
        bookstore.getAllBooks().forEach(System.out::println);

        System.out.println("\nFinding book by ISBN 978-0061120084:");
        Book foundBook = bookstore.findBookByIsbn("978-0061120084");
        System.out.println(foundBook);

        System.out.println("\nBooks by Jane Austen:");
        List<Book> austenBooks = bookstore.findBooksByAuthor("Jane Austen");
        austenBooks.forEach(System.out::println);

        System.out.println("\nRemoving book with ISBN 978-0451524935");
        bookstore.removeBook("978-0451524935");

        System.out.println("\nAll books after removal:");
        bookstore.getAllBooks().forEach(System.out::println);
    }
}