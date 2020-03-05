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

import java.util.*;
import data.*;
public class Test {

    public static void main(String[] args) {
        VehicleCatalog o = new VehicleCatalog();
        Scanner sc = new Scanner(System.in);
        String op ="";
        
        while (true) {            
            System.out.println("\n \n >>Menu<<");
            System.out.println("1. Them");
            System.out.println("2. In ds");
            System.out.println("3. tim theo thuong hieu");
            System.out.println("4. tim theo hieu GPS");
            System.out.println("5. tim xe cao cap");
            System.out.println("6. Thoat");
            System.out.print("Chon chuc nang [1-6]: ");
            op = sc.nextLine().trim();
            
            switch(op){
                case "1": o.addCar();break;
                case "2": o.displayAll();break;
                case "3": System.out.print("Nhap thuong hieu muon tim: ");
                o.searchByBrand(sc.nextLine().trim()); break;
                case "4": o.displayAllGPSCar(); break;
                case "5": o.displayHighRank(); break;
                case "6": return;
            }
        }
    }
    
}
