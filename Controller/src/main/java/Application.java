import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import java.util.Scanner;

public class Application {
    private static void printBooksByAuthor(String author, Library lib) {
        List<Book> booksByAuthor = lib.getBooksByAuthor(author);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(booksByAuthor);
        System.out.println("\n\tBooks by " + author + "\t\n");
        System.out.println(json);
    }
    public static void main(String[] args) {
        try {
            Library library = LibraryFactory.getLibrary();
            String author = new Scanner(System.in).nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}