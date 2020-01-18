
public class Volume {

    public int calculatevolume(int side){
    int volume= side*side*side;
    return volume;
}
 public int calculatevolume(int lenght,int breadth,int height){
 int volume=lenght*breadth*height;
 return volume;
 }
 public double calculatevolume(double r){
 double volume=r*r*r;
 return volume;
 }
 public static void main(String[] args){
 Volume result=new Volume();
 System.out.println("cube:"+result.calculatevolume(9));
 System.out.println("cubiod:" + result.calculatevolume(10,10,10));
 System.out.println("sphere:"+result.calculatevolume(10.2));
 
 
 }
}
