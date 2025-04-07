package fr.ensai.library;

/**
 * Represents a Person.
 */
public abstract class Person {

  // Attributes
  private String name;
  private int age;

  /**
   * Constructs a new Person object with default values (null, 0).
   */
  public Person() {
    this.name = null; // Ou "" si besoin
    this.age = 0;
  }

  /**
   * Constructs a new Person object with given name and age.
   */
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
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

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  /**
   * Abstract method equals.
   * Forces subclasses to implement their own version.
   */
  @Override
  public abstract boolean equals(Object obj);

  /**
   * Abstract method hashCode.
   * Forces subclasses to implement their own version.
   */
  @Override
  public abstract int hashCode();

  /**
   * Abstract method toString.
   * Forces subclasses to implement their own version.
   */
  @Override
  public abstract String toString();
}
