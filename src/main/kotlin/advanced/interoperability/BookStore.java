package advanced.interoperability;

import java.util.Arrays;
import java.util.List;

public class BookStore {

    // TODO (1) Přidejte do třídy Book anotaci, která zajistí že nebude nutné nastavovat pages na null a signed na false
    // Po úpravě bude stačit tento zápis: new Book("Effective Java", "Joshua Bloch")
    private List<Book> books = Arrays.asList(
            new Book("Effective Java", "Joshua Bloch", null, false),
            new Book("Hobit", "J.R.R. Tolkien", null, false)
    );
    private int bookCount;

    public Book getBook(String title) {
        return books.stream()
                .filter(bookInStore -> bookInStore.getTitle().equals(title))
                .findFirst().get();

    }

    public int getBookCount() {
        return books.size();
    }
}
