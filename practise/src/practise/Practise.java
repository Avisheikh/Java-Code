/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise;

/**
 *
 * @author abishek
 */
public class Practise {
int price;
String model;
int instock;
// getter method 
public int getprice(){
    return price;
}
public String getmodel(){
    return model;
}
public int getinstock(){
    return instock;
}
// setter method
public void setprice(){
    this.price=price;
}
public void setmodel(){
    this.model=model;
}
public void setinstock(){
    this.instock=instock;
}
// constructor
Practise(int price , String model , int stock){
    this.price=price;
    this.model=model;
    this.instock=stock;
}
public static void main(String[] args){
    Practise laptop=new Practise(40 , "dell",60000);
    System.out.println("laptop price" +laptop.price);
    System.out.println("laptop model"+laptop.model);
    System.out.println("laptop instock"+laptop.instock);
}
}