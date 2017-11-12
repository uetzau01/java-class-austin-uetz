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
 * Testing LemurConspiracy
 * @author yasiro01
 */
public class LemurConspiracyTest {
  LemurConspiracy instance1;
  LemurConspiracy instance2;
  
  public LemurConspiracyTest() {
      try {
          this.instance2 = new LemurConspiracy("data/zoo2.txt");
          this.instance1 = new LemurConspiracy("data/zoo1.txt");
      } catch (IOException ex) {
          Logger.getLogger(LemurConspiracyTest.class.getName()).log(Level.SEVERE, null, ex);
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
   * Test of size method, of class LemurConspiracy.
   */
  @Test
  public void testSize() {
    System.out.println("LemurConspiracy.size");
    int expResult = 4;
    int result = instance1.size();
    assertEquals(expResult, result);
    expResult = 5;
    result = instance2.size();
    assertEquals(expResult, result);
  }

  /**
   * Test of getChief method, of class LemurConspiracy.
   */
  @Test
  public void testGetChief() {
    System.out.println("LemurConspiracy.getChief");
    Lemur expResult = new Lemur("Underrated Thunder", 74);
    Lemur result = instance1.getChief();
    assertEquals(expResult, result);
    expResult = new Lemur("Joyful Juggernaut", 43);
    result = instance2.getChief();
    assertEquals(expResult, result);
  }
  
}
