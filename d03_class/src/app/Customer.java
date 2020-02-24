/*
    Lớp mô tả thong tin của 1 khách hàng, bao gồm
    Thuộc tính : mã só, tên,email,năm sinh,giới tính
    Phương thức xử lý : Nhập dữ liệu, xuát dữ liệu
 */
package app;

import java.util.Scanner;

/**
 *
 * @author Iris
 */
public class Customer {

    //Khai báo các thuộc tính
    public String id,name,email;
    public int yob;
    public boolean gender;
    
    //Hàm dựng không tham số

    public Customer() 
    {
        id="C00";
        name="Vô Danh Tiểu Tốt";
        email="Không Không Thấy";
        yob=2010;
        gender=true;
    }

    public Customer(String id, String name, String email, int yob, boolean gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.yob = yob;
        this.gender = gender;
    }
    
    
    
    //Phương thức xử lý nhập thông tin khách hàng
    public void accept()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập thông tin khách hàng ");
        System.out.print("Nhập mã số: ");
        id=sc.nextLine();
        System.out.print("Nhập họ tên: ");
        name=sc.nextLine();
        System.out.print("Nhập email: ");
        email=sc.nextLine();
        
        //Nhập năm sinh [1900-2015]
        while(true)
        {
            System.out.print("Nhập năm sinh [1900-2015] : ");
            yob=sc.nextInt();
            if(yob>=1900 && yob<=2015)
            {
                break;
            }
            System.out.println("Năm sinh không hợp lệ ! Vui lòng nhập lại");
        }
        
        sc=new Scanner(System.in);
        //Nhập giới tính [Nam/Nữ]
        while(true)
        {
            System.out.print("Nhập giới tính[nam/nu] : ");
            String s=sc.nextLine().trim().toLowerCase();
            if(s.equals("nam")||s.equals("nu"))
            {
                gender=s.equals("nam");
                break;
            }
            System.out.println("Giói tính không hợp lệ");
        }
    }
    
    
    //Phương thức xuất thông tin khách hàng
    public void display()
    {
        System.out.println("\n>>Thông tin chi tiết của khách hàng <<");
        System.out.println("Mã số : "+id);
        System.out.println("Tên : "+name);
        System.out.println("Email : "+email);
        System.out.printf("Năm Sinh : %d - Tuổi : %d\n",yob,2020-yob);      
        System.out.printf("Giới tính : %s\n", gender?"nam":"nu");
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
