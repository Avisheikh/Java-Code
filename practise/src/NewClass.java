import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class NewClass {
    
public void myCar(int max){
System.out.println("my car speed is less than yours"+max);
}
static void speed(){
System.out.println("my car is going to fast");

}

public static void main (String args []){
//speed();
//NewClass obj1=new NewClass();
//obj1.myCar(23);
//
//
//Scanner obj3=new Scanner(System.in);
//System.out.println("enter enter");
//
//String objj=obj3.nextLine();
//System.out.print("String"+objj);

//arryalist
ArrayList<String> call=new ArrayList<String>(); 
call.add("ram");
call.add("shyam");
call.add("hari");
call.add("rita");
call.size();
call.remove(0);
Collections.sort(call);
for(String i:call){
System.out.println(i);
//System.out.println(call.size());
}
}


    }

