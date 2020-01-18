/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cube;

import java.util.Scanner;

/**
 *
 * @author abishek
 */
public class Cube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        
         System.out.print("Enter temperature in Fahrenheit:30 ");
        float F = in.nextFloat();
 
        float C = (F - 32) * (9f / 5);

        System.out.println(F + " degree Fahrenheit is equal to " + C + " degree Celsius");

    }
}
