package exercise10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class BookShop
 * @author yasiro01
 */
public class BookShop {
    ArrayList<Book> catalog;

  public BookShop() {
      catalog = new ArrayList();
  }
  
  public BookShop(String filename) throws FileNotFoundException, IOException {
      this();
      BufferedReader reader = new BufferedReader(new FileReader(filename));
      
      String line = null;
      String author = null;
      String title = null;
      Double price = null;
      Integer year = null;
      
      while ((line = reader.readLine()) != null) {
          String[] bookInfo = line.split(",");
          title = bookInfo[0];
          author = bookInfo[1];
          price = Double.parseDouble(bookInfo[2]);
          year = Integer.parseInt(bookInfo[3]);
          
          catalog.add(new Book(title, author, price, year));
      }
  }
  
  public BookShop(BookShop anotherBookShop) {
      this();
      for (Book b: anotherBookShop.catalog) {
          catalog.add(b);
      }
  }
  
  public void addNewTitle(Book book) {
      catalog.add(book);
  }
  
  public int size() {
      return catalog.size();
  }
  
  public void discountAll(Double discountPercent) {
      for (Book b: this.catalog) {
          b.price = b.price - (b.price * discountPercent/100);
      }
  }
  
  public void printCatalog() {
      for (Book b: this.catalog) {
          System.out.println(b.toString());
      }
  }
  
  public void order(Comparator<Book> comp) {
      Collections.sort(catalog, comp);
  }
  
  public ArrayList<Book> getCatalog() {
      ArrayList<Book> list = new ArrayList<>();
      for (Book b: this.catalog) {
          list.add(b);
      }
      return list;
  }

}
