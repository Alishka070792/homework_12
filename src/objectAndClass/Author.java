package objectAndClass;

public class Author {
    String authorName;
    String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;

    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;

    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setAuthorSurname(String authorSurname) {

    }

}
