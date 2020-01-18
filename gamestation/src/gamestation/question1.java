/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestation;
//input linah lai
import java.util.Scanner;
//question mah class sequencecheck garnu vhani ko cha
public class question1 {
//    //variables declare gariko
int a;
int b;
int c;
 //array decleare gariko
    int arrtocheck[];
//method banako
public void CheckArray(int n){
for (int i=0;i<n;i++){
    
    int a =arrtocheck[i];
    int b=arrtocheck[i+1];
    int c=arrtocheck[i+2];
    if (a==1 && b==2 && c==3 ){
    System.out.println("true");
    break;
    }
//    else if(arrtocheck[i+1]==arrtocheck.lenght)
}
}
public static void main(String[]args){
 
 
    //scanner banako input linah lai
    Scanner abi=new Scanner(System.in);
      System.out.println("enter no of index of array");
    int m=abi.nextInt();
    
    //using while loop
    while(m<3){
    System.out.println("Error! index should be at least 3. try again:");
    //fhere number entry garnah rakhiko
   abi.nextInt();
   }
    for (int i=0;i<m ;i++){
    Scanner del=new Scanner(System.in);
    int b=del.nextInt();
    }
  question1 sc=new question1();
  
  
    // variable decleare gariko main method mah
//int input;

}
}
