/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abishek
 */
//Some dogs are standing in a line, numbered 1, 2, 3, ..... The odd dogs (1, 3, ..) have
//normal two ears. The even dogs (2, 4, ....) have 3 ears. Recursively, return the number of
//ears in the dogs line 1,2, ..... n without using loops or multiplication.
public class dog {
    public static int ears(int bunnies){
  if(bunnies == 0)
		return 0;
	if(bunnies % 2 == 1)
        return 2 +  ears(bunnies-1);
	return 3 +  ears(bunnies-1);
   }
    public static void main (String args[]){
    System.out.println(ears(2));}
}
 
    

