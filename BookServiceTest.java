import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Mock
    private BookRepository bookRepositoryMock;

    @InjectMocks
    private BookService bookService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void findBookById_shouldReturnBookFromRepository() {
        // Arrange
        String bookId = "1";
        Book expectedBook = new Book(bookId, "Book1", "Author1");
        when(bookRepositoryMock.findById(bookId)).thenReturn(expectedBook);

        // Act
        Book result = bookService.findBookById(bookId);

        // Assert
        assertEquals(expectedBook, result);
        verify(bookRepositoryMock, times(1)).findById(bookId);
    }

    @Test
    void findAllBooks_shouldReturnListOfBooksFromRepository() {
        // Arrange
        List<Book> expectedBooks = Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")
        );
        when(bookRepositoryMock.findAll()).thenReturn(expectedBooks);

        // Act
        List<Book> result = bookService.findAllBooks();

        // Assert
        assertEquals(expectedBooks, result);
        verify(bookRepositoryMock, times(1)).findAll();
    }
}
