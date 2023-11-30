package book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;
    @InjectMocks
    private BookService bookService;
    @BeforeEach
    public void init(){
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void testFindBookById(){
        Book expectedBook  = new Book ("01", "Crocodile", "Chukovsky");
        Mockito.when(bookRepository.findById("01")).thenReturn(expectedBook);
        Book actualBook = bookService.findBookById("01");
        assertEquals(expectedBook, actualBook);
    }
@Test
public void testFindAllBooks() {
        Book book1 = new Book ("01", "Crocodile", "Chukovsky");
        Book book2 = new Book ("02", "Poems", "Barto");
        Book book3 = new Book ("03", "Dunno", "Nosov");
        Mockito.when(bookRepository.findAll()).thenReturn(Arrays.asList(book1, book2, book3));
        List<Book> actualBooks = bookService.findAllBooks();
        assertEquals(Arrays.asList(book1, book2, book3), actualBooks);

    }
}



