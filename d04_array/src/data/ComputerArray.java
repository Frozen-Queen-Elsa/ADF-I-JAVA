/*
    Quản lý danh sách các Computer trong 1 mảng
    bao gồm các chức năng thêm và duyệt danh sách
 */
package data;

import java.util.Scanner;

/**
 *
 * @author Iris
 */
public class ComputerArray {

    Computer[] ds;
    int max=10;
    int index=0;
    public ComputerArray(){
        ds=new Computer[max];
    }
    void addNewComputer(){
        //Kiểm tra xem mảng danh sach còn chỗ lưu trữ hay không ?
        if(index==max){
            System.out.println("Danh sách không còn chỡ lưu trữ. Từ chối thêm mới");
            return;   //Kết thúc hàm
        }
        
        Computer c=new Computer();
        c.input();
        
        //Đưa máy tính mới tạo vào bên trong mảng ds
        ds[index]=c;
        
        //Cập nhật lại biến index
        index++;
    }
    
    void displayAll(){
        //Kiểm tra danh sách có dữ liệu hay không ?
        if(index==0){
            System.out.println("Hệ thống chưa có dữ liệu");
            return;
        }
        
        //In ra tất cả các máy tính hiện có trong mảng ds
        for(int i=0; i<index; i++){
            System.out.println(ds[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String op="";
        ComputerArray o=new ComputerArray();
        
        //menu
        while(true){
            System.out.println("\n MENU");
            System.out.println("1. Thêm máy tính mới");
            System.out.println("2. Xem danh sách máy tính mới");
            System.out.println("3. Thoát");
            System.out.print("Vui lòng chọn chức nang [1-3] : ");
            op=sc.nextLine().trim();
            
            switch(op){
                case "1":
                    o.addNewComputer();
                    break;
                case "2":
                    o.displayAll();
                    break;
                case "3":
                    return;
                default :
                    System.out.println("Chọn sai chức năng");
                    break;   
            }
        }
    }
    
}
