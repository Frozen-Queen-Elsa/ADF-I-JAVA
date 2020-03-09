
package product;


import java.util.Scanner;


public class Invoice {
    
    int maxitem=10,nextItem=0;
    Item[] arrItem=new Item[maxitem];

    public Invoice() {
    }
    
    public void addItem(){
        if(nextItem==maxitem){
            System.out.println("Hệ thống hết chỗ lưu dữ liệu !! Từ chối thêm mới !!");
            return;
        }
        
        Item i=new Item();
        i.input();
        arrItem[nextItem]=i;
        nextItem++;
    }
    
    public void serchItem(String sName){
        if(nextItem==0){
            System.out.println("Hệ thống chưa có dữ liệu !!");
            return;
        }
        
        int cntName=0;
        for(int i=0;i<nextItem;i++){
            if(arrItem[i].name.toLowerCase().contains(sName.toLowerCase())){
                arrItem[i].diplayDetail();
                cntName++;
            }
        }
        if(cntName==0){
            System.out.println("No item to display");
        }
        else{
            System.out.println("Hệ thống tìm thấy "+cntName+" item có tên "+sName);
        }
    }
    public void displayAll(){
        if(nextItem==0){
            System.out.println("Hệ thống chưa có dữ liệu !!");
            return;
        }
        for(int i=0;i<nextItem;i++){
            arrItem[i].diplayDetail();
        }
    }
}
