package exercise4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Austin Uetz
 * @assignment Exercise 4
 */
public class Ex4Driver {
  /* Define a function that takes 1 integer as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
  public Integer task1(Integer n) {
      return n * 2;
  }
  
  /* Define a function that takes 1 string as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
  public Integer task2(String s) {
      //return length of string
      int n = 0;
      n = s.length();
      return n;
  }
  /* Define a function that takes 1 character as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
  public Integer task3(Character c) {
      //return ascii value of character
      int n = (int) c;
      return n;
  }
 /* Define a function that takes 1 string as a parameter and returns a character. Write 2 unit tests to verify the function validity. */
  public Character task4(String s) {
      //return the first character of a string
      char c = s.charAt(0);
      return c;
  }
  /* Define a function that takes 2 integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
  public Integer task5(Integer n1, Integer n2) {
      //returns the value of n1 * n2
      int n3 = n1 * n2;
      return n3;
  }
  /* Define a function that takes a string and an integer as parameters and returns a Character. Write 2 unit tests to verify the function validity. */
  public Character task6(String s, Integer n) {
      //returns character c of string s at location int n
      char c = s.charAt(n);
      return c;
  }
  /* Define a function that takes an array of integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
  public Integer task7(Integer[] arr) {
      //return sum of all integers in array
      int n = 0;
      for (int i=0; i<arr.length; ++i) {
          n = n + arr[i];
          }
      return n;
      }
      
  /* Define a function that takes an array of integers and an integer as parameters and returns a boolean. Write 2 unit tests to verify the function validity. */
  public Boolean task8(Integer[] arr, Integer n) {
      //return true or false if the first integer in arr = n
      return arr[0] == n;
  }

  /* Define a function that takes an ArrayList of Strings as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
  public Integer task9(ArrayList<String> arrLst) {
      //returns the size of the array as an int
      return arrLst.size();
  }
  /* Define a function that takes a HashMap (exact details are up to you) as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
  public Integer task10(HashMap<String, Integer> h) {
      //returns size of HashMap * 4
      int n = h.size();
      n = n * 4;
      return n;
  }
}
