import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class Book {
    @NonNull
    private static int id;
    @NonNull
    private String name;
    @NonNull
    private Author author;
    @NonNull
    private int year;
    private int numPages;
    private String disposition;

    private static void invokeID() {
        id++;
    }
}