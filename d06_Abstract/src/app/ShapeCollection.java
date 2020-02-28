/*
    Quản lý danh sách các đối tượng hình học : hình tròn, hình chữ nhật
    Bao gồm chức năng: 
        Thêm đối tượng hình học mới vô danh sách
        Liệt kê danh sach
        Tìm kiếm
        ...
 */
package app;

import basic.*;
import java.util.Scanner;

public class ShapeCollection {
    public int max=10;
    public int index=0;
    Shape[]  ds=new Shape[max];
    
    //Hàm thêm 1 đối tượng hình chữ nhật vô danh sách
    public void addRectangle(){
        //KIểm tra mảng dách có còn chõ trống?
        if(index==max){
            System.out.println("Hệ thống hết chỗ lưu trữ. Từ chối thêm mới");
            return;  //Kết thúc hàm
        }
        
        Rectangle r=new Rectangle();
        r.input();
        
        ds[index]=r;
        index++;
    }
    
    //Hàm thêm 1 đối tượng hình tròn vô danh sách
    public void addCircle(){
        //KIểm tra mảng dách có còn chõ trống?
        if(index==max){
            System.out.println("Hệ thống hết chỗ lưu trữ. Từ chối thêm mới");
            return;  //Kết thúc hàm
        }
        
        Circle r=new Circle();
        r.input();
        
        ds[index++]=r;
        
    }
    
    
    //Hàm in ra tất cả đối tượng hình học(tròn/chữ nhật) vô danh sách
    public void display(){
        //Kiểm tra danh sách có dữ liệu hay không ?
        if(index==0){
            System.out.println("Hệ thống chưa có dữ liệu");
            return;
        }        
        
        //In ra tất cả các đối tượng hình học hiện có trong mảng ds
        for(int i=0;i<index;i++){
            System.out.println(ds[i]);
        }
    }
    
    
    //In danh sách các hình có diện tích >=50
    public void display50(){
        
    }
    
    //In danh sách các hình tròn
    public void displayCircle(){
        
    }
}
