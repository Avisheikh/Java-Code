/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author abishek
 */
public class Rectangle {

    int lenght;
    int breadth;
    Rectangle(int l,int b){
    this.lenght=l;
    this.breadth=b;
    }
    public int getarea(int lenght,int breadth){
    int area=lenght*breadth;
    return area;
    }
    public int getperimeter(int lenght,int breadth){
    int perimeter=2*(lenght+breadth);
    return perimeter;
    
    }
    public static void main(String[] args) {
        Rectangle result=new Rectangle(2,3);
        System.out.println("lenght:"+result.lenght);
        System.out.println("breadth:"+result.breadth);
        System.out.println("area"+result.getarea(2, 3));
        System.out.println("perimeter"+result.getperimeter(1, 2));
        
    }
    
}
