
package oddeven;

import java.util.Scanner;
import java.util.Random;

public class Oddeven {

 
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*int number;
        
        for(number=1; number<=1024 ;number++)
        {
            if (number % 2 == 0)
            {
                System.out.println(number +"Number is even");
            }
            else
            {
                System.out.println(number +"Number is odd");
            }
           
        }*/
        int i;
        Random randomobj = new Random();
        Scanner keybord = new Scanner(System.in);
        int askNumber;
       
        System.out.println("How many number");
        askNumber = keybord.nextInt();
        
        for (i=0;i<askNumber;i++)
        {
           int  number=randomobj.nextInt(800);
           if (number%2==0)
           {
               System.out.println(number+" number is even");
           }
           else
           {                       
               System.out.println(number+" number is Odd");
           }
        }
    }
    
}
