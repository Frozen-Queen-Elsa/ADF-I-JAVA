/*
Tạo Java Main Class EmployeeTest (EmployeeTest.java) thực hiện chức năng quản lý danh sách nhân viên :
i. Dữ liệu (fields – variable): empList ( là 1 ArrayList chứa các đối tượng nhân viên),
ii. Hàm dựng không tham số: khởi tạo empList
iii. Phương thức (Methods):
1. void add(): thêm 1 nhân viên mới vô danh sách ds. Lưu ý: kiểm tra nếu mã số bị trùng sẽ báo lỗi và từ chối thêm mới.
2. void display(): In toàn bộ bảng danh sách nhân viên, và in thông báo lỗi nếu hệ thống chưa có dữ liệu
3. void display(int amt): In bảng danh sách nhân viên có mức lương trên amt USD. Chương trình sẽ in thông báo lỗi nếu hệ thống chưa có dữ liệu hoặc không tìm thấy nhân viên nào có mức lương trên amt USD
4. void display(String empName): Tìm và in ra bảng danh sách các nhân viên có tên chứa chuỗi empName. Chương trình sẽ in thông báo lỗi nếu hệ thống chưa có dữ liệu hoặc không tìm thấy nhân viên nào theo yêu cầu trên.
5. void menu(): xây dựng hệ thống thực đơn cho phép thêm, tìm kiếm và in danh sách các nhân viên theo yêu cầu nói trên.
6. static void main (): tạo 1 đối tượng kiểu EmployeeTest, gọi phương thức menu() trên đối tượng này để thi hành chương trình.
 */
package demo;

import java.util.*;
import data.Employee;

public class EmployeeTest {
    
        int max=10;
        int index=0;
        Employee[] emplist=new Employee[max];
   
    public void add(){
        if(index==max){
            System.out.println("Hệ thống hết chỗ lưu trữ . Từ chối thêm CD mới");
            return;
        }
        Employee e=new Employee();
        e.input();
        
        emplist[index]=e;
        index++;
    }
    
    public void display(){
        if(index==0){
            System.out.println("Hệ thống chưa có dữ liệu !!");
            return;
        }    
               
        for(int i=1;i<index;i++){
            System.out.println(emplist[i].toString());
        }
    }
    
    public void display(int amt){
        if(index==0){
            System.out.println("Hệ thống chưa có dữ liệu !!");
            return;
        }   
        
        int cntUSD=0;
        for(int i=0;i<index;i++){
            if(emplist[i].baseSalary>amt){
                emplist[i].print();
                cntUSD++;
            }                                 
        }
        if(cntUSD==0){
                System.out.printf("Hệ thống không tìm thấy nhân viên có lương lớn hơn %d USD\n",amt);
            }
            else{
                System.out.printf("Hệ thống tim thấy %d nhân viên có lương lớn hơn %d USD\n",cntUSD,amt);
            }
    }
    
    public void display(String empName){
        if(index==0){
            System.out.println("Hệ thống chưa có dữ liệu !!");
            return;
        }   
        
        int cntName=0;
        for(int i=0;i<index;i++){
            if(emplist[i].name.contains(empName)){
                emplist[i].print();
                cntName++;                
            }
        }    
            if(cntName==0){
                System.out.printf("Hệ thống không tìm thấy nhân viên có tên %s\n",empName);
            }
            else{
                System.out.printf("Hệ thống tim thấy %d nhân viên có tên %s\n",cntName,empName);
            }
        
    }
    
    
    public void menu(){
        while(true){
            Scanner sc=new Scanner(System.in);
            String opt="";
            
            System.out.println("\n>>MENU<<");
            System.out.println("1. Thêm Employee");
            System.out.println("2. Hiển thị toàn bộ danh sách Employee");
            System.out.println("3. Tìm kiếm danh sách nhân viên theo lương");
            System.out.println("4. Tìm kiếm danh sách nhân viên theo tên");
            System.out.println("5. Thoát");
            System.out.println("Chọn các số theo mong muốn của bạn [1-5]");
            opt=sc.nextLine().trim();

            switch(opt){
                case"1":
                    add();
                    break;
                case "2":
                    display();
                    break;
                case "3":
                    int amt;
                    System.out.println("Nhập lương ");
                    amt=sc.nextInt();
                    display(amt);
                    break;
                case "4":
                    String empName;
                    System.out.println("Nhập tên nhân viên cần kiếm");
                    empName=sc.nextLine().trim();
                    display(empName);
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Vui lòng nhập lại lựa chọn [1-5]");
            }
        }
        
    }
    
    public static void main(String[] args) {
        EmployeeTest o=new EmployeeTest();
        o.menu();
    }
    
    
}
