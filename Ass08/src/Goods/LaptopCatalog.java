/*
- Fields: max, cnt, cList – array of laptops No-arg constructor to initialize the all the fields.
- Methods:
- addLaptop() - add a new laptop into array
- search (String laptopName) - search laptops by the name accepted by user.
- displayAll() - display all computers.
- remove(String laptopID): remove laptop by id
 */
package Goods;

import java.util.Scanner;
import Goods.Laptop;

public class LaptopCatalog {
    public int max,cnt;
    Laptop[] cList;

    public LaptopCatalog() {
        max=10;
        cnt=0;
        cList=new Laptop[max];
    }
    
    public void addLaptop(){
        if(cnt==max){
            System.out.println("Hệ thống hết chỗ lưu trữ !! Từ chối thêm mới");
            return;
        }
        
       Laptop l=new Laptop();
       l.accept();
       
       cList[cnt]=l;
       cnt++;     
    }
    
    public void search(String laptopName){
        if(cnt==0){
            System.out.println("Hệ thống chưa có dữ liệu");
            return;
        }
        
        int cntName=0;
        for(int i=0;i<cnt;i++){
            if(cList[i].name.toLowerCase().contains(laptopName.toLowerCase())){
                Laptop l=new Laptop();
                l.printinfo();
                cntName++;
            }
        }
        if(cntName==0){
            System.out.println("Hệ thống không tìm thấy Laptop có tên "+laptopName);
        }
        else{
            System.out.printf("Hệ thống tim thấy %d có tên là %s\n",cntName,laptopName);
        }
    }
    
    public void displayAll(){
        if(cnt==0){
            System.out.println("Hệ thống chưa có dữ liệu");
            return;
        }
        
        System.out.println(">>Danh sách LAPTOP<<");
        for(int i=0;i<cnt;i++){
            System.out.println(cList[i].toString());
        }
    }
    
    public void remove(String LaptopID){
        if(cnt==0){
            System.out.println("Hệ thống chưa có dữ liệu");
            return;
        }
        
        int cntID=0;
        for(int i=0;i<cnt;i++){
            if(cList[i].ID.equalsIgnoreCase(LaptopID)){
                cntID++;
                for(int k=i;k<cnt;k++){
                    cList[k]=cList[k+1];                            
                }
                cnt--;
            }
        }
        
        if(cntID==0){
            System.out.println("Hệ thống không tìm thấy Laptop có ID là "+LaptopID);
        }
        else{
            System.out.println("Hệ thống đã xóa "+cntID+" Laptop có ID là "+LaptopID);
        }
    }
    
    
}
