package fr.ensai.library;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

  // Attributes
  private String name;
  private List<Item> items;

  /**
   * Constructs a new Library object.
   */
  public Library(String name, List<Item> items) {
    this.name = name;
    this.items = items;
  }

  /**
   * Getters and Setters.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  /**
   * Adds an item to the Library.
   */
  public void addItem(Item item) {
    this.items.add(item);
  }

  /**
   * Print all items of the Library.
   */
  public void displayBooks() {
    if (!this.items.isEmpty()) {
      for (Item item : this.items) {
        System.out.println(item.toString());
      }
    } else {
      System.out.println("There are no books in the Library " + this.name);
    }
  }

  /**
   * Loads books from a CSV file and adds them to the library.
   *
   * @param filePath The path to the CSV file containing book data.
   * @throws IOException If there is an error reading the file, an
   *                     {@link IOException} will be thrown.
   */
  public void loadBooksFromCSV(String filePath) {
    URL url = getClass().getClassLoader().getResource(filePath);

    try (
      BufferedReader br = new BufferedReader(new FileReader(url.getFile()))
    ) {
      Map<String, Author> authors = new HashMap<>();
      String line;
      br.readLine(); // Skip the header line

      while ((line = br.readLine()) != null) {
        String[] data = line.split(",");

        if (data.length == 5) {
          String isbn = data[0].trim();
          String title = data[1].trim();
          String authorName = data[2].trim();
          int year = Integer.parseInt(data[3].trim());
          int pageCount = Integer.parseInt(data[4].trim());

          // Check if author already exists in the map
          Author author = authors.get(authorName);
          if (author == null) {
            author = new Author(authorName);
            authors.put(authorName, author);
            System.out.println(author.toString());
          }
          Book book = new Book(isbn, title, author, year, pageCount);

          this.addItem(book);
        }
      }
    } catch (IOException e) {
      System.err.println("Error reading the file: " + e.getMessage());
    }
  }
}
