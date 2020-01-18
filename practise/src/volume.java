
public class volume {
  public int calculatevolume(int side){
  int volume= side*side*side;
  return volume;
  }
    public int calculatevolume(int lenght,int breadth,int height){
    int volume=lenght*breadth*height;
    return volume;
    }
    public double calculatevolume(double r){
    double volume=4/3*3.14*r*r*r;
return volume;
    }
    public static void main(String[] args){
    volume obj=new volume();
    System.out.println("cube:"+obj.calculatevolume(8));
    System.out.println("cuboid:"+obj.calculatevolume(1,2,3));
    System.out.println("sphere"+obj.calculatevolume(10.3));
    
    }
}
