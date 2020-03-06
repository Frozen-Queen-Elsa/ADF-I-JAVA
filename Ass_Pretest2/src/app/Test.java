/*
- Fields: max, next – cList (array of cylinders)
- Methods:
- void add() - add a new cylinder
- void display() - display all cylinders.
- void display( float v ) - display cylinder having volume greater than v.
- void menu() - allows to manage the list of cylinders through the menu system as follows.
1. Add a new cylinder
2. Display all cylinders
3. Display all cylinders having required volume
4. Exit
 */
package app;

import data.*;
import java.util.*;

public class Test {
    int max=10,next=0;
    Cylinder[] cList=new Cylinder[max];

    public Test() {
    }
    
    
    void add(){
        if(next==max){
            System.out.println("Hệ thống hết chỗ lưu trữ !! ");
            return;
        }
                      
        Cylinder c=new Cylinder();
        c.accept();
        
        cList[next]=c;
        next++;
    }
    
    void display(){
        if(next==0){
            System.out.println("Hệ thống chưa có dữ liệu !!!");
            return;
        }
        
        System.out.println("\n>>Danh sách các Cylinder<<");
        for(int i=0;i<next;i++){
            System.out.println(cList[i]);
        }
    }
    
    void display(float v){
        if(next==0){
            System.out.println("Hệ thống chưa có dữ liệu !!!");
            return;
        }
        
        int cntV=0;
        
        for(int i=0;i<next;i++){
            if(cList[i].volume()==v){
                cList[i].printinfo();
                cntV++;
            }
        }
        if(cntV==0){
            System.out.println("Hệ thống không tìm thấy Cylinder có volume > "+v);
        }
        else{
            System.out.println("Hệ thống tìm thấy "+cntV+" Cylinder có volume > "+v);
        }
    }
    
    void menu(){
        Cylinder c=new Cylinder();
        while(true){
            Scanner sc=new Scanner(System.in);
            String opt="";
            
            System.out.println("\n>>MENU<<");
            System.out.println( "1. Add a new cylinder\n" +
                                "2. Display all cylinders\n" +
                                "3. Display all cylinders having required volume\n" +
                                "4. Exit");
            System.out.println("Vui lòng lựa chọn [1-4]");
            opt=sc.nextLine().trim();
            
            switch(opt){
                case "1":
                    add();
                    break;
                case "2":
                    display();
                    break;
                case "3":
                    float v;
                    System.out.println("Nhập thể tích :");
                    v=sc.nextFloat();
                    display(v);
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Vui lòng nhập lại lựa chọn [1-4]");
                    break;
            }
        }
    }
    
    public static void main(String[] args) {
        Test o=new Test();
        o.menu();
    }
}
