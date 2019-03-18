
package ifmo.webservices;

import java.awt.Image;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for book complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="book">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="publishing" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="coverImage" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "book", propOrder = {
    "author",
    "id",
    "name",
    "pages",
    "publishing",
    "year",
    "coverImage"
})
public class Book {

    @XmlElement(required = true)
    protected String author;
    protected int id;
    @XmlElement(required = true)
    protected String name;
    protected int pages;
    @XmlElement(required = true)
    protected String publishing;
    protected int year;
    @XmlMimeType("image/jpeg")
    protected Image coverImage;


    public Book(String author, int id, String name, int pages, String publishing, int year) {
        this.author = author;
        this.id = id;
        this.name = name;
        this.pages = pages;
        this.publishing = publishing;
        this.year = year;
    }

    public Book() {

    }

    /**
     * Gets the value of the author property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the id property.
     *
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the pages property.
     *
     */
    public int getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
     *
     */
    public void setPages(int value) {
        this.pages = value;
    }

    /**
     * Gets the value of the publishing property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPublishing() {
        return publishing;
    }

    /**
     * Sets the value of the publishing property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPublishing(String value) {
        this.publishing = value;
    }

    /**
     * Gets the value of the year property.
     *
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     *
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the coverImage property.
     *
     * @return
     *     possible object is
     *     {@link Image }
     *
     */
    public Image getCoverImage() {
        return coverImage;
    }

    /**
     * Sets the value of the coverImage property.
     *
     * @param value
     *     allowed object is
     *     {@link Image }
     *
     */
    public void setCoverImage(Image value) {
        this.coverImage = value;
    }

    /**
     * Sets the value of the property.
     *
     */
    public void setField(Field field, String value) {
        switch (field) {
            case NAME: setName(value); break;
            case PUBLISHING: setPublishing(value); break;
            case AUTHOR: setAuthor(value); break;
            case YEAR: setYear(Integer.parseInt(value)); break;
            case PAGES: setPages(Integer.parseInt(value)); break;
        }
    }

    @Override
    public String toString() {
        return "Book {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publishing='" + publishing + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
