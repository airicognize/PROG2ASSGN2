import java.util.Objects;

/**
 * Our author class in which we'll be using for MyLibrary and Book class.
 */

public class Author {

    private String name;
    private String nationality;
    private String email;

    /**
     * Our default constructor.
     */

    public Author() {
        this.name = "Unknown";
        this.nationality = "Unknown";
        this.email = "unknown@email.com";
    }

    /**
     *  Our constructor with all data members.
     * @param name Name of the author.
     * @param nationality Nationality of the author.
     * @param email Email of the author
     */

    public Author(String name, String nationality, String email) {
        this.name = name;
        this.nationality = nationality;
        this.email = email;
    }

    /**
     * Our copy constructor
     * @param author Object that has already been created.
     */

    public Author(Author author) {
        this.name = author.name;
        this.nationality = author.nationality;
        this.email = author.email;
    }

    /**
     *
     * @param nationality Nationality of the author
     * @return if the Nationality of the author is one of 5 different nationalities.
     */

    public static boolean isNationalityValid(String nationality) {
        return (nationality.equalsIgnoreCase("canadian") ||
                nationality.equalsIgnoreCase("american") ||
                nationality.equalsIgnoreCase("french") ||
                nationality.equalsIgnoreCase("british") ||
                nationality.equalsIgnoreCase("German"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) &&
                Objects.equals(nationality, author.nationality) &&
                Objects.equals(email, author.email);
    }

    @Override
    public String toString() {
        return String.format("\n%-15s%s\n%-15s%s\n%-15s%s\n",
                "Name:", name , "Nationality:", nationality, "Email:", email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        if (isNationalityValid(nationality))
        this.nationality = nationality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
