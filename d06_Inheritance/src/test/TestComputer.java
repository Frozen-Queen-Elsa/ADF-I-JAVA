
package test;
import app.Laptop;
import app.Desktop;
import data.*;

public class TestComputer {

    public static void main(String[] args) {
        app.Laptop c = new Laptop();   
        System.out.println("Nhập dữ liệu của Laptop");
        c.input();
        
        app.Desktop d=new Desktop();
        System.out.println("Nhập dữ liệu của Desktop");
        d.input();
        System.out.println("Laptop: "+c);
        System.out.println("Desktop: "+d);
        
        Computer c1=new Laptop();  // Đối tượng thuộc Computer tham chiếu theo Laptop
        c1.input();   //Hàm input của Laptop được gọi
        
        Computer c2=new Desktop();
        c2.input();     //Hàm input của Desktop được gọi
        
        Computer[] ds=new Computer[10];
        ds[0]=new Laptop();
        ds[1]=new Computer();
        ds[2]=new Desktop();
    }
    
}
