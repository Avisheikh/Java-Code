import java.util.Scanner;
public class KtmDuke200 {
    int slowdown[]={10,20,30,40,50};
  static  int acclerate[]={10,20,60,80,120,130};
    int gear[]={1,2,3,4,5};
    
    public static void speed(){
    if (acclerate[0] < acclerate[2]){
    System.out.println("Your speed is good and safe to drive");
    }
    else if(acclerate[3] > acclerate[1]){
    System.out.println("Your ride is going fast.Have a safe journey");
    }
    else{
    System.out.println("you are going to crash");
    }
    }
  public static void main(String []args){
  
speed();
  
  
  }
      
      
      
  }
    
    
    
    
    
    
    
    
    

