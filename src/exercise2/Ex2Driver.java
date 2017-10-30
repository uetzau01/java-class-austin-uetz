package exercise2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Austin Uetz
 * @assignment Exercise 2
 */
public class Ex2Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numberArr = new int[10];
    for (int i = 0; i < 10; i++) {
      numberArr[i] = rnd.nextInt(100);
    }
    ArrayList<Integer> numberLst = new ArrayList();
    for (int i = 0; i < 10; i++) {
      numberLst.add(rnd.nextInt(100));
    }
    nHeads(3);
    System.out.println(task2(numberArr, 90));
    System.out.println(task3(numberArr, 75));
    task4(numberArr);
    task5(numberArr);
    task6();
    task7();
    System.out.println(task8(numberLst, 75));
    task9();
    task10(task9());

  }

  /**
   * TODO: Task 1: Define and call a function nHeads() that takes a number (n) as a parameter and prints the result of coin flips ("Heads" or "Tails" with equal probability) until there are n "Heads" in a row. Seed the randomizer in the main() function.
   * @param n
   */
  public static void nHeads(int n) {
    System.out.println();
    System.out.println("---Task 1---");
    Random coin = new Random();
    coin.setSeed(252);
    int streak = 0;
    while (streak < n) {
        int outcome = coin.nextInt(2);
        if (outcome == 1) {
            System.out.print("heads  ");
            streak = streak + 1;
            System.out.println("streak = " + streak);
        }
        if (outcome == 0) {
            System.out.print("tails  ");
            streak = 0;
            System.out.println("streak = " + streak);
        }
    }
  }
  /**
   * TODO: Task 2: Define a function that takes an array of integers and a number as parameters and returns boolean True if the number provided is larger than every element of the array, False otherwise.
   * @param arr
   * @param n
   * @return 
   */
  public static boolean task2(int[] arr, int n) {
    System.out.println();
    System.out.println("---Task 2---");
    boolean result = true;
    for (int i=0; i < arr.length; i++) {
        if (n < arr[i]) {
            result = false;
            return result;
        }
    }
    return result;
  }
  /**
   * TODO: Task 3: Write a function that takes an array of integers and a threshold and prints how many values are below the threshold.
   * @param arr
   * @param threshold
   * @return 
   */
  public static int task3(int[] arr, int threshold) {
    System.out.println();
    System.out.println("---Task 3---");
    int count = 0;
    for (int i=0; i < arr.length; ++i) {
        if (arr[i] < threshold) {
            count = count + 1;
        }
    }
    return count;
  }
  /**
   * TODO: Task 4: Write a function that takes an array of integers as a parameter, finds the difference between 100 and the largest element of the array and adds this difference to every element in the array. (Note: after this function call the largest value in the array must be 100.)
   * @param arr
   */
  public static void task4(int[] arr) {
    System.out.println();
    System.out.println("---Task 4---");
    int largest = 0;
    for (int i=0; i < arr.length; ++i) {
        if (arr[i] >= largest) {
            largest = arr[i];
        }
    }
    int difference = 100 - largest;
    for (int x=0; x < arr.length; ++x) {
        arr[x] = arr[x] + difference;
    } 
  }
  /**
   * TODO: Task 5: Write a function that takes an array of integers as a parameter and, assuming the values are scores, prints number of students with 'A', 'B', 'C', 'D' and 'F'.
   * @param arr
   */
  public static void task5(int[] arr) {
    System.out.println();
    System.out.println("---Task 5---");
    int numA = 0;
    int numB = 0;
    int numC = 0;
    int numD = 0;
    int numF = 0;
    for (int i=0; i < arr.length; ++i) {
        if (arr[i] >= 90) {
            ++numA;
        }
        else if (arr[i] >= 80) {
            ++numB;
        }
        else if (arr[i] >= 70) {
            ++numC;
        }
        else if (arr[i] >= 60) {
            ++numD;
        }
        else
            ++numF;
    }
    System.out.println(numA + " students had A's");
    System.out.println(numB + " students had B's");
    System.out.println(numC + " students had C's");
    System.out.println(numD + " students had D's");
    System.out.println(numF + " students had F's");
  }
  /**
   * TODO: Task 6: Create an ArrayList of double values and ask a user to start entering numbers. Keep asking and adding numbers to the ArrayList until the user enters 0, then stop and print all the values in the ArrayList. Use function add() to add a number to an ArrayList.
   */
  public static void task6() {
    System.out.println();
    System.out.println("---Task 6---");
    ArrayList<Double> arr = new ArrayList();
    Scanner kb = new Scanner(System.in);
    double newNum = 0.0;
    System.out.println("Enter a number to add (enter 0 to stop)");
    newNum = kb.nextDouble();
    
    while (newNum != 0) {
        arr.add(newNum);
        System.out.println("Enter another number (0 to stop)");
        newNum = kb.nextDouble();
    }
    
    for (int i=0; i< arr.size(); ++i) {
        System.out.print(arr.get(i) + " ");
    }
    System.out.println();
  }
  /**
   * TODO: Task 7: Create an ArrayList of integer values of size 10 and initialize each element of the ArrayList to a random number between 50 and 100.
   */
  public static void task7() {
    System.out.println();
    System.out.println("---Task 7---");
    ArrayList<Integer> arr = new ArrayList();
    Random rand = new Random();
    for (int i=0; i < 10; ++i) {
        arr.add(rand.nextInt(50) + 50);
    }
   System.out.println(arr);
  } 
  /**
   * TODO: Task 8: Define a function that takes an ArrayList of integer values and a threshold as parameters and returns the number of values in the ArrayList below a threshold. You may use the ArrayList created at the previous step.
   * @param arrLst
   * @param threshold
   * @return 
   */
  public static int task8(ArrayList<Integer> arrLst, int threshold) {
    System.out.println();
    System.out.println("---Task 8---");
    int count = 0;
    for (int i=0; i<arrLst.size(); ++i) {
        if (arrLst.get(i) < threshold) {
            ++count;
        }
    } return count;
  }
  /**
   * TODO: Task 9: Generate a 2-dimensional array of size 10x10. Initialize values in the array to the values in the multiplication table of size 10. (e.g. values in the intersections must start with 1 (1x1) and go all the way up to 100). Print the array and return it.
   * @return 
   */
  public static int[][] task9() {
    System.out.println();
    System.out.println("---Task 9---");
      int[][] matrix = new int[10][10];
      for (int i=0; i < matrix.length; ++i) {
          for (int j=0; j < matrix[0].length; ++j) {
              matrix[i][j] = (i+1)*(j+1);
          }
      }
    for (int i=0; i < matrix.length; ++i) {
          for (int j=0; j < matrix[0].length; ++j) {
              System.out.printf("%4d", matrix[i][j]);
          }
          System.out.println();
  } return matrix;
  }
  /**
   * TODO: Task 10: Calculate and print the sum of values in each row and each column of the matrix generated at the previous step.
   * @param matrix
   */
  public static void task10(int[][] matrix) {
    System.out.println();
    System.out.println("---Task 10---");
    for (int i=0; i < matrix.length; ++i) {
        int rowSum = 0;
        for (int j=0; j < matrix[0].length; ++j) {
            rowSum = rowSum + matrix[i][j];
        } System.out.println("Row " + (i + 1) + " sum = " + rowSum);
    }
    System.out.println();
    for (int i=0; i < matrix.length; ++i) {
        int columnSum = 0;
        for (int j=0; j < matrix[0].length; ++j) {
            columnSum = columnSum + matrix[j][i];
        } System.out.println("Column " + (i + 1) + " sum = " + columnSum);  
    }
  }

}
