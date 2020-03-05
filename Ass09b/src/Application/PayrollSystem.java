/*
1. Add a new worker
2. Add a new engineer
3. Display all employees
4. Display slist of workers
5. Display list of engineers
6. Display the pay slip of any employee by name.
7. Exit
 */
package Application;

import java.util.*;
import data.*;

public class PayrollSystem {

    public void menu(){
        EmployeeCatalog ec=new EmployeeCatalog();
        while(true){
            Scanner sc=new Scanner(System.in);
            String opt="";
            System.out.println("\n>>MENU<<");
            System.out.println( "1. Add a new worker\n" +
                                "2. Add a new engineer\n" +
                                "3. Display all employees\n" +
                                "4. Display slist of workers\n" +
                                "5. Display list of engineers\n" +
                                "6. Display the pay slip of any employee by name.\n" +
                                "7. Exit");
            System.out.println("Nhập lựa chọn [1-7]");
            opt=sc.nextLine().trim();
            
            switch(opt){
                case "1":
                    ec.addWorker();
                    break;
                case "2":
                    ec.addEngineer();
                    break;
                case "3":
                    ec.display();
                    break;
                case "4":
                    ec.display(true);
                    break;
                case "5":
                    ec.display(false);
                    break;
                case "6":
                    String Name;
                    System.out.println("Nhập tên nhân viên cần tìm ");
                    Name=sc.nextLine().trim();
                    ec.display(Name);
                    break;
                case "7":
                    return;
                default:
                    System.out.println("Vui lòng nhập lại lựa chọn [1-7]");
                    break;
            }
        }
    }
    
    public static void main(String[] args) {
        PayrollSystem o=new PayrollSystem();
        o.menu();
    }
    
}
