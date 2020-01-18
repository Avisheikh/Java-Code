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

public class bubbleshort {
    public static void main(String args[]){
//bubble shorting
//int[] a={10,1,30,4,50,6};
//int temp=0;
//for(int i=0;i<a.length;i++){
//for (int q=i;q<a.length;q++){
//if(a[i]>a[q]){
//temp=a[i];
//a[i]=a[q];
//a[q]=temp;
//
//}
//
//}
// System.out.println(a[i]);
//}

//selection sort
int[] num={2,5,3,7,8,1};
int i,j,first,temp;
for(i=num.length-1;i>0;i--){
first=0;
for(j=1;j<=i;j++){
if(num[j]<num[first])
first=j;
}
temp=num[first];
num[first]=num[j];
num[j]=temp;
}
   
    }
}
