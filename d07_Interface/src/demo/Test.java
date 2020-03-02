/*
    Kiểm tra thử các lớp Woker,Employee
 */
package demo;
import data.*;

public class Test {

    
    public static void main(String[] args) {
        Worker w=new Worker();
        w.input();
        
        Employee e=new Employee();
        e.input();
        
        //In chi tiết lương
        System.out.println("\nChi tiết lương công nhân");
        System.out.println(w);
        
        System.out.println("\n Chi tiết lương nhân viên");
        System.out.println(e);
    }
    
}
