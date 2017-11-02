package exercise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Austin Uetz
 * @assignment Exercise 3
 */
public class Ex3Driver {
  public static final String PATH = "data/";
  /**
   * main application function
   * @param args 
   */
  public static void main(String[] args) throws IOException {
    int[][] matrix1 = null;
    int[][] matrix2 = null;
    int[][] result = null;
    try {
      matrix1 = readFile(PATH + "matrix1.txt");
      matrix2 = readFile(PATH + "matrix2.txt");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, ex.toString(), ex);
    }
    System.out.println("Matrix 1");
    printMatrix(matrix1);
    System.out.println("Matrix 2");
    printMatrix(matrix2);
    if (matrix1[0].length == matrix2.length) {
      result = multiply(matrix1, matrix2);
    } else {
      Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, "{0}", "Impossible to multiply matrices");
      System.exit(0);
    }
    System.out.println("Result");
    printMatrix(result);
    try {
      writeMatrix(result, PATH + "result.txt");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, ex.toString(), ex);
    }
  }
  /**
   * Print a matrix
   * @param matrix to print
   */
  public static void printMatrix(int[][] matrix) {
    for (int[] row: matrix) {
      for (int item: row) {
        System.out.printf("%5d", item);
      }
      System.out.printf("%n");
    }
  }
  /**
   * Write a matrix to the file
   * @param matrix 
   * @param filename 
   * @throws java.io.FileNotFoundException 
   */
  public static void writeMatrix(int[][] matrix, String filename) throws FileNotFoundException {
    throw new UnsupportedOperationException();
  }
  /**
   * Read a matrix from a file
   * @param filename
   * @return matrix read from a file
   * @throws java.io.FileNotFoundException
   */
  public static int[][] readFile(String filename) throws FileNotFoundException {
    int col = 0;
    int row = 0;

    File file = new File(filename);
    BufferedReader reader = new BufferedReader(new FileReader(file));
    Scanner scn = new Scanner(reader);
    
    String dimensions = scn.nextLine();
    System.out.println(dimensions);
    int dimensionList[] = dimensions.split("\\s+");
    row = dimensionList[0];
    col = dimensionList[1];
    int[][] matrix = new int[row][col];
    
    while (scn.hasNextLine()) {
        for (int i=0; i<row; ++i) {
            
        }
        
    } return matrix;
    /*
    10. Open the input file and create a Scanner object to read its content
    20. Read two values (rows and columns) from the first line, if possible
    30. Create a new 2-D array
    40. Read data from the file, one line at a time, using the Scanner object
    50. Split each line into individual tokens and put them into your array
    60. Return the array
    */
  }
  /**
   * Multiply two matrices
   * @param matrix1
   * @param matrix2
   * @return the resulting matrix
   */
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
    int m1Row = matrix1.length;
    int m1Col = matrix1[0].length;
    int m2Row = matrix2.length;
    int m2Col = matrix2[0].length;
    int[][] resultMatrix = new int[m1Row][m2Col];
    
    //got help from stack overflow
    if (m1Col != m2Row) {
        throw new IllegalArgumentException("ERROR: You cannot multiple those matrices");
    }
    for (int i=0; i < m1Row; ++i) {
        for (int j=0; j < m2Col; ++j) {
            for (int k=0; k< m1Col; ++k) {
                resultMatrix[i][j] = resultMatrix[i][j] + (matrix1[i][k]*matrix2[k][j]);
            }
        }
    }
//    for (int i=0; i<resultMatrix.length; ++i) {
//        for (int j=0; j<resultMatrix[0].length; ++j) {
//            System.out.print(resultMatrix[i][j] + " ");
//        } System.out.println();
//    }
   return resultMatrix; 
  }
}
