package fr.ensai.library;

/**
 * Represents an Item.
 */
public abstract class Item {

  // Attributes
  private String title;
  private int year;
  private int pageCount;

  /**
   * Constructs a new Item object.
   */
  public Item(String title, int year, int pageCount) {
    this.title = title;
    this.year = year;
    this.pageCount = pageCount;
  }

  /**
   * Getters and Setters.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getPageCount() {
    return pageCount;
  }

  public void setPageCount(int pageCount) {
    this.pageCount = pageCount;
  }

  /**
   * Abstract method toString.
   * Forces subclasses to implement their own version.
   */
  @Override
  public abstract String toString();
}
