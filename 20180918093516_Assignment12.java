
package assignment12;

import java.util.Scanner;


public class Assignment12 {

    
    public static void main(String[] args) {
        
        int n,i,j,k;
       
        Scanner console = new Scanner(System.in);
        
        System.out.println("How many lines: ");
        n = console.nextInt();
        for(i=n;i>=1;i--)
        {
            for(j=0;j<=n-i;j++){
                System.out.print(" ");
        }
            k=0;
            while(k!=(2*i-1)){
             System.out.print("*");
             k++;
            }

            System.out.print("\n");
             
}
    }
}



