/*
i. Fields : max, count và mảng ds chứa các đối tượng Student
ii. Constructors: no-arg
iii. Methods:
1. void add() : thêm sinh viên mới
2. void display(): xuất ds Sinh viên – gọi method print() của class Student 3. void display(int m): hiển thị ds sinh viên có điểm trung bình trên mức điểm m (ví dụ display(40) : in ds các sv có điểm tb trên 40) 4. void display(String stName): hiển thị ds sinh viên có tên được truyền bởi tham số stName
5. void menu()
6. static void main(String[] arg)
 */
package ui;

import data.*;
import java.util.*;

public class StudentTest {

    int max=10;
    int index=0;
    Student[] stuList =new Student[max];
    
   public void add(){
       if(index==max){
           System.out.println("Hệ thống hết chỗ trống để lưu dữ liệu !! Từ chối thêm mới");
           return;
       }
       Student s=new Student();
       s.input();
       
       stuList[index]=s;
       index++;
   }
   
   public void display(){
       if(index==0){
           System.out.println("Hệ thống chưa có dữ liệu !!");
           return;
       }
       
       System.out.println("Danh sách sinh viên");
       for(int i=0;i<index;i++){
           System.out.println(stuList[i].toString());
       }
   }
   
   public void display(int m){
       if(index==0){
           System.out.println("Hệ thống chưa có dữ liệu !!");
           return;
       }
       
       int cntAvg=0;
       System.out.printf("Danh sách sinh viên có điểm trung bình lớn hơn %d\n",m);
       for(int i=0;i<index;i++){
           if(stuList[i].getAverage()>m){
               System.out.println(stuList[i].toString());
               cntAvg++;
           }
       }//Kết thúc for
       
       if(cntAvg==0){
           System.out.println("Hệ thống không tìm thấy sinh viên có điểm trung bình lớn hơn "+m);
       }
       else{
           System.out.println("Hệ thống tìm thấy "+cntAvg+" sinh viên có điểm trung bình lớn hơn "+m);
       }
   }
   
   public void display(String stName){
       if(index==0){
           System.out.println("Hệ thống chưa có dữ liệu !!");
           return;
       }
       
       int cntName=0;
       System.out.printf("Danh sách sinh viên có tên %s\n",stName);
       for(int i=0;i<index;i++){
           if(stuList[i].name.toLowerCase().contains(stName.toLowerCase())){
               System.out.println(stuList[i].toString());
               cntName++;
           }
       }//Kết thúc for
       
       if(cntName==0){
           System.out.println("Hệ thống không tìm thấy sinh viên có tên "+stName);
       }
       else{
           System.out.println("Hệ thống tìm thấy "+cntName+" sinh viên có tên "+stName);
       }
   }
   
   public void menu(){
       while(true){
           Scanner sc=new Scanner(System.in);
           String opt="";
           System.out.println("\n>>MENU<<");
           System.out.println("1. Nhập dữ liệu Sinh viên");
           System.out.println("2, Hiển thị danh sách sinh viên");
           System.out.println("3. Tìm kiếm sinh viên theo điểm trung bình");
           System.out.println("4. Tìm kiếm sinh viên theo tên");
           System.out.println("5. Thoát");
           System.out.println("Vui lòng nhập lựa chọn [1-5");
           opt=sc.nextLine().trim();
           
           switch(opt){
               case "1":
                   add();
                   break;
               case "2":
                   display();
                   break;
              case "3":
                  int m;
                  System.out.println("Nhập điểm trung bình :");
                  m=sc.nextInt();
                  display(m);
                  break;
              case "4":
                  String stName;
                  System.out.println("Nhập tên sinh viên cần tìm kiếm");
                  stName=sc.nextLine().trim();
                  display(stName);
                  break;
              case "5":
                  return;
              default:
                  System.out.println("Xin vui lòng nhập lại [1-5");
           }
           
       }
   }
   
   public static void main(String[] args) {
        StudentTest o=new StudentTest();
        o.menu();
   }
    
}
