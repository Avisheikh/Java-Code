/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abishek
 */
public class name {
   public static String reverse(String str){
   if(str.isEmpty()){return str;}
   else{return reverse(str.substring(1))+str.charAt(0);}
   
   }
   public static void main(String args []){
   System.out.println(reverse("kathmandu"));
   }
}
