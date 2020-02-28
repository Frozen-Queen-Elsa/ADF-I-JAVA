/*
    Đây là lớp con của lớp Computer
 */
package app;
import data.*;
import java.util.Scanner;

public class Desktop extends Computer{
    public boolean camera;

    @Override
    public void input() {
        super.input(); //Gọi lại hàm input của lớp cha Computer
        
        //Viết tiếp lệnh nhập kiểm tra có camera hay không?
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Desktop có Camenra hay không ? (Co / Khong)");
        camera=sc.nextLine().trim().equalsIgnoreCase("Co");
    }

    @Override
    public String toString() {
        String s=super.toString();
        return s+(camera?"Có":"Không có")+" Camera ";  
        
    }
    
}
