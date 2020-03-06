/*
- Fields : radius, height
- Constructors to initialize the all fields
- Override methods of Shape and IGeometry:
- accept() :
using try-catch exception for validation: radius, height must be greater than zero.
- printInfo() : display detailed information of a cylinder including radius, height, peripheral, area, volume
- toString() : return a string presenting all the details of a cylinder
 */
package data;

import java.util.Scanner;


public class Cylinder extends Shape implements IGeometry{
    public float radius,height;

    public Cylinder() {
    }

    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void accept() {
        System.out.println("Nhập thông tin Cylinder");
        Scanner sc=new Scanner(System.in);
        
        while(true){
            System.out.println("Nhập radius");
            try{
                radius=sc.nextFloat();
                if(radius>0) break;
                System.out.println("Radius must be greater than ZERO");
            }catch(Exception e){
                System.out.println("Lỗi nhập sai dữ liệu xin vui lòng nhập lại");
                System.out.println("Lỗi hệ thống: " + e.getMessage());
            }      
        }
        
        while(true){
            System.out.println("Nhập height");
            try{
                height=sc.nextFloat();
                if(height>0) break;
                System.out.println("Height must be greater than ZERO");
            }catch(Exception e){
                System.out.println("Lỗi nhập sai dữ liệu xin vui lòng nhập lại");
                System.out.println("Lỗi hệ thống: " + e.getMessage());
            }      
        }
    }

    @Override
    public double area() {
        return 2*PI*radius*(radius+height);
    }

    @Override
    public double peripheral() {
        return 2*PI*radius;
    }

    @Override
    public double volume() {
        return PI*radius*radius*height;
    }
    
    @Override
    public void printinfo() {
        System.out.println("\n>>Thông tin Cylinder<<");
        System.out.println("Radius : "+radius);
        System.out.println("Height : "+height);
        System.out.println("Area : "+area());
        System.out.println("Peripheral : "+peripheral());
        System.out.println("Volume : "+volume());
    }

    @Override
    public String toString() {
        return String.format("%.2f - %.2f - %.2f - %.2f - %.2f ",radius,height,area(),peripheral(),volume());
    }
    
    
    
    
    
    
    
}
