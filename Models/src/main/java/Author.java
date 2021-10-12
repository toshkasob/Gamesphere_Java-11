import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class Author {
    @NonNull
    private static int id;
    @NonNull
    private String name;
    @NonNull
    private String contacts;
    private static void invokeID() {
        id++;
    }
}