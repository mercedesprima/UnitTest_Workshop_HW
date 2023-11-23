package book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryBookRepository implements BookRepository  {
    private final Map<String, Book> books;

    public InMemoryBookRepository() {
        this.books = new HashMap<>();
        books.put("1", new Book("01", "Crocodile", "Chukovsky"));
        books.put("2", new Book("02", "Poems", "Barto"));
        books.put("2", new Book("03", "Dunno", "Nosov"));

    }

    @Override
    public Book findById(String id) {
        return books.get(id);
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }
}
