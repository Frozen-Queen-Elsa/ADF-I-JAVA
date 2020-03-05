/*
1. Add a new laptop
2. Search laptop by name
3. Display all laptops
4. Remove a laptop by id
5. Exit
 */
package Application;

import java.util.*;
import Goods.*;

public class Inventory {
    
    public void menu(){
        LaptopCatalog l=new LaptopCatalog();
        
        while(true){            
            Scanner sc=new Scanner(System.in);
            String opt="";
            
            
            System.out.println("\n>>MENU<<");
            System.out.printf(  "1. Add a new laptop\n" +
                                "2. Search laptop by name\n" +
                                "3. Display all laptops\n" +
                                "4. Remove a laptop by id\n" +
                                "5. Exit\n");
            System.out.println("Vui lòng lựa chọn [1-5]");
            opt=sc.nextLine().trim();
            
            switch(opt){
                case "1":
                    l.addLaptop();
                    break;
                case "2":
                    String Name;
                    System.out.println("Nhập Tên Laptop cần tìm kiếm");
                    Name=sc.nextLine().trim();
                    l.search(Name);
                    break;
                case "3":
                    l.displayAll();
                    break;
                case "4":
                    String id;
                    System.out.println("Nhập ID Laptop cần xóa ");
                    id=sc.nextLine().trim();
                    l.remove(id);
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Vui lòng nhập lại lựa chọn [1-5]");
                    break;
            }
            
        }
    }
    
    public static void main(String[] args) {
        Inventory o=new Inventory();
        o.menu();
    }
    
}
