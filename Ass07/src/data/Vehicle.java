package data;

/*
Creates a class named Vehicle in package data.
- Protected fields: ID, name, brand, speed, weight, price
- Public Constructors: to initialize the above fields.
- Methods:
- Protected void accept() : allow user input data into data fields.
 validation: [ID, name, brand] is not null. [speed, price] must be greater than zero.
- Public void printInfo() : used to print details of an vehicle. 
 */
import java.util.*;

public class Vehicle {

    protected String id, name, brand;
    protected int speed, weight, price;

    public Vehicle() {
    }

    public Vehicle(String id, String name, String brand, int speed, int weight, int price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.speed = speed;
        this.weight = weight;
        this.price = price;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        //nhap id
        while (true) {
            System.out.print(">> nhap id: ");
            id = sc.nextLine().trim();

            if (id.length() > 0) {
                break;
            }
        }

        //nhap name
        while (true) {
            System.out.print(">> nhap ten: ");
            name = sc.nextLine().trim();

            if (name.length() > 3) {
                break;
            }
        }

        //nhap brand
        while (true) {
            System.out.print(">> nhap thuong hieu: ");
            brand = sc.nextLine().trim();

            if (brand.length() > 0) {
                break;
            }
        }

        //nhap don gia
        while (true) {
            try {
                System.out.print(">> nhap don gia >0 : ");
                price = Integer.parseInt(sc.nextLine().trim());

                if (price > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Loi sai: " + e.getMessage());
            }
        }
        
        //nhap speed
        while (true) {
            try {
                System.out.print(">> nhap toc do >0 : ");
                speed = Integer.parseInt(sc.nextLine().trim());
                
                
            } catch (Exception e) {
                System.out.println("Loi sai: " + e.getMessage());
            }
        }
        
        //nhap weight
        while (true) {
            try {
                System.out.print(">> nhap trong luong : ");
                weight = Integer.parseInt(sc.nextLine().trim());
                if (weight > 0) {
                    break;
                }

            } catch (Exception e) {
                System.out.println("Loi sai: " + e.getMessage());
            }
        }

    }

    
    public void printInfo() {
        System.out.println("Thong tin chi tiet: ");
        System.out.println("id: "+ id);
        System.out.println("ten: "+ name);
        System.out.println("thuong hieu: " + brand);
        System.out.println("toc do: " + speed);
        System.out.println("trong luong: " + weight );
        System.out.println("don gia: " + price);
    }
}
