package ifmo.webservices;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OracleSQLDAO {
    private List<Book> getBooks(String query) throws SQLException  {
        List<Book> books = new ArrayList<Book>();

        try (Connection connection = ConnectionUtil.getConnection()) {

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt(Field.fromValue("id").toString());
                String name = rs.getString(Field.fromValue("name").toString());
                String publishing = rs.getString(Field.fromValue("publishing").toString());
                String author = rs.getString(Field.fromValue("author").toString());
                int year = rs.getInt(Field.fromValue("year").toString());
                int pages = rs.getInt(Field.fromValue("pages").toString());

                Book book = new Book(author, id, name, pages, publishing, year);
                books.add(book);
            }
        }
        return books;
    }

    public List<Book> getAllBooks() throws SQLException {
        return getBooks("select * from books");
    }

    public List<Book> getBooksByFields(List<BookFieldValue> bookRequests) throws SQLException {
        StringBuilder query = new StringBuilder("select * from books where ");

        for (BookFieldValue bookRequest : bookRequests) {
            String equalExpression = String.format("%s = '%s'", bookRequest.getField(), bookRequest.getValue());
            query.append(equalExpression);

            if (!bookRequest.equals(bookRequests.get(bookRequests.size() - 1))) {
                query.append(" and ");
            }
        }
        return getBooks(query.toString());
    }

    public int addBook(Book book) throws SQLException {
        int id = -1;
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement pstm = connection.prepareStatement(String.format(
                    "insert into books(name, publishing, author, year, pages) " +
                            "values('%s', '%s', '%s', %5d, %5d)",
                    book.getName(),
                    book.getPublishing(),
                    book.getAuthor(),
                    book.getYear(),
                    book.getPages()),
                    new String[]{"id"});

            int i = pstm.executeUpdate();
            if (i > 0) {
                ResultSet rs = pstm.getGeneratedKeys();
                while (rs.next()) {
                    id = Integer.parseInt(rs.getString(1));
                }
            }
        }
        return id;
    }

    public boolean modifyBook(int id, List<BookFieldValue> newValues) throws SQLException {
        if (newValues.size() == 0) {
            return false;
        }

        StringBuilder query = new StringBuilder("update books set ");

        for (BookFieldValue bookRequest : newValues) {
            String equalExpression = String.format("%s = '%s'", bookRequest.getField(), bookRequest.getValue());
            query.append(equalExpression);

            if (!bookRequest.equals(newValues.get(newValues.size() - 1))) {
                query.append(", ");
            } else {
                query.append("where id = ");
                query.append(id);
            }
        }

        return executeOperation(query.toString());
    }

    public boolean deleteBook(int id) throws SQLException {
        String query = String.format("delete from books where id = %5d", id);
        return executeOperation(query);
    }

    private boolean executeOperation(String query) throws SQLException {
        try (Connection connection = ConnectionUtil.getConnection()) {
            Statement stmt = connection.createStatement();
            stmt.executeQuery(query);
        }
        return true;
    }
}