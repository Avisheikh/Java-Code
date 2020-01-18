/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abishek
 */
import java.util.Scanner;
public class facto {
  
 static int fact(int n){
       
       
        
    if (n==1){return 1;}

    return n*fact(n-1);
    
    
    
    }
    public static void main(String args []){
        System.out.println("enter your number");
     int n = new Scanner (System.in) .nextInt();
   System.out.println(fact(n));
    
    }
}
