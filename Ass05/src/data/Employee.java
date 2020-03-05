/*
Tạo Java Class Employee để mô tả cấu trúc 1 nhân viên như sau:
i. Dữ liệu (fields – variable): id, name, position, baseSalary (100- 2000USD)
ii. Hàm dựng (constructors):
1. Không tham số Employee()
2. Có tham số Employee(String, String, String, int)
iii. Phương thức:
1. void input() : nhập dữ liệu cho các thuộc tính của nhân viên
2. void print() : xuất thông tin chi tiết của đối tượng nhân viên

 */
package data;

import java.util.*;

public class Employee {
    public String id,name,position;
    public int baseSalary;

    public Employee() {
    }

    public Employee(String id, String name, String position, int baseSalary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.baseSalary = baseSalary;
    }
    
   public void input(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhập ID : "); id=sc.nextLine().trim();
       System.out.println("Nhập name : "); name=sc.nextLine().trim();
       System.out.println("Nhập position : "); position=sc.nextLine().trim();
       while(true){
           System.out.println("Nhập baseSalary [100-2000]: "); 
           baseSalary=sc.nextInt();
           if(baseSalary>=100 && baseSalary<=2000){
               break;
           }
           System.out.println("Xin vui long nhập lại ! baseSalary trong khoảng [100=2000]");
       }       
   }
   
   public void print(){
       System.out.println(">>Thông tin Employee<<");
       System.out.println("ID : "+id);
       System.out.println("Name : "+name);
       System.out.println("Position : "+position);
       System.out.println("Base Salary : "+baseSalary); 
       System.out.println("");
   }

    @Override
    public String toString() {
        return String.format("%s - %s - %s -%d",id,name,position,baseSalary);
    }
   
   
}
