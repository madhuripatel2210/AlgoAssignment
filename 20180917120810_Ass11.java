
package ass11;

import java.util.Scanner;


public class Ass11 {

    
    public static void main(String[] args) {
        
        int i,n,j;
        
        Scanner console = new Scanner(System.in);
        
        System.out.println("How many lines: ");
        n = console.nextInt();
        
        for (i=1; i<=n; i++) {
            for (j=1; j<=i; j++){
             System.out.print("*");   
        }
            
      System.out.println(" ");
    }
    }
    
}
