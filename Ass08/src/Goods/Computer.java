/*
- Fields ID, name, price
- Default constructor to initialize the above fields.
- Method
- void accept() : allow user input data into data fields.
Made validation for : ID, name is not null. Price must be greater than zero.
- void printInfo() : this is an abstract method used to print details of an product.
*/


package Goods;

import java.util.Scanner;


public abstract class Computer {
    public String ID,name;
    public int price;
    public Computer() {
    }

    public Computer(String ID, String name, int price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }
    
    
    public void accept(){
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("Nhập ID : ");
            ID=sc.nextLine().trim();
            if(ID.length()>0) break;
            System.out.println("ID is not null !!!");
        }
        
        while(true){
            System.out.println("Nhập Tên : ");
            name=sc.nextLine().trim();
            if(name.length()>0) break;
            System.out.println("Name is not null !!!");
        }
        
        while(true){
            System.out.println("Nhập Price");
            price=sc.nextInt();
            if(price>0){
                break;
            }
            System.out.println("Vui long nhập Price >0");
        }
    }
    
    public abstract void printinfo();

    @Override
    public String toString() {
        return String.format("%s - %s - %d",ID,name,price);
    }
    
    
}
