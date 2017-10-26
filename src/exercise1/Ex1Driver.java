package exercise1;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

/**
 * @author Austin Uetz
 * @assignment Exercise 1
 */
public class Ex1Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = rnd.nextInt(10);
    }
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8(numbers);
    task9();
    task10();
  }

  /**
   * TODO: Task 1: Print "Hello World" to the default system output
   */
  public static void task1() {
    System.out.println("---Task 1---");
    System.out.println("Hello World");
  }
  /**
   * TODO: Task 2: Print all numbers between 1 and 100 (inclusive) replacing all multiples of 3 with "foo", multiples of 5 with "bar", multiples of 3 and 5 with "huh"
   */
  public static void task2() {
    System.out.println();
    System.out.println("---Task 2---");
    for (int i=1; i<=100; ++i) {
        if (i%15 == 0) {
            System.out.println("huh");
        } 
        else if (i%5 == 0) {
            System.out.println("bar");
        }
        else if (i%3 == 0) {
            System.out.println("foo");
        }
        else
            System.out.println(i);
    }
  }
  /**
   * TODO: Task 3: Calculate and print the sum of all multiples of 7 between 1 and 100 (inclusive)
   */
  public static void task3() {
    System.out.println();
    System.out.println("---Task 3---");      
    int sum = 0;
    for (int i=0; i<=100; ++i) {
        if (i % 7 == 0) {
            sum = sum + i;
        }
    }
    System.out.println("The sum of all multiples of 7 between 1 and 100 is " + sum);
  }
  /**
   * TODO: Task 4: Calculate and print sum and product of all numbers between 1 and 20 (inclusive)
   */
  public static void task4() {
    System.out.println();
    System.out.println("---Task 4---");      
    int sum = 0;
    long product = 1;
    for (int i=1; i<=20; ++i) {
        sum = sum + i;
        product = product * i;
    }
    System.out.println("The sum of all numbers between 1 and 20 is " + sum);
    System.out.println("The product of all numbers between 1 and 20 is " + product);
  }
  /**
   * TODO: Task 5: Ask a user to enter their full name and print the initials (ie John Q Doe should yield JQD)
   */
  public static void task5() {
    System.out.println();
    System.out.println("---Task 5---");      
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("Enter your full name%n");
    String fullName = keyboard.nextLine();
    String[] arrayName = fullName.split(" ");
    System.out.print("Your initials are: ");
    for (int i = 0; i < arrayName.length; ++i) {
        System.out.print(arrayName[i].charAt(0));
    }
    System.out.println();
  }
  /**
   * TODO: Task 6: Create an array of 10 elements and initiate each element in it to the cube of its index (Do it in a loop, not during declaration)
   */
  public static void task6() {
    System.out.println();
    System.out.println("---Task 6---");      
    int[] array = new int[10];
    for (int i = 0; i < array.length; ++i) {
        array[i] = i * i * i;
    }
    for (int i=0; i < array.length; ++i) {
        System.out.println(array[i]);
    }
  }
  /**
   * TODO: Task 7: Create an array of 100 random integers between 1 and 100, ask the user for an integer and tell if that number is in the array
   */
  public static void task7() {
    System.out.println();
    System.out.println("---Task 7---");      
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] randArray = new int[100];
    for (int i=0; i < randArray.length; ++i) {
        randArray[i] = rnd.nextInt();
    }
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("Enter an integer to check if it is in the array%n");
    int userNum = keyboard.nextInt();
    boolean found = false;
    for (int i=0; i < randArray.length; ++i) {
        if (randArray[i] == userNum) {
            found=true;
            System.out.println("Your number is in the array");
            break;
        }
    }
    if (found==true) {
        System.out.println("Your number is in the array");
    } else
        System.out.println("Your number is not in the array");
  }
  /**
   * TODO: Task 8: Take an array of integers as a parameter, calculate, print, and return the sum of its elements
   * @param numbers
   * @return 
   */
  public static int task8(int[] numbers) {
    System.out.println();
    System.out.println("---Task 8---");      
      int sum = 0;
      for (int i = 0; i < numbers.length; ++i) {
          sum = sum + numbers[i];
      }
      System.out.println("The sum of all items in " + Arrays.toString(numbers) + " is " + sum);
      return sum;
  }
  /**
   * TODO: Task 9: Ask a user to enter a word and write a function that tells if letters of a word are ordered (ie. "buy" would return true, while "bye" - false).
   * @return 
   */
  public static boolean task9() {
    System.out.println();
    System.out.println("---Task 9---");      
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a word");
    String word = keyboard.nextLine();
    boolean ordered = true;
    for (int i=0; i < word.length()-1; ++i) {
        if ((int)word.charAt(i) > (int)word.charAt(i+1)) {
            System.out.println("Letters of " + word + " are NOT in order");
            ordered = false;
            return ordered;
        }
        
        } System.out.println("Letters of " + word + " ARE in order");
    return ordered;
  }
 
  /**
   * TODO: Task 10: Implement sieve of Eratosthenes and print all prime numbers between 1 and 100
   */
  public static void task10() {
    System.out.println();
    System.out.println("---Task 10---");      
    int[] array = new int[100];
    System.out.println("Prime numbers between 1 and 100");
    for (int i=2; i < array.length; ++i) {
        if (array[i] == 0) {
            System.out.print(i + " ");
        }
        for (int x=i; x < array.length; x+=i) {
            array[x] = 1;
        }
    }
  }

}
