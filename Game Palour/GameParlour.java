import java.util.ArrayList;
import java.util.Collections;
//creating class and giving attribute from videogamestation
public class GameParlour
{
   ArrayList <VideoGameStation> gamerstation=new ArrayList<>();
   
   //Creating a method and taking arguments from videogamestation and creating new attributes
   public void addVideoGameStation(String gameStation, String videoGame, int hourlyRate){
    this.gamerstation.add(new VideoGameStation(gameStation,videoGame,hourlyRate));
    
    }
    
    //Creating a method for removing a game station
    public void removeGameStation(int index){
    if (gamerstation.size()<index){
    System.out.println("Error Index is not valid");
    }
    else{gamerstation.remove(index);}
    }
   
    //creating a method for booking gamestation and giving five arguments in parameters
    public void bookinggameStation(int index,String customerName,String customerType,String bookingDate,int duration){
    if(index<gamerstation.size()){
    VideoGameStation videogame=gamerstation.get(index);
    videogame.bookvideogamestation(customerName,customerType,bookingDate,duration);
    gamerstation.set(index,videogame);
    }
    else{System.out.println("Invalid Code");}
    
    }
    
    //creating a method for for making video game station free.
    public void freevideogamestation(int index){
    if(gamerstation.size()>index){
    VideoGameStation videogame1=gamerstation.get(index);
    videogame1.gamestationavailable();
    gamerstation.set(index,videogame1);
    }
    else{System.out.println("invalid code");}
    }
    
    //Creating a method that will lists all of the game station currently available.
    public void listgamestationavaliable(){
    for(int i=0;i<gamerstation.size();i++){
    if(gamerstation.get(i).getavailableStatus()==true){
    System.out.println("index no:"+i);
    gamerstation.get(i).finalmethod();
    }
    }
    }
    //Finding gamestation and hourlyrate.
    public void search (String searchterm,int maxhourlyrate){
    for(int i=0; i<gamerstation.size();i++){
    if(gamerstation.get(i).getavailableStatus()==true){
    if(gamerstation.get(i).getgameStation()==searchterm && gamerstation.get(i).gethourlyRate()<=maxhourlyrate){
    System.out.println("index no:" +i);
    gamerstation.get(i).finalmethod();
    break;
    }
    
    }
    else if(i== gamerstation.size()){System.out.println("gamestation name can not be found");
    
    }
    }
   }
   //creating a method for display the customer names in acesfing order
   public void display(){
Collections.sort( gamerstation);
for(VideoGameStation x: gamerstation){
System.out.println("Customer Name: "+x.getcustomerName());
System.out.println("Game Station: "+x.getgameStation());
}
}
   
}
