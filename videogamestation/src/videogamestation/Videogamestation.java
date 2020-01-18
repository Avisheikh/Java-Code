/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogamestation;

/**
 *
 * @author abishek
 */
//creating class
public class Videogamestation {
    //instance variable
    String gameStation;
    String videoGame;
    String customerName;
    String customerType;
    String bookingDate;
    int duration;
    int hourlyRate;
    boolean availableStatus;
    //creating constructor
    public Videogamestation(String gameStation,String videoGame,int hourlyRate){
    this.gameStation=gameStation;
    this.videoGame=videoGame;
    this.hourlyRate=hourlyRate;
    customerName="";
    bookingDate="";
    customerType="";
    duration=0;
    availableStatus=true;
    }
    //returning value
    public String gameStation(){
    return gameStation;
    }
    public String videoGame(){return videoGame;}
    public String customerName(){return customerName;}
    public String customerType(){return customerType;}
    public String bookingDate(){return bookingDate;}
    public int duration(){return duration;}
    public int hourlyRate(){return hourlyRate;}
    public boolean availableStatus(){return availableStatus;}
    //setting value
    public void sethourlyRate(int newhourlyrate){this.hourlyRate=newhourlyrate;}
    public void setcustomerType(String newcustomertype){this.customerType=newcustomertype;}
   //creating new method
    public void Gamestation(String newcustomerName, String newcustomerType , String newbookingDate , int newtimeDuration){
    if(availableStatus=false){
    System.out.println("sorry gamestation is full");
    }
    else{
    customerName=newcustomerName;
    customerType=newcustomerType;
    bookingDate=newbookingDate;
    duration=newtimeDuration;
    availableStatus=false;
    }
    
    public static void main(String[] args) {
       
    }
    
}
