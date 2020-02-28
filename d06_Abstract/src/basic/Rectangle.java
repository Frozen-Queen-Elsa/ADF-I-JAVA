/*
    Là lớp con của lớp Shape
 */
package basic;

import java.util.Scanner;


public class Rectangle extends Shape{
    public float w,h;  //Khai báo chiều rộng và chiều dài
    
    @Override
    public float area() {
        return w*h;
    }

    @Override
    public float perimeter() {
        return 2*w*h;
    }
    
    public void input(){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Nhập chiều dài hình chữ nhật:");
        h=Float.parseFloat(sc.nextLine().trim());
        System.out.print("Nhập chiều rộng hình chữ nhật:");
        w=Float.parseFloat(sc.nextLine().trim());
    }
    
}
