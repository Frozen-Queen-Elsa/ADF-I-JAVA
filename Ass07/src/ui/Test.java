/*
Create main class Test in package ui that allows user to manage cars accepted into system through the menu system as follows:
1. Add a new car
2. Display all cars
3. Search car by brand name
4. Display all cars having GPS module
5. Display high-rank vehicle
6. Exit
 */
package ui;

import data.*;
import java.util.*;

public class Test {


    public static void main(String[] args) {
        VehicleCatalog o=new VehicleCatalog();
        Scanner sc=new Scanner(System.in);
        String op="";
        while(true){
            System.out.println("\n\n>>MENU<<");
            System.out.println("1. Thêm");
            System.out.println("2. In Danh sách");
            System.out.println("3. Tìm theo thương hiệu");
            System.out.println("4. Tìm theo hệ GPS");
            System.out.println("5. Tim xe cao cấp");
            System.out.println("6. Exit");
            System.out.println("Chọn chức năng : [1-6]");
            op=sc.nextLine().trim();
            
            switch(op){
                case "1": o.addCar();break;
                case "2": o.displayAll();break;
                case "3": System.out.println("Nhập thương hiệu muốn tìm");
                          o.searchByBrand(sc.nextLine().trim());
                          break;
                case "4": o.displayAllGPSCar();break;
                case "5": o.displayHighRank();break;
                case "6": return;
                    
            }
        }
    }
    
}
