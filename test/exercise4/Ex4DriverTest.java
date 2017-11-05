/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Austin Uetz
 * @assignment Exercise 4
 */
public class Ex4DriverTest {
  
  public Ex4DriverTest() {
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
     * Test of task1 method, of class Ex4Driver.
     */
    @Test
    public void testTask1() {
        System.out.println("task1");
        Integer n = 10;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 20;
        Integer result = instance.task1(n);
        assertEquals(expResult, result);
        
        n = 5;
        expResult = 10;
        result = instance.task1(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of task2 method, of class Ex4Driver.
     */
    @Test
    public void testTask2() {
        System.out.println("task2");
        String s = "cat";
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 3;
        Integer result = instance.task2(s);
        assertEquals(expResult, result);
        
        s = "kitten";
        expResult = 6;
        result = instance.task2(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of task3 method, of class Ex4Driver.
     */
    @Test
    public void testTask3() {
        System.out.println("task3");
        Character c = 'A';
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 65;
        Integer result = instance.task3(c);
        assertEquals(expResult, result);
        
        c = 'B';
        expResult = 66;
        result = instance.task3(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of task4 method, of class Ex4Driver.
     */
    @Test
    public void testTask4() {
        System.out.println("task4");
        String s = "Hello";
        Ex4Driver instance = new Ex4Driver();
        Character expResult = 'H';
        Character result = instance.task4(s);
        assertEquals(expResult, result);
        
        s = "world!";
        expResult = 'w';
        result = instance.task4(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of task5 method, of class Ex4Driver.
     */
    @Test
    public void testTask5() {
        System.out.println("task5");
        Integer n1 = 4;
        Integer n2 = 2;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 8;
        Integer result = instance.task5(n1, n2);
        assertEquals(expResult, result);
        
        n1 = 3;
        n2 = 8;
        expResult = 24;
        result = instance.task5(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of task6 method, of class Ex4Driver.
     */
    @Test
    public void testTask6() {
        System.out.println("task6");
        String s = "Austin";
        Integer n = 3;
        Ex4Driver instance = new Ex4Driver();
        Character expResult = 't';
        Character result = instance.task6(s, n);
        assertEquals(expResult, result);
        
        s = "Uetz";
        n = 0;
        expResult = 'U';
        result = instance.task6(s, n);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of task7 method, of class Ex4Driver.
     */
    @Test
    public void testTask7() {
        System.out.println("task7");
        Integer[] arr = new Integer[4];
        for (int i=0; i<4; ++i) {
            arr[i] = i;
        }
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 6;
        Integer result = instance.task7(arr);
        assertEquals(expResult, result);
        
        Integer[] arr2 = new Integer[4];
        for (int i=0; i<4; ++i) {
            arr2[i] = (i + 1);
        }
        expResult = 10;
        result = instance.task7(arr2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of task8 method, of class Ex4Driver.
     */
    @Test
    public void testTask8() {
        System.out.println("task8");
        Integer[] arr = new Integer[6];
        Integer n = 3;
        Ex4Driver instance = new Ex4Driver();
        Boolean expResult = false;
        Boolean result = instance.task8(arr, n);
        assertEquals(expResult, result);
        
        Integer[] arr2 = new Integer[6];
        for (int i=0; i<arr2.length; ++i) {
            arr2[i] = 0;
        }
        n = 0;
        expResult = true;
        result = instance.task8(arr2, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of task9 method, of class Ex4Driver.
     */
    @Test
    public void testTask9() {
        System.out.println("task9");
        ArrayList<String> arrLst = new ArrayList();
        arrLst.add("hello");
        arrLst.add("world");
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 2;
        Integer result = instance.task9(arrLst);
        assertEquals(expResult, result);
        
        arrLst.add("!!!");
        expResult = 3;
        result = instance.task9(arrLst);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of task10 method, of class Ex4Driver.
     */
    @Test
    public void testTask10() {
        System.out.println("task10");
        HashMap<String, Integer> h = new HashMap();
        h.put("Austin", 2);
        h.put("Uetz", 6);
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 8;
        Integer result = instance.task10(h);
        assertEquals(expResult, result);
        
        HashMap<String, Integer> h2 = new HashMap();
        h2.put("Hello", 10);
        h2.put("World", 20);
        h2.put("!!!!", 30);
        expResult = 12;
        result = instance.task10(h2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
