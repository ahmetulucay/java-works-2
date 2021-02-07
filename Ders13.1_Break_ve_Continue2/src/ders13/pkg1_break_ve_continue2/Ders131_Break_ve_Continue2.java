/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders13.pkg1_break_ve_continue2;

/**
 *
 * @author Eier
 */
public class Ders131_Break_ve_Continue2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i=0;
        
        while (i<10) {
            
            if (i == 4 || i == 7){
                i++;
            
                continue;
            }
        System.out.println("i: " + i);
        i++;
        }
    }
    
}
