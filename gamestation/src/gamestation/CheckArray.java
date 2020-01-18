/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestation;

import java.util.Scanner;
import java.io.*;
public class CheckArray {
    public static int n;
  public static int[] arr = new int[n];
  
  public void checker(int j)
  {
    int a,b,c;
    
    for (int i =0; i < j; ++i)
    {
      a = arr[i];
      b = arr[i+1];
      c = arr[i+2];
      
      if(a==1 && b==2 && c==3)
      {
        System.out.println("True");
      	break;
      }
    }
  }
  
  public static void main (String []args)
  {
    int input;
    System.out.println("Enter the number of elements to store: ");
    
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    
    while(n<3)
    {
      System.out.println("Error! Try Again: ");
      n = sc.nextInt();
    }
    
    for (int i=0; i< n; ++i)
    {
      input = sc.nextInt();
      input = arr[i];
    }
    
    CheckArray ca = new CheckArray();
    ca.checker(n);
  }
}

