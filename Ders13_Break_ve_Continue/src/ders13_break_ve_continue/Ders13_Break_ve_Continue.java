/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders13_break_ve_continue;

/**
 *
 * @author Eier
 */
import java.util.Scanner;

public class Ders13_Break_ve_Continue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        while(true){
            
            Scanner scan = new Scanner(System.in);
            String s;
            
            System.out.println("Karakter giriniz: ");
            s = scan.nextLine();
            
            if (s.equals("q")){
                
                System.out.println("Programdan cikiliyor.");
                
                break;
            }
            System.out.println("Karakter: " + s);
        }
    }
    
}
