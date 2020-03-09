
package ui;

import java.util.Scanner;
import product.Invoice;


public class Test {

    public static void main(String[] args) {
        Invoice i=new Invoice();
        while(true){
            Scanner sc=new Scanner(System.in);
            String opt="";
                System.out.println("\n>>MENU<<");
                System.out.println("_____________________________");
                System.out.println("|1. Create New Item         |");
                System.out.println("|2. Search and Display Item |");
                System.out.println("|3. Display all             |");
                System.out.println("|4. Exit                    |");
                System.out.println("_____________________________");
                System.out.println("Vui lòng lựa chọn [1-4]");
                opt=sc.nextLine().trim();

                switch(opt){
                    case "1":
                        i.addItem();
                        break;
                    case "2":
                        String sName;
                        System.out.println("Vui lòng nhập tên cần tìm kiếm :");
                        sName=sc.nextLine().trim();
                        i.serchItem(sName);
                        break;
                    case "3":
                        i.displayAll();
                        break;
                    case "4":
                        return;
                    default:
                        System.out.println("Vui lòng nhập lại [1-4]");
                }
        }
    }
    
}
