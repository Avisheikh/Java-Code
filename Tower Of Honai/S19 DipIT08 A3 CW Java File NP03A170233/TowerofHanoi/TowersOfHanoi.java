package TowerofHanoi;



import java.util.Scanner;
public class TowersOfHanoi {
	
  int counter=0;

	   public void solve(int n, String start, String auxiliary, String end) {
	      
		   
		   if (n == 1)
	    	   
//	    	   Base Case - When n = 1.
//	    	   Move the disks from start pole to end pole 
	       
	       {
	           counter++;
	           System.out.println( " Step --> " + counter);
	           System.out.println(start + " --> " + end);
	           
	       } else {
	    	 //Move (n-1) disks from start pole to auxiliary pole.
	           solve(n - 1, start, end, auxiliary);
	         //Print disks from start pole to end pole.
	         counter++;
	           System.out.println( " Step --> " + counter);
	           System.out.println(start + " --> " + end);
	            
	           
	         //Move the (n-1) disks from auxiliary pole to end pole.
	           solve(n - 1, auxiliary, start, end);
	           
	           
	       }
	   }

	   public static void main(String[] args) {
		   
	       
	        
	       TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
	       
	       //using scanner to enter number of disks
	       System.out.print("Enter number of disks: ");
	       Scanner scanner = new Scanner(System.in);
	       int disks = scanner.nextInt();
	     
	       //Passing number of rod as parameter
	       towersOfHanoi.solve(disks, "1", "2", "3");
	        
	     
	     
	      
	       
	   }

	


	

	
	}

