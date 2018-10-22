
package assignment14;

import java.util.Scanner;


public class Assignment14 {

  
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter The Number Of Students");
        int row = scan.nextInt();
        System.out.println("Enter The Number Of Subjects");
        int col = scan.nextInt();
        
        int[][] array = new int [row][col];
        
        enterData(scan, array, row, col);
        
         print(array, row, col);
    }
    
    public static void enterData(Scanner scan, int[][] array, int row, int col)
    {
     System.out.println("Enter Data");
          
          for (int i = 0; i < row; i++)
          {
              for (int j = 0; j < col; j++)
              {
                  array[i][j] = scan.nextInt();
              }
          }
  }
     public static void print(int[][] array, int row, int col){
    System.out.println("Your Matrix is : ");
        
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.print("|-----");
            }
            System.out.println("|");
            
            for (int j = 0; j < col; j++)
            {
                System.out.print(String.format("| %3d ",array[i][j]));
            }
             
            System.out.println("|");
        }
        for (int j = 0; j < col; j++)
            {
                System.out.print("|-----");
            }
            System.out.println("|");
            
  }
}
