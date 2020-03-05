/*
- Fields: cList – array of customers, count – the number of customers stored in array.
- No-agr constructor to initialize the all the fields.
- Methods:
- add() - add a new customer into array
- searchByName(String name) - search customers having name passed by user.
- displayAll() - display all customers.
 */
package data;

import java.util.Scanner;


public class CustomerCatalog {
    int max=10;
    int index=0;
    Customer[] cList =new Customer[max];

    public CustomerCatalog() {
    }
    
    public void add(){
        Scanner sc=new Scanner(System.in);
        if(index==max){
            System.out.println("Hệ thống hết chỗ lưu dữ liệu !! Từ chối thêm mới !!");
            return;
        }
        Customer c=new Customer();
        c.accept();
        cList[index]=c;
        index++;
    }
    
    public void searchByName(String Name){
        if(index==0){
            System.out.println("Hệ thống chưa có dữ liệu");
            return;
        }
        int cntName=0;
        for(int i=0;i<index;i++){
            if(cList[i].name.toLowerCase().contains(Name.toLowerCase())){
                System.out.println(cList[i]);
                cntName++;
            }
        }
        if(cntName==0){
            System.out.println("Hệ thống không tìm thấy customer có tên "+Name);
        }
        else{
            System.out.println("Hệ thống tìm thấy "+cntName+" customer có tên "+Name);
        }
    }
    
    public void displayAll(){
        if(index==0){
            System.out.println("Hệ thống chưa có dữ liệu");
            return;
        }
        System.out.println(">>Danh sách Customer<<");
        for(int i=0;i<index;i++){
            System.out.println(cList[i]);
        }
    }
}
