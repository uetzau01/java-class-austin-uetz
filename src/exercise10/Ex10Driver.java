package exercise10;

import java.io.IOException;

/**
 * Exercise 10 Driver
 * @author yasiro01
 */
public class Ex10Driver {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws IOException {
      BookShop shop1 = new BookShop("data/library1.txt");
      BookShop shop2 = new BookShop("data/library2.txt");
      shop1.discountAll(.10);
    
    
      System.out.println(shop1.getCatalog().get(0).getPrice());
      shop1.printCatalog();
  }
  
  
  
}
