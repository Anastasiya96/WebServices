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
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<Book>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from books");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String publishing = rs.getString("publishing");
                String author = rs.getString("author");
                int year = rs.getInt("year");
                int pages = rs.getInt("pages");

                Book book = new Book(id, name, publishing, author, year, pages);
                books.add(book);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OracleSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return books;
    }
}