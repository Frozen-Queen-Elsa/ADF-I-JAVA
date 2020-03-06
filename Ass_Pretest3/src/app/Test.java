/*
Fields:
- StudentFPT[ ] arr: store array of the students
- max: the maximum of the number of students in the array.
- next: the actual number of students in the array.
Methods:
- add(): create a new studentFPT and then save into the array. However, if the array is full, display an error message.
- displayAll(): list all students
- displayPass(): display list of the students passed the examinations (each mark must be greater than 40 and final mark >=50 )
- displayTop1(): display list of the students had the highest score.
- main(): to invoke above functions through a menu system.
Use the switch-case and loop statements to displays a following menu.
1. Add new student
2. Display all students
3. Display students passed the examinations
4. Display Top 1 Students
5. Exit
 */
package app;

import basic.*;
import java.util.*;

public class Test {
    int max=10,next=0;
    StudentFPT[] arr=new StudentFPT[max];

    public Test() {        
    }
    
    void add(){
        if(next==max){
            System.out.println("Hệ thống hết chỗ lưu dữ liệu !!! từ chối thêm mới ");
            return;
        }        
        
        while(true){
            StudentFPT fpt=new StudentFPT();
            fpt.input();
            boolean checkID=false;
            for(int i=0;i<next;i++){
                if(arr[i].getid().equalsIgnoreCase(fpt.getid())){
                    checkID=true;
                    break;
                } 
            }
            if(!checkID){
                arr[next]=fpt;
                next++;
                break;
            }
            System.out.println("ID không được trùng !!! Xin vui lòng nhập lại !!!");
        }
        
    }
    
    void displayAll(){
        if(next==0){
            System.out.println("Hệ thống chưa có dữ liệu !!");
            return;
        }
        
        System.out.println(">>Danh sách sinh viên FPT<<");
        for(int i=0;i<next;i++){
            System.out.println(arr[i]);
        }
    }
    
    void displayPass(){
        if(next==0){
            System.out.println("Hệ thống chưa có dữ liệu !!");
            return;
        }
        
        int cntFinal=0;
        System.out.println(">>Danh sách sinh viên FPT thi đậu<<");
        for(int i=0;i<next;i++){
            if(arr[i].getFinal()>=50&&arr[i].theoryMark>=40&&arr[i].practiceMark>=40&&arr[i].project>=40){
                arr[i].print();
                cntFinal++;
            }
        }
        if(cntFinal==0){
            System.out.println("Không có sinh viên nào thi đậu !!");
        }
        else{
            System.out.println("Có tổng cộng "+cntFinal+" sinh viên thi đậu !!");
        }
    }
    
    void displayTop1(){
        if(next==0){
            System.out.println("Hệ thống chưa có dữ liệu !!");
            return;
        }
        
        float top1=0,cntmark=0;
        System.out.println(">>Danh sách sinh viên FPT có điểm cao nhất<<");
        for(int i=0;i<next;i++){
            top1 = (top1>arr[i].getFinal()?top1:arr[i].getFinal());
        }
        for(int i=0;i<next;i++){
            if(arr[i].getFinal()==top1){
                cntmark++;
                arr[i].print();
            }
        }        
    }
    
    void menu(){
        while(true){
            Scanner sc=new Scanner(System.in);
            String opt="";
            
            System.out.println("\n>>MENU<<");
            System.out.println( "1. Add new student\n" +
                                "2. Display all students\n" +
                                "3. Display students passed the examinations\n" +
                                "4. Display Top 1 Students\n" +
                                "5. Exit");
            System.out.println("Vui lòng lựa chọn [1-5]");
            opt=sc.nextLine().trim();
            
            switch(opt){
                case "1":
                    add();
                    break;
                case "2":
                    displayAll();
                    break;
                case "3":
                    displayPass();
                    break;
                case "4":
                    displayTop1();
                    break;
                case "5":
                    return;
                case "6":
                    for(int i=0;i<next;i++){
                        System.out.println("arr[i].getAge()"); 
                    }
                    break;
                default:
                    System.out.println("Vụi lòng nhập lại lựa chọn [1-5]");
            }
        }
    }
    
    public static void main(String[] args) {
        Test o=new Test();
        o.menu();
        
        
    }
    
}
