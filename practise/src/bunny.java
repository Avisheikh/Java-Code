/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abishek
 */
////1. There are a number of bunnies and each bunny has two big floppy ears. Compute the total
//number of ears for all the bunnies recursively, without using loops or multiplication.
public class bunny {
   static int ears(int n){
   if(n==0){return 0;}
   else{
   return 2+ears(n-1);
   }
   
   }
   public static void main(String args[]){
   System.out.println(ears(2));
   
   }
}
