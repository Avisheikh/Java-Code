
package gamestation;

/**
 *
 * @author abishek
 */
public class Gamestation {
    //instance variables mah attributes haru deko
String gameStation;
String videoGame;
String customerName;
String customerType;
String bookingDate;
int duration;
int hourlyRate;
boolean availableStatus;
//construcktor
public Gamestation(String gameStation , String videoGame, int hourlyRate){
    this.gameStation=gameStation;
    this.videoGame=videoGame;
    this.hourlyRate=hourlyRate;
    customerName="";
    bookingDate="";
    customerType="";
    duration=0;
    availableStatus=true;
    }

//returning type
public String gameStation(){
return gameStation;
}
public String customerType(){
return customerType;
}
public String customerName(){
return customerName;
}
public String bookingDate(){
return bookingDate;
}
public int duration(){
return duration;
}
public int hourlyRate(){
return hourlyRate;
}
public boolean availableStatus(){
return availableStatus;
}
//setting method
public void sethourlyRate(int newhourlyRate){
this.hourlyRate=newhourlyRate;
}

public void setcustomerType(String newcustomerType){
this.customerType=newcustomerType;

}

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
}
    public static void main(String[] args) {

    }
    
}
