/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop1;

/**
 *
 * @author abishek
 */
public class Workshop1 {
    // instance variables
      final int max_limit=20;
          final  int min_limit=1;
          final double min_bal=500;
         private  String name[]=new String[20];
         private int accNo[]=new int[20];
         private  String accType[]=new String[20];
         private double balAmt[]=new double[20];
         static int totRec=0;
        //constructor
        Workshop1()
        {
             for(int i=0;i<max_limit;i++)
             {
                name[i]="abi";
                accNo[i]=0;
                accType[i]="ss";
                balAmt[i]=0.0;
            }
        }
 } 
 
     
