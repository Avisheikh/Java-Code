import java.util.Scanner;
public class tower  
{ static int count = 0;
    public tower() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Discs:");
        int n = sc.nextInt();
        TOH(n,1,2,3); 
    }
    
    public void TOH(int n, int A, int B, int C) {
        if(n>0){
            TOH(n-1,A,C,B);
            count++;
             System.out.println( " Step --> " + count);
            System.out.println("Move Disk "+n+" from Tower "+A+" to Tower "+C);
            TOH(n-1,B,A,C);
            //count++;
        }
    }
    
    public static void main(String args[]){
        new tower();
        System.out.println("This problem is solved in "+count+" steps.");
    }
  
}
