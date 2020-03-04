/*
Create class Car is derived from Vehicle, in package data, consists of:
- Private Field GPS (y/n)
- Public Constructors to initialize the all fields.
- Override methods:
- Protected void accept() : allow user to input additional details for a Car:
invoke method accept() of super class.
- Public void printInfo() : display all details of an car.
- Public String toString() : return a string presenting all details of a Car
 */
package data;
import java.util.*;

public class Car extends Vehicle{
    private String GPS;

    public Car() {
    }

    public Car(String GPS, String id, String name, String brand, int speed, int weight, int price) {
        super(id, name, brand, speed, weight, price);
        this.GPS = GPS;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println(">> Nhập GPS [Y/N] ");
            GPS=sc.nextLine().trim().toUpperCase();
            
            if(GPS.equals("Y")||GPS.equals("N")){
                break;
            }
        }
    }

    @Override
    public void printInfo() {
        super.printInfo(); //To change body of generated methods, choose Tools | Templates.
        
        System.out.println("GPS: "+ GPS);
    }

    @Override
    public String toString() {
        return String.format("$s - %s - %s - %d - %d - %d", id,name,brand,price,weight,speed);
    }
    
    
    //Hàm lấy giá trị của GPS
    public String getGPS(){
        return GPS;
    }
    
}
