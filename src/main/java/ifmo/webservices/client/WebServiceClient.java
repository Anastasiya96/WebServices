package ifmo.webservices.client;

import ifmo.webservices.Book;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class WebServiceClient {

  public static void main(String[] args) throws MalformedURLException {
    URL url = new URL("http://localhost:8081/BookService?wsdl");
    BookService bookService = new BookService(url);
    List<Book> books = bookService.getBookWebServicePort().getBooks();
    for (Book book : books) {
      System.out.println(book);
    }
    System.out.println("Total books: " + books.size());
  }
}