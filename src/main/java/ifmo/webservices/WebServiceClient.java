package ifmo.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class WebServiceClient {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8081/BookService?wsdl");
        BookService bookService = new BookService(url);
        List<Book> books = bookService.getBookWebServicePort().getBooks();
        printBooks(books);

        books = bookService.getBookWebServicePort().getBookById(5);
        printBooks(books);
    }

    private static void printBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("Total books: " + books.size());
    }
}