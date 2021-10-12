import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    List<Book> books;

    Library() {
        this.books = new ArrayList<Book>();
    }
    Library(ArrayList<Book> srcBooks) {
        this.books = srcBooks;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void printBooks() {
        for (Book b : this.books) {
            System.out.println(b);
        }
    }

    public List<Book> getBooksByAuthor(String author) {
        List<Book> bookListByAuthor = this.books.stream().filter(
                book -> book.getAuthor().getName().equals(author)).collect(Collectors.toList()
        ) ;
        return booksListByAuthor;
    }
}