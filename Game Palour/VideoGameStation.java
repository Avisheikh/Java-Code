import java.io.Serializable;
//Creating Class name of videogamestation
public class VideoGameStation implements Serializable,Comparable<VideoGameStation>
{
//creating a class with primitive data types having attributes 
String gameStation;
String videoGame;
String customerName;
String customerType;
String bookingDate;
int duration;
int hourlyRate;
boolean availableStatus;

//Creating constructor and giving arguments in parameters
public VideoGameStation(String gameStation, String videoGame,int hourlyrate){
this.gameStation=gameStation;
this.videoGame=videoGame;
this.hourlyRate=hourlyrate;
//assigning value to the corresponding attributes
customerName="";
bookingDate="";
customerType="";
duration=0;
availableStatus=true;
}
//Creating method with returning value of each and every attributes
public String getgameStation(){return gameStation;}
public String getcustomerName(){return customerName;}
public String getcustomerType(){return customerType;}
public String getbookingDate(){return bookingDate;}
public int getduration(){return duration;}
public int gethourlyRate(){return hourlyRate;}
public boolean getavailableStatus(){return availableStatus;}

//Setting new value to the arguments given in paranthesis
public void setnewvalue(int newhourlyRate,String newcustomerName,String newcustomerType){
this.hourlyRate=newhourlyRate;
this.customerType=newcustomerType;
this.hourlyRate=newhourlyRate;
}

//Now we are going to create a method that would allow customer of the scenario to book,store or hire.
public void bookvideogamestation(String bookcustomerName, String bookcustomerType, String bookbookingDate,int bookduration){
if(availableStatus=false){System.out.println("Game Station is currently full.Please come later");}
else{
customerName=bookcustomerName;
customerType=bookcustomerType;
bookingDate=bookbookingDate;
duration=bookduration;
availableStatus=false;
}
}

//Creating a method for making the video game station available.
public void gamestationavailable(){
if(availableStatus=true){
    System.out.println("It is available for booking");
}
else{
customerName="";
customerType="";
bookingDate="";
duration=0;
availableStatus=true;
}
}
//creating the final method which will display the description of the chosen scenario
public void finalmethod(){
System.out.println("Hourlyrate:" +gethourlyRate());
System.out.println("GameStaton:" +getgameStation());
}
//Displaying values in ascending order.
@Override
public int compareTo(VideoGameStation res){
int test=0;
int test1=this.customerName.compareToIgnoreCase(res.customerName);
int test2=this.gameStation.compareToIgnoreCase(res.gameStation);
if(test1!=0){
test=test1;
}
else{
if(test2!=0){
test=test2;
}
}
return(test);
}
}
