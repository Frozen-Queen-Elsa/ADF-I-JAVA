
package app;

import java.util.*;
import data.*;

/*
    Quản lý danh sách máy tính trong ArrayList bao gồm chức năng : thêm , duyệt, tìm kiếm,xóa
*/
public class ComputerArrayList {
    ArrayList<Computer> ds=new ArrayList<>();
    
     
    void addNewComputer(){
                
        Computer c=new Computer();
        c.input();
        
        //Đưa máy tính mới tạo vào ArrayList ds
        ds.add(c);
    }
    
     //Duyệt danh sách máy tính
    void displayAll(){
        //Kiểm tra danh sách có dữ liệu hay không ?
        if(ds.size()==0){
            System.out.println("Hệ thống chưa có dữ liệu");
            return;
        }
        
        //In ra tất cả các máy tính hiện có trong mảng ds
        for(int i=0; i<ds.size(); i++){
            System.out.println(ds.get(i));
        }
    }
    
    //Tìm kiếm 1 máy tính theo mổ tả
    void display(String mota){
        //Kiểm tra danh sách có dữ liệu hay không ?
        if(ds.isEmpty()){
            System.out.println("Hệ thống chưa có dữ liệu");
            return;
        }
        
        //In ra tất cả các máy tính hiện có mô tả như yêu cầu
        int countMoTa=0;
        for(int i=0; i<ds.size(); i++){
            if(ds.get(i).description.contains(mota)){
                System.out.println(ds.get(i));
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
        if(ds.isEmpty()){
            System.out.println("Hệ thống chưa có dữ liệu");
            return;
        }
        
        //Tìm máy tính có mã số muốn xóa trong danh sách
        int countMaSo=0;
        for(int i=0; i<ds.size(); i++){
            if(ds.get(i).id.equals(ms)){
                countMaSo++;
                
               ds.remove(i);
               break;
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
}
