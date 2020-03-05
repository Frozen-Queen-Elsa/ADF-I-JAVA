/*
- Fields: eList – array list of employees,
- No-arg constructor to initialize the all the fields.
- Methods:
- addWorker() - add a new worker
- addEngineer() - add a new engineer
- display() - display all employees.
- display(boolean isWorker) – display a list of workers if isWorker is true, otherwise display a list of all engineers – (Hint – using instanceof operator)
- display(string name) - search and display the pay slip of employees having name accepted by user.
 */
package data;

import java.util.*;
public class EmployeeCatalog {
    int max=10,index=0;
    Employee[] eList=new Employee[max];

    public EmployeeCatalog() {
    }
    
    public void addWorker(){
        if(index==max){
            System.out.println("Hệ thống hết chỗ chứa dữ liệu !! Từ chối thêm mới !!");
            return;
        }
        //CheckID
        while(true){
            Worker w= new Worker();
            w.accept();
            boolean checkID=false;
            for(int i=0;i<index;i++){
                if(w.ID.equalsIgnoreCase(eList[i].ID)){
                    checkID=true;
                }
            }
            if(checkID==false){
                eList[index]=w;
                index++;
                break;
            }
            System.out.println("Bạn đã nhập trùng ID");
        }
        
    }
    
    public void addEngineer(){
        if(index==max){
            System.out.println("Hệ thống hết chỗ chứa dữ liệu !! Từ chối thêm mới !!");
            return;
        }
        //CheckID
        while(true){
            Engineer e= new Engineer();
            e.accept();
            boolean checkID=false;
            for(int i=0;i<index;i++){
                if(e.ID.equalsIgnoreCase(eList[i].ID)){
                    checkID=true;
                }
            }
            if(checkID==false){
                eList[index]=e;
                index++;
                break;
            }
            System.out.println("Bạn đã nhập trùng ID");
        }
    }
    
    public void display(){
        if(index==0){
            System.out.println("Hệ thông chưa có dữ liệu");
        }
        System.out.println("\n>>Danh sách Employee<<");
        for(int i=0;i<index;i++){
            System.out.println(eList[i].toString());
        }
    }
    
    public void display(boolean checkWorker){
        if(index==0){
            System.out.println("Hệ thông chưa có dữ liệu");
        }
        //Kiểm tra cần in danh sách Worker hay Engineer (true=worket,false=engineer)
        if(checkWorker==true){
            System.out.println("\n>>Danh sách Worker<<");
            for(int i=0;i<index;i++){
                if(eList[i] instanceof Worker){
                    System.out.println(eList[i].toString());
                }
            }
        }
        else{
            System.out.println("\n>>Danh sách Engineer<<");
            for(int i=0;i<index;i++){
                if(eList[i] instanceof Engineer){
                    System.out.println(eList[i].toString());
                }
            }
        }
    }
    
    public void display(String Name){
        if(index==0){
            System.out.println("Hệ thông chưa có dữ liệu");
        }
        int cntName=0;
        for(int i=0;i<index;i++){
            if(eList[i].name.toLowerCase().contains(Name.toLowerCase())){
                if(eList[i] instanceof Worker){
                    eList[i].printinfo();
                }
                else{
                    eList[i].printinfo();
                }
                cntName++;
            }
        }
        if(cntName==0){
            System.out.println("Hệ thống không kiếm được nhân viên có tên "+Name);
        }
        else{
            System.out.println("Hệ thống kiếm được "+cntName+" nhân viên có tên "+Name);
        }
    }
}
