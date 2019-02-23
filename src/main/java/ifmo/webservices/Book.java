package ifmo.webservices;

public class Book {
  private int id;
  private String name;
  private String publishing;
  private String author;
  private int year;
  private int pages;

  public Book() {

  }

  public Book(int id, String name, String publishing, String author, int year, int pages) {
    this.id = id;
    this.name = name;
    this.publishing = publishing;
    this.author = author;
    this.year = year;
    this.pages = pages;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPublishing() {
    return publishing;
  }

  public void setPublishing(String publishing) {
    this.publishing = publishing;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  @Override
  public String toString() {
    return "Book{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", publishing='" + publishing + '\'' +
            ", author='" + author + '\'' +
            ", year=" + year +
            ", pages=" + pages +
            '}';
  }
}