
package data;

import java.util.Scanner;


public class Computer {
    //Khai báo thuộc tính của 1 computer
    public String id,description;
    public int price;
    
    //Hàm dựng không tham số - Default constructor
    public Computer() {
        id="C01";
        description="Desktop IBM - 1234";
        price=100;
    }
    
    //Hàm dựng có tham số

    public Computer(String id, String description, int price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }
    
    //Hàm nhập dữ liệu cho 1 máy tính bất kỳ
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("NHập id : ");
        id=sc.nextLine();
        
        System.out.print("Nhập đơn giá : ");
        price = sc.nextInt();
        sc=new Scanner(System.in);
        
        System.out.print("Nhập mô tả : ");
        description = sc.nextLine() ;
        
        
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %d", id,description,price);
    }
    
    
}
