package exercise6;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testing OwlParliament
 * @author yasiro01
 */
public class OwlParliamentTest {
  OwlParliament instance1;
  OwlParliament instance2;
  
  public OwlParliamentTest() {
      try {
          this.instance2 = new OwlParliament("data/zoo2.txt");
          this.instance1 = new OwlParliament("data/zoo1.txt");
      } catch (IOException ex) {
          Logger.getLogger(OwlParliamentTest.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of size method, of class OwlParliament.
   */
  @Test
  public void testSize() {
    System.out.println("OwlParliament.size");
    int expResult = 4;
    int result = instance1.size();
    assertEquals(expResult, result);
    expResult = 5;
    result = instance2.size();
    assertEquals(expResult, result);
  }

  /**
   * Test of getChief method, of class OwlParliament.
   */
  @Test
  public void testGetChief() {
    System.out.println("OwlParliament.getChief");
    Owl expResult = new Owl("Earring", 87);
    Owl result = instance1.getChief();
    assertEquals(expResult, result);
    expResult = new Owl("Juggernaut", 93);
    result = instance2.getChief();
    assertEquals(expResult, result);
  }
  
}
