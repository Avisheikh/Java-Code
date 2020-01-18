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
public class calculator {
public void user(){
String userInput;
int a,b,c=0;
System.out.println("choose your operator:");
userInput=new Scanner (System.in).next();

System.out.println("enter your number");
a=new Scanner(System.in).nextInt();

System.out.println("enter your number");
b=new Scanner(System.in).nextInt();
switch(userInput){
case"+":
    c=a+b;
break;

case"-":
    c=a-b;
    break;
    
    case"*":
        c=a*b;
        
        case"/":
            c=a/b;
            break;
            
        default:
            System.out.println("invalid try again");
            user();
            break;
       }
System.out.println("the answer is" +c);

}    
public static void main(String args[]){
calculator abi=new calculator();
abi.user();

}


}
