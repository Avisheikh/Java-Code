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
public class NewClass {
    public static void main(String[]args){
//    int rows=5,k=0;
//for(int i=1;i<=rows;++i,k=0){
//for(int space=1;space<=rows-i;++space){
//System.out.println("  ");
//}
//while (k !=2*i-1){
//System.out.println("*");
//++k;
//}
//System.out.println();
//}
int[] a={1,4,3,2,5};
    int temp=0;
    for(int i=0;i<a.length;i++){
        for(int j=i;j<a.length;j++){
       if(a[i]>a[j]){
       temp=a[i];
       a[i]=a[j];
       a[j]=a[temp];
       
       } 

        }
    System.out.println(a[i]);
    
    }
        
    }
    }
    
