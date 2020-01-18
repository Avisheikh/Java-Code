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
public class pin {
    public static void main(String []args){
        Scanner abi=new Scanner(System.in);
        int[]cls=new int[10];
        int sum=0;
        for(int i=0;i<10;i++){
        cls[i]= abi.nextInt();
        }
        for(int a:cls){
        sum=sum+a;
        }
        System.out.println("sum"+sum);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//int row=5,k=0;
//for (int i =1;i<=row;i++,k=0){
//for (int a=0;a<=row-i;a++){System.out.println();}
//while(k!=2*i-1){System.out.println(i+" ");k++;}
//System.out.println();
//}

//floyd's triangle
//int row=5,number=1;
//for(int i =1;i<=row;i++){
//for(int a=1;a<=i;a++){
//System.out.println(number+"");
//number++;
//}
//System.out.println();
//}

//for sum
//int abi[]={1,2,3,4,5,6,7,8,9,10};
//int sum=0;
//for(int i:abi){
//    sum+=i;
//System.out.println("sum"+sum);
//}
    }
}
