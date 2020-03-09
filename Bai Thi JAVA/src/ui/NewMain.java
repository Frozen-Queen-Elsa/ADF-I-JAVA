
package ui;

import product.*;
import sale.*;
import java.util.Scanner;


public class NewMain {

    public static void main(String[] args) {
        Invoice i=new Invoice();
        while(true){
            Scanner sc=new Scanner(System.in);
            String opt="";
                System.out.println("\n>>MENU<<");
                System.out.println("_____________________________");
                System.out.println("|1. Create New Item         |");
                System.out.println("|2. Search and Display Item |");
                System.out.println("|3. Exit                    |");
                System.out.println("_____________________________");
                System.out.println("Vui lòng lựa chọn [1-3]");
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
                        return;
                    default:
                        System.out.println("Vui lòng nhập lại [1-3]");
                }
        }
    }
    
}
