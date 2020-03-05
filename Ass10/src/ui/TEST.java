/*
1. Add a new customer
2. Search customers by name
3. Display all customers
4. Exit
 */
package ui;

import data.*;
import java.util.*;

public class TEST {

   
    public static void main(String[] args) {
        
        CustomerCatalog cc=new CustomerCatalog();
        while(true){
            Scanner sc= new Scanner(System.in);
            String opt="";
            System.out.println("\n>>MENU<<");
            System.out.println( "1. Add a new customer\n" +
                                "2. Search customers by name\n" +
                                "3. Display all customers\n" +
                                "4. Exit");
            System.out.println("Nhập lựa chọn của bạn [1-4]");
            opt=sc.nextLine().trim();
            
            switch(opt){
                case "1":
                    cc.add();
                    break;
                case "2" :
                    String Name;
                    System.out.println("Nhập tên nhân viên bạn muốn tìm kiếm");
                    Name=sc.nextLine().trim();
                    cc.searchByName(Name);
                    break;
                case "3":
                    cc.displayAll();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Vui lòng nhập lại lựa chọn [1-4]");
                    break;
            }
        }
    }
    
}
