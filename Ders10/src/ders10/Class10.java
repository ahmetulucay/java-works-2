/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class10;

/**
 *
 * @author Eier
 */
import java.util.Scanner;

public class Class10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     Scanner scan = new Scanner(System.in);
     
        System.out.println("Write a number: ");
        
        int no = scan.nextInt();
        
        int no1 = no ;
        
        int factorial = 1;
        
        while (no>=1){
        
            factorial = factorial * no ;
            
            System.out.println("Factorial= "+factorial+", Number= "+ no);
            
            no --;
        }    
        System.out.println("Factorial of the number " no1+ " is " + factorial);
     
    }
    
}
