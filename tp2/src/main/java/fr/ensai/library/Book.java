package fr.ensai.library;

/**
 * Represents a book.
 */
public class Book extends Item {

  // Attributes
  private String isbn;
  private Author author;

  /**
   * Constructs a new Book object.
   */
  public Book(
    String isbn,
    String title,
    Author author,
    int year,
    int pageCount
  ) {
    super(title, year, pageCount);
    this.isbn = isbn;
    this.author = author;
  }

  /**
   * Getters and Setters.
   */
  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  /**
   * Convert the class to string.
   */
  @Override
  public String toString() {
    return "Book " + this.getTitle() + " written by " + author.toString();
  }
}
