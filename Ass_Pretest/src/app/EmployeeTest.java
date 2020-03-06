/*
- Fields: max, next – eList (array of employees)
- Methods:
- void add() - add a new employee
- void display() - display all employees.
- void display ( String eName ) - search and display employees by the required name.
- void remove( String eID ) – remove an employee by ID.
- void menu() - allows to manage the list of employees through the menu system as follows.
1. Add a new employee
2. Display list of employee
3. Search employee by name
4. Remove employee by ID
5. Exit
 */
package app;
import data.*;
import java.util.*;

public class EmployeeTest {

    int max=10,next=0;
    Employee[] eList=new Employee[max];

    public EmployeeTest() {
    }
    
    void add(){
        if(next==max){
            System.out.println("Hệ thống hết chỗ lưu trữ !! Từ chối thêm mới !!");
            return;
        }
        while(true){
            Employee e=new Employee();
            e.accept();
            boolean checkID=false;
            for(int i=0;i<next;i++){
                if(eList[i].id.equalsIgnoreCase(e.id)){
                    checkID=true;
                    break;
                } 
            }
            if(!checkID){
                eList[next]=e;
                next++;
                break;
            }
            System.out.println("ID không được trùng !!! Xin vui lòng nhập lại !!!");
        }
    }
    
    void display(){
        if(next==0){
            System.out.println("Hệ thống chưa có dữ liệu");
            return;
        }
        System.out.println("\n>>Danh sách Employee<<");
        for(int i=0;i<next;i++){
            System.out.println(eList[i]);
        }
    }
    
    void display(String eName){
        if(next==0){
            System.out.println("Hệ thống chưa có dữ liệu");
            return;
        }        
        int cntName=0;
        for(int i=0;i<next;i++){
            if(eList[i].name.toLowerCase().contains(eName.toLowerCase())){                
                eList[i].prinInfo(); 
                cntName++;
            }
        }
        if(cntName==0){
            System.out.println("\nHệ thống không tìm thấy nhân viên tên "+eName);
        }
        else{
            System.out.println("\nHệ thống tìm thấy "+cntName+" nhân viên có tên "+eName);
        }
    }
    
    void remove(String eID){
        if(next==0){
            System.out.println("Hệ thống chưa có dữ liệu");
            return;
        }
        int cntID=0;
        for(int i=0;i<next;i++){
            if(eList[i].id.equalsIgnoreCase(eID)){
                for(int k=i;k<next-1;k++){
                    eList[k]=eList[k+1];                    
                }
                cntID++;
                next--;
            }            
        }
        if(cntID==0){
            System.out.println("\nHệ thống không tìm thấy Employee có ID "+eID);
        }
        else{
            System.out.println("\nHệ thống đã xóa Employee có ID "+eID);
        }
    }
    
    void menu(){
        while(true){
            Scanner sc=new Scanner(System.in);
            String opt="";
            System.out.println(">>MENU<<");
            System.out.println( "1. Add a new employee\n" +
                                "2. Display list of employee\n" +
                                "3. Search employee by name\n" +
                                "4. Remove employee by ID\n" +
                                "5. Exit");
            System.out.println("Vui lòng lựa chọn [1-5]");
            opt=sc.nextLine().trim();
            
            switch(opt){
                case "1":
                    add();
                    break;
                case "2":
                    display();
                    break;
                case "3":
                    String eName;
                    System.out.println("Nhập tên nhân viên cần tím kiếm !!");
                    eName=sc.nextLine().trim();
                    display(eName);
                    break;
                case "4":
                    String eID;
                    System.out.println("Nhập ID nhân viên cần xóa ");
                    eID=sc.nextLine().trim();
                    remove(eID);
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Vui lòng nhập lại lựa chọn [1-5]\n");
            }
        }
    }
    
    public static void main(String[] args) {
        EmployeeTest o=new EmployeeTest();
        o.menu();
    }
    
}
