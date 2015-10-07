/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog5;

import java.util.Scanner;

/**
 *
 * @author balvarezescudero
 */
public class PROG5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float valor = 1852 , millas ;
        
        System.out.print ("Milla=");
        Scanner obx = new Scanner (System.in);
        millas = obx.nextFloat();
        System.out.print("Metros =" + valor*millas );
        
                
    }
    
}
