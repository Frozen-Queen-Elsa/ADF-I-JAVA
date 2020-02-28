/*
    Đây là lớp con (sub-class) của lớp Computer nằm trong gói data
 */
package app;
import data.*;
import java.util.Scanner;

public class Laptop extends Computer{     
    public float weight;
    
    @Override
    public void input() {
        super.input(); //Gọi lại hàm input của lớp cha Computer
        
        //Viết tiếp lệnh nhập trọng lượng laptop
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập trọng lượng");
        weight=Float.parseFloat(sc.nextLine().trim());    
        
    }

    @Override
    public String toString() {
        return super.toString() + weight+" Kg";
    }

}
