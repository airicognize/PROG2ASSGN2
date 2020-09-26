import java.util.Arrays;
import java.util.Random;

/**
 * MyLibrary class which will use both books and class classes.
 */

public class MyLibrary {

    private Book[] books;

    /**
     * Default constructor
     */

    public MyLibrary() {
        this.books = new Book[1];
    }

    /**
     * Constructor with its data member.
     * @param book Book array in which contains book elements.
     */

    public MyLibrary(Book[] book) {
        this.books = book;
    }

    /**
     * Copy constructor with a deep copy.
     * @param myLibrary Object that we already created before.
     */

    public MyLibrary(MyLibrary myLibrary) {
        this.books = (myLibrary != null && myLibrary.books != null) ?
                Arrays.copyOf(myLibrary.books, myLibrary.books.length) : null;
    }

    /**
     * Method used to select a random book from the books array in the MyLibrary object
     * @return A random book from the books array in the MyLibrary object.
     */

    public Book selectBook() {
        Random rnd = new Random();
        Book randomBook = books[rnd.nextInt(books.length)];

        return randomBook;
    }

    /**
     * Method used to select a specific book from the books array in the
     * MyLibrary object.
     * @param idx Index for which book we want to select a book from the book
     * array in our MyLibary object.
     * @return The book we have selected via the index.
     */

    public Book selectBook(int idx) {
        if (idx > books.length - 1 || idx < 0) {
            return selectBook();
        }

        Book book = books[idx];

        return book;
    }

    /**
     * Method used to calculate the total price of all the books from a book array.
     * @return the total price of all the books in the book array.
     */

    public double calcTotalPrice() {
        double sum = 0;
        for (Book book : books) {
            sum += book.getPrice();
        }
        return sum;
    }

    /**
     * Method used to count how many authors in one book
     * @param nationality
     * @return
     */

    public int countAuthorNum(String nationality) {
        int sum = 0;

        for (Book book : books) {
            for (Author author : book.getAuthors()) {
                if (author.getNationality().equalsIgnoreCase(nationality)) {
                    sum++;
                }
            }
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyLibrary)) return false;
        MyLibrary myLibrary = (MyLibrary) o;
        return Arrays.equals(books, myLibrary.books);
    }

    @Override
    public String toString() {
        return String.format("%-15s%s\n",
                "Books:", Arrays.toString(books));
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
