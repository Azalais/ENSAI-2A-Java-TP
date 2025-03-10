package fr.ensai.library;

import java.util.Objects;

/**
 * Represents an Author.
 */
public class Author extends Person {

  // Attributes
  private String nationality;

  /**
   * Constructs an Author with only a name (age defaults to 0, nationality to null).
   */
  public Author(String name) {
    super(name, 0); // Initialise le nom, âge par défaut à 0
    this.nationality = null;
  }

  /**
   * Constructs an Author with name, age, and nationality.
   */
  public Author(String name, int age, String nationality) {
    super(name, age);
    this.nationality = nationality;
  }

  /**
   * Getters and Setters.
   */
  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   * Two authors are considered equal if their names are equal.
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;

    Author author = (Author) obj;
    return Objects.equals(getName(), author.getName());
  }

  /**
   * Define a hash function for the class.
   */
  @Override
  public int hashCode() {
    return Objects.hash(getName());
  }

  /**
   * Convert the class to string.
   */
  @Override
  public String toString() {
    return "Author " + getName() + " (" + nationality + ")";
  }
}
