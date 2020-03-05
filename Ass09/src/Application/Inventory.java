/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;
import Electronics.*;
import java.util.*;
/**
1. Add a new television
2. Search televisions by brand
3. Display all televisions
4. Display high-valued televisions
5. Exit
 */
public class Inventory {

    void menu(){
        TelevisionCatalog t = new TelevisionCatalog();
        
        while(true){
            
            Scanner sc=new Scanner(System.in);
            String opt="";
            
            System.out.println(">>MENU>");
            System.out.println( "1. Add a new television\n" +
                                "2. Search televisions by brand\n" +
                                "3. Display all televisions\n" +
                                "4. Display high-valued televisions\n" +
                                "5. Exit");
            System.out.println("Vui lòng lựa chọn [1-5]");
            opt=sc.nextLine().trim();
            
            switch(opt){
                case "1":
                    t.add();
                    break;
                case "2":
                    String sbrand;
                    System.out.println("Nhập brand cần tìm kiếm :");
                    sbrand=sc.nextLine().trim();
                    t.searchByBrand(sbrand);
                    break;
                case "3":
                    t.displayAll();
                    break;
                case "4":
                    t.displayHighValue();
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
