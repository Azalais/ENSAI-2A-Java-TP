package fr.ensai.library;

public class Main {

  public static void main(String[] args) {
    Library library = new Library("La Nuit des Temps");

    library.loadBooksFromCSV("books.csv");

    library.displayBooks();
  }
}
