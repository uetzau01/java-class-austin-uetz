package exercise8;

/**
 * Class Item
 * @author yasiro01
 */
public abstract class Item {
  protected final long id;
  protected final String title;
  protected int quantity;

    public Item(long id, String title, int quantity) {
        this.id = id;
        this.title = title;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
  
  /**
   * Get the item availability
   * @return true if quantity > 0
   */
  public boolean isAvailable() {
    return quantity > 0;
  }

  /**
   * Check out an item (decrease quantity by 1, if possible
   */
  public void checkout() {
    if (quantity > 1) {
        quantity = quantity - 1;
    }
    else {
      System.out.println("No copies available");
    }
  }

  /**
   * Check in an item
   */
  public void checkin() {
      quantity = quantity + 1;
  }
  
  @Override
  public String toString() {
      if (quantity > 1) {
        return String.format("We have %d copies of %s",quantity, title);
      }
      else {
          return String.format("We have a copy of %s", title);
      }
  }

  /**
   * Get the item information
   * @return item information, type-specific
   */
  public abstract String getInfo();
  
}
