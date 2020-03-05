/*
- Field webcam (y/n), QoH (số lượng tồn kho)
- Constructors to initialize the all fields.
- Override methods:
- accept() : allow user to input details for a laptop:
Recall method accept() of super class.
- printInfo() : display details of an laptop.
- toString() : return a string presenting all the details of a product as follows: id, name, webcam, price, QoH, amount (= price*QoH)
4
 */
package Goods;

import java.util.Scanner;


public class Laptop extends Computer{
    public String webcam;
    public int QoH;

        
    public Laptop() {
    }

    public Laptop(String ID, String name, int price,String webcam, int QoH) {
        super(ID, name, price);
        this.webcam = webcam;
        this.QoH = QoH;
    }

    
    public void accept() {
        super.accept(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Máy có webcam hay không ? [Y/N]");
            webcam=sc.nextLine().trim().toUpperCase();
            
            if(webcam.equals("Y")||webcam.equals("N")){
               break;
            }
        }  
        System.out.println("Nhập số lượng hàng tồn kho :");
        QoH=sc.nextInt();
    }

    @Override
    public void printinfo() {
        System.out.println(">>Thông tin LAPTOP<<");
        System.out.println("ID : "+ID);
        System.out.println("Name : "+name);
        System.out.println("Price : "+price );
        System.out.println("Webcam : "+webcam);
        System.out.println("Số hàng tồn kho : "+QoH);
        System.out.println("");
    }

    @Override
    public String toString() {
        String s=super.toString();
        return s+" - "+webcam+" - "+QoH+" - "+price*QoH;
    }
    
}
