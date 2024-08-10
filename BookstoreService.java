import java.util.ArrayList;
import java.util.List;

public class BookstoreService {
    private List<Book> inventory;

    public BookstoreService() {
        this.inventory = new ArrayList<>();
    }

    public void addBook(Book book) {
        inventory.add(book);
    }

    public Book findBookByIsbn(String isbn) {
        return inventory.stream()
                .filter(book -> book.getIsbn().equals(isbn))
                .findFirst()
                .orElse(null);
    }

    public List<Book> findBooksByAuthor(String author) {
        return inventory.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .toList();
    }

    public void removeBook(String isbn) {
        inventory.removeIf(book -> book.getIsbn().equals(isbn));
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(inventory);
    }
}