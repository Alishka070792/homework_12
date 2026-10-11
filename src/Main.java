import objectAndClass.Author;
import objectAndClass.Book;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author Zusak = new Author("Markus", "Zusak");
        Author Wilde = new Author("Oscar", "Wilde");

        Book Thief = new Book("The Book Thief", Zusak, 2005);
        Book Picture = new Book("The Picture of Dorian Gray", Wilde, 1890);

        System.out.println("Book: " + Thief.getBookName());
        System.out.println("Author: " + Thief.getBookAuthor().getAuthorName() + " " + Thief.getBookAuthor().getAuthorSurname());
        System.out.println("The year of publishing is " + Thief.getPublishedYear());
        System.out.println();

        System.out.println("Book: " + Picture.getBookName());
        System.out.println("Author: " + Picture.getBookAuthor().getAuthorName() + " " + Picture.getBookAuthor().getAuthorSurname());
        System.out.println("The year of publishing is " + Picture.getPublishedYear());
        System.out.println();

        Picture.setPublishedYear(1900);
        System.out.println("Book: " + Picture.getBookName());
        System.out.println("Author: " + Picture.getBookAuthor().getAuthorName() + " " + Picture.getBookAuthor().getAuthorSurname());
        System.out.println("The year of publishing is " + Picture.getPublishedYear());
    }
}