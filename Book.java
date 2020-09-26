import java.util.Arrays;
import java.util.Objects;

/**
 * Our Book class in which we'll be using for myLibrary class.
 */

public class Book {

    private String title;
    private Author[] authors;
    private double price;

    /**
     * Default constructor
     */

    public Book() {
        this.title = "Unkown";
        this.authors = new Author[1];
        this.price = 0;
    }

    /**
     * Constructor with all data members.
     * @param title Title of the book.
     * @param authors Author array with authors as elements.
     * @param price Price of the book.
     */

    public Book(String title, Author[] authors, double price) {
        this.title = title;
        this.authors = authors;
        this.price = price;
    }

    /**
     * Copy constrcutor with a deep copy.
     * @param book Book object we've already created before.
     */

    public Book(Book book) {
        this.authors = (book != null && book.authors != null) ?
                Arrays.copyOf(book.authors, book.authors.length) : null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 &&
                title.equals(book.title) &&
                Arrays.equals(authors, book.authors);
    }

    @Override
    public String toString() {
        return String.format("\n%-15s%s\n%-15s%s\n%-15s$%.2f\n",
                "Title:", title , "Authors:", Arrays.toString(authors), "Price:", price);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
