import java.io.FileReader;
import java.util.Scanner;

public class LibraryFactory {
    public static Library getLibrary() throws Exception {
        Library lib = new Library();
        String listBooks = "Controller/src/main/resources/list_books.csv";
        FileReader fr = new FileReader(listBooks);
        Scanner scan = new Scanner(fr);
        while (scan.hasNextLine()) {
            String delim = ";";
            String[] tokens = scan.nextLine().split(delim);
            lib.addBook(new Book (
                    tokens[0],  //book name
                    new Author(tokens[1], tokens[2]),   //author name, author contacts
                    Integer.parseInt(tokens[3]),    //book year
                    Integer.parseInt(tokens[4]),    //number of pages
                    tokens[5]   // disposition (shelf in library or name/id of Library reader)
            ));
        }
        return lib;
    }
}