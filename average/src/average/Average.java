
public class Average {
public int calculateaverage(int a,int b,int c){
int average=(a+b+c)/3;
return average;
}
    public static void main(String[] args) {
        Average obj=new Average();
        System.out.println("average"+obj.calculateaverage(10, 20, 30));
                
    }
    
}
