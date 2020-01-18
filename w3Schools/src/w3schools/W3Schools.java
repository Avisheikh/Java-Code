/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3schools;

/**
 *
 * @author abishek
 */
public class W3Schools {

 
    public static void main(String[] args) {
        if(20<18){
        System.out.println("20 is greater than 10");}
 
        int x=10;
    int y=20;
    if(x<y){
System.out.println("x is lesser than y");
}
    int time=20;
    if(time<18){
    System.out.println("good day");
    }
    else{
    System.out.println("good eveing");
    }
    int min=30;
    if(min<40){
    System.out.println("hello");
    
    }
    else if(min>10){
    System.out.println("hello world");
    }
    else{
    System.out.println("hey");
    }
    //ternary operator
    //variable=(conditon) ? expressionTrue:expressionfalse;
    String result=(min<10)?"good day":"good evening";
    
    //java switch
    int day=9;
    switch(day){
        case 1:
            System.out.println("monday");
            break;
        case 2:
            System.out.println("tuesday");
            break;
        case 3:
            System.out.println("wednesday");
            break;
        case 4:
            System.out.println("thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        default:
            System.out.println("no days");
    
    }
    int i=1;
    while(i<=5){
    System.out.println(i);
    i++;
    
    }  
    //for each loop
   String[] cars={"volvo","bmw","ford","mazda"};
   for(String q:cars){
   System.out.println(q);
   }
   //break used in loops
   for(int c=0;c<10;c++){
   if(c==5){
       break;}
   System.out.println(c);
   
   }
   for (int e=0;e<10;e++){
   if(e==5){
   continue;
   }
   System.out.println(e);
   
   }
   //array
   String [] name={"ram","hari","shyam"};
   name[1]="krishna";
   System.out.println(name[1]);
   System.out.println(name.length);
   for(String w:name){
   System.out.println(w);
   
   }
   //multidimensional array
   int[][] num={{1,2,4,5},{2,2,3,4,}};
   int n=num[1][2];
   System.out.println(n);
    }

    
}
