/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestation;

/**
 *
 * @author abishek
 */
import java.util.Scanner;
public class calculator1 {
    public void ram(){
    String inputUser;
    int a,b,c=0;
   
    System.out.println("enter Operator");
    inputUser=new Scanner(System.in).next();
    System.out.println("enter a number");
    a=new Scanner(System.in).nextInt();
    System.out.println("enter a number");
    b=new Scanner(System.in).nextInt();
    
    switch(inputUser){
    case"+":
        c=a+b;
        break;
    
        case "-":
            c=a-b;
            break;
   
    case"*":
        c=a*b;
        break;
        
        case"/":
            c=a/b;
            break;
    
        default:
            System.out.println("try again");
            ram();
    }
System.out.println("sum is:"+c);
    }
    public static void main(String args[]){
    calculator1 obj=new calculator1();
    obj.ram();
    
    }
}
