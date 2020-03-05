/*
- Fields: [max, count] int, tvList – array of Television.
- Default constructor to initialise the all the fields.
- Methods:
- Public void add() - add a new television into array
- Public void searchByBrand() - search televisions belong a brand name accepted by user.
- Public void displayAll() - display all televisions.
- Public void displayHighValue() – display televisions with the price above 500.
 */
package Electronics;
import java.util.*;

public class TelevisionCatalog {
    public int max,count;
    Television[] tvList;

    public TelevisionCatalog() {
        max=10;
        count=0;
        tvList=new Television[max];
    }
    
    public void add(){
        if(count==max){
            System.out.println("Hệ thống đã hết chỗ lưu trữ !! Từ chối thêm mới !!");
            return;
        }
        Television t=new Television();
        t.accept();
        tvList[count]=t;
        count++;
    }
    
    public void searchByBrand(String brand){
        if(count==0){
            System.out.println("Hệ thống chưa có dữ liệu !!");
            return;
        }
        
        int cntBrand=0;
        for(int i=0;i<count;i++){
            if(tvList[i].brand.toLowerCase().contains(brand.toLowerCase())){
                tvList[i].printinfo();
                cntBrand++;
            }
        }
        if(cntBrand==0){
            System.out.println("Hệ thống không tìm thấy mặt hàng có Brand là "+brand);
        }
        else{
            System.out.println("Hệ thống tìm thấy "+cntBrand+" mặt hàng có Brand là "+brand);
        }
    }
    
    public void displayAll(){
        if(count==0){
            System.out.println("Hệ thống chưa có dữ liệu !!");
            return;
        }
        System.out.println(">>Danh sách Television<<");
        for(int i=0;i<count;i++){
            System.out.println(tvList[i].toString());
        }
    }
    
    public void displayHighValue(){
        if(count==0){
            System.out.println("Hệ thống chưa có dữ liệu !!");
            return;
        }
        
        System.out.println(">>Danh sách Television có giá lớn hơn 500<<");
        int cntPrice=0;
        for(int i =0;i<count;i++){
            if(tvList[i].price>500){
               tvList[i].printinfo();
                cntPrice++;
            }        
         }
        if(cntPrice==0){
            System.out.println("Hệ thống không tìm thấy mặt hàng có giá lớn hơn 500");
        }
        else{
            System.out.println("Hệ thống tìm thấy "+cntPrice+" mặt hàng có giá lớn hơn 500");
        }
    
    
    }
}