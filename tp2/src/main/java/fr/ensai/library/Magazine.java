package fr.ensai.library;

/**
 * Represents a magazine.
 */
public class Magazine extends Item {

  // Attributes
  private String issn;
  private String issueNumber;

  /**
   * Constructs a new Book object.
   */
  public Magazine(
    String issn,
    String title,
    String issueNumber,
    int year,
    int pageCount
  ) {
    super(title, year, pageCount);
    this.issn = issn;
    this.issueNumber = issueNumber;
  }

  /**
   * Getters and Setters.
   */

  public String getIssn() {
    return issn;
  }

  public void setIssn(String issn) {
    this.issn = issn;
  }

  public String getIssueNumber() {
    return issueNumber;
  }

  public void setIssueNumber(String issueNumber) {
    this.issueNumber = issueNumber;
  }

  /**
   * Convert the class to string.
   */
  @Override
  public String toString() {
    return "Magazine " + this.getTitle() + " n°" + this.issueNumber;
  }
}
