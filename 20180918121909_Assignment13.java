
package assignment13;

import java.util.Scanner;

public class Assignment13 {

    
    public static void main(String[] args) {
       
        int markCount;
        int total=0;
        float avg;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("How many mark for the student? ");
        markCount = keyboard.nextInt();
        
        int[] marks = new int[markCount];
        
        int i;
        for(i=0;i<markCount;i++)
        {
            System.out.print("Please enter mark" + (i+1) + ":");
            marks[i] = keyboard.nextInt();
            
        }
         System.out.print("The marks are: ");
        for(i=0;i<markCount;i++){
               
             total = total + marks[i];
             System.out.print(marks[i] );
             if(i<markCount-1) {
             System.out.print(", ");
        }
            
             
             
        }
        
        avg = (float) total/markCount;
        System.out.println(" ");
        System.out.println("the average is: " +avg);
        
        
        
        
    }
    
}


        
        
                