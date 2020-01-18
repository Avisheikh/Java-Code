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
public class pyramid {
    public static void main(String []args){
        //half pyramid banayounah
//    int rows=5;
//    for(int i=1;i<=rows;i++){
//    for (int j=1;j<=i;++j){
//    System.out.println("*");
//    }
//    System.out.println();
////    }
//half pyramid banayounah using number
//int rows=5;
//for(int i=1;i<=rows;++i){
//for(int l=1;l<=i;++l){
//System.out.println(l+"");
//}
//System.out.println();
//}
//trying
//int sum=5;
//for(int i=1;i<=sum;i++){
//for(int l=1;l<=i;++l){
//System.out.println("*");
//}
//System.out.println();
//}
//again trying
//int sum=5;
//for(int i =1;i<=sum;i++){
//for(int l=1;l<=i;l++){
//System.out.println(l+"");
//}
//System.out.println();
//}
// program to print full pyramid using *
int rows=5,k=0;
for(int i=1;i<=rows;++i,k=0){
for(int space=1;space<=rows-i;++space){
System.out.println("  ");
}
while (k !=2*i-1){
System.out.println();
}
System.out.println();
}
}
    
}