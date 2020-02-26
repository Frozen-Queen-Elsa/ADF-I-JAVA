/*
    Quản lý danh sách các Computer trong 1 mảng
    bao gồm các chức năng thêm và duyệt danh sách,tìm kiếm và xóa 1 máy tính bất kỳ
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
    
    
    //Duyệt danh sách máy tính
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
    
    //Tìm kiếm 1 máy tính theo mổ tả
    void display(String mota){
        //Kiểm tra danh sách có dữ liệu hay không ?
        if(index==0){
            System.out.println("Hệ thống chưa có dữ liệu");
            return;
        }
        
        //In ra tất cả các máy tính hiện có mô tả như yêu cầu
        int countMoTa=0;
        for(int i=0; i<index; i++){
            if(ds[i].description.contains(mota)){
                System.out.println(ds[i]);
                countMoTa++;
            }                
        }//Kết thúc vòng lặp for
        
        //Kiểm tra có bao nhiêu máy tính phù hợp yêu cầu
        if(countMoTa==0){
            System.out.println("Không tìm thấy máy tính có mô tả như yêu cầu");
        }
        else{
            System.out.printf("\nCó %d máy tính có mô tả như yêu cầu\n",countMoTa);
        }
    }
    
    //Hàm xóa 1 máy tính theo mã số được cung cấp
    void remove(String ms){
        //Kiểm tra danh sách có dữ liệu hay không ?
        if(index==0){
            System.out.println("Hệ thống chưa có dữ liệu");
            return;
        }
        
        //Tìm máy tính có mã số muốn xóa trong danh sách
        int countMaSo=0;
        for(int i=0; i<index; i++){
            if(ds[i].id.equals(ms)){
                countMaSo++;
                
                for(int k=i;k<index-1;k++){
                    ds[k]=ds[k+1];
                }//Kết thúc for remove
                
                //Cập nhật lại biến index
                index--;
            }                
        }//Kết thúc vòng lặp for
        
        //Kiểm tra có bao nhiêu máy tính phù hợp yêu cầu
        if(countMaSo==0){
            System.out.println("Không tìm thấy máy tính có mã số như yêu cầu");
        }
        else{
            System.out.printf("\nĐã xóa máy tính có mã số %s\n",ms);
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
            System.out.println("3. Tìm máy tính theo mô tả");
            System.out.println("4. Xóa máy tính theo mã số");
            System.out.println("5. Thoát");
            System.out.print("Vui lòng chọn chức nang [1-5] : ");
            op=sc.nextLine().trim();
            
            switch(op){
                case "1":
                    o.addNewComputer();
                    break;
                case "2":
                    o.displayAll();
                    break;
                case "3":
                    System.out.print(">>Nhập mô tả :");
                    String s=sc.nextLine();
                    o.display(s);
                    break;
                case "4":
                    System.out.print(">>Nhập mã số :");
                    o.remove(sc.nextLine().trim());
                    break;
                case "5":
                    return;
                default :
                    System.out.println("Chọn sai chức năng");
                    break;   
            }
        }
    }
    
}
