
package assignment19;

import java.util.Scanner;
import java.util.Random;


public class Assignment19 {

    public static void main(String[] args) {
          
        int i;
        int j;
        Random randomobj = new Random();
        Scanner keybord = new Scanner(System.in);
        int askNumber;
        
        System.out.println("How many lines? ");
        askNumber = keybord.nextInt();
        for (i=0;i<askNumber;i++)
        {
            int  number=randomobj.nextInt(10);
            for(j=0;j<10;j++)
            {
                if (j==number){
                    System.out.print("*");
                }
                else
                {
                    System.out.print("-");
                }
            }
         System.out.println("");  
        }
    }
    
}
