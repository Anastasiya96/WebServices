package ifmo.webservices;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OracleSQLDAO {
    private List<Book> getBooks(String query) {
        List<Book> books = new ArrayList<Book>();

        try (Connection connection = ConnectionUtil.getConnection()) {

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt(Field.id.toString());
                String name = rs.getString(Field.name.toString());
                String publishing = rs.getString(Field.publishing.toString());
                String author = rs.getString(Field.author.toString());
                int year = rs.getInt(Field.year.toString());
                int pages = rs.getInt(Field.pages.toString());

                Book book = new Book(author, id, name, pages, publishing, year);
                books.add(book);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OracleSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return books;
    }

    public List<Book> getAllBooks() {
        return getBooks("select * from books");
    }

    public List<Book> getBooksByFields(BookCondition[] bookRequests) {
        StringBuilder query = new StringBuilder("select * from books where ");

        for (BookCondition bookRequest : bookRequests) {
            String equalExpression = String.format("%s = '%s'", bookRequest.getField(), bookRequest.getValue());
            query.append(equalExpression);

            if(!bookRequest.equals(bookRequests[bookRequests.length - 1])) {
                query.append(" and ");
            }
        }
        return getBooks(query.toString());
    }
}

enum Field { id, name, publishing, author, year, pages }

class BookCondition {
    private Field field;
    private Object value;

    public BookCondition(Field field, Object value) {
        this.field = field;
        this.value = value;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}